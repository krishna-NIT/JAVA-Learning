package com;

import java.util.*;

public class SnapshotArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        mean(arr);
        median(arr);
        mode(arr);
    }


    public String gcdOfStrings(String str1, String str2) {
        String gcd = "";
        for (int i = str2.length();i>=1;i--){
            String temp = str2.substring(5);
        }
        return gcd;
    }

    public static void mean(int[] arr){
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        float mean = sum/arr.length;
        System.out.println(mean);
    }
    public static void median(int[] arr){
        sortArray(arr);
        if (arr.length %2 ==0){
            int i = arr.length/2;
            float ans = (arr[i]+arr[i-1])/2;
            System.out.println(ans);
        }else {
            int ans = arr[arr.length/2];
            System.out.println(ans);
        }
    }
    public static void mode(int[] arr){
        sortArray(arr);
        LinkedList<Integer> entries = new LinkedList<Integer>();
        LinkedList<Integer> frequency = new LinkedList<Integer>();
        int count = 0;
        int tempvalue = arr[0];
        for (int i = 0; i<arr.length;i++){
            int no = arr[i];
            if (!entries.contains(no)){
                entries.add(no);
                count = 1;
            }else {
                if (no == arr[i-1]){
                    count++;
                }
            }

        }
    }
    public static void sortArray(int[] nums) {
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1 ;j<nums.length;j++){
                int minindex = Integer.MAX_VALUE;
                if (minindex>nums[j]){
                    minindex = j;
                }
                if (nums[minindex]<nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[minindex];
                    nums[minindex] = temp;
                }
            }
        }
    }


    public static int inSequence(int A, int B, int C){
            while (A <= B) {
                if (A == B) {
                    return 1;
                }
                A += C;
            }
        return 0;
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] fin = new int[r][c];
        LinkedList<Integer> lsno = new LinkedList<Integer>();
        for (int i = 0;i<nums.length;i++){
            for (int j = 0;j<nums[0].length;j++){
                lsno.add(nums[i][j]);
            }
        }
        if ((r*c) != lsno.size()){
            return nums;
        }
        int b = 0;
        for (int i = 0;i<r;i++){
            for (int j = 0;j<c;j++){
                fin[i][j] = lsno.get(b);
                b++;
            }
        }
        return fin;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        LinkedList<Character> lschar = new LinkedList<Character>();
        for (int i = 0;i<magazine.length();i++){
            lschar.add(magazine.charAt(i));
        }
        for (int i = 0;i<ransomNote.length();i++){
            char temp = ransomNote.charAt(i);
            if (lschar.contains(temp)){
                int b  =0;
                while (b ==0){
                    for (int j = 0;j<lschar.size();j++){
                        if (temp == lschar.get(i)){
                            lschar.remove(i);
                            b++;
                            break;
                        }
                    }
                }
            }else {
                return false;
            }
        }
        return true;
    }

    // NEWS
    public boolean isPathCrossing(String path) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        int N = 0;
        int E = 0;
        int W = 0;
        int S = 0;
        ls.add(0000);
        for (int i = 0;i<path.length();i++){
            if (path.charAt(i) == 'N'){
                N++;
            }
            if (path.charAt(i) == 'E'){
                E++;
            }
            if (path.charAt(i) == 'W'){
                W++;
            }
            if (path.charAt(i) == 'S'){
                S++;
            }
            int loc = (N*1000)+(E*100)+(W*10)+(S);
            if (!ls.contains(loc)){
                ls.add(loc);
            }else {
                System.out.println(ls);
                return true;
            }
        }
        System.out.println(ls);
        return false;
    }

    public boolean isMonotonic(int[] A) {
        LinkedList<Integer> diff = new LinkedList<Integer>();
        for (int i = 0;i<A.length-1;i++){
            int temp = A[i]-A[i+1];
            if (temp != 0) {
                diff.add(temp);
            }
        }
        if (diff.isEmpty()){
            return true;
        }
        if (diff.get(0)<0){
            for (int i = 1;i<diff.size();i++){
                if (diff.get(i)>0){
                    return false;
                }
            }
        }else {
            for (int i = 1;i<diff.size();i++){
                if (diff.get(i)<0){
                    return false;
                }
            }
        }
        return true;
    }

    public String addStrings(String num1, String num2) {
        int sum = 0;
        int a = 0;
        int b = 0;
        int alen = num1.length();
        int blen = num2.length();

        for (int i = 0;i<num1.length();i++){
            int ascii = (int) num1.charAt(i);
            int tempno = ascii-48;
            a += Math.pow(10,alen-1)*tempno;
            alen--;
        }
        for (int i = 0;i<num2.length();i++){
            int ascii = (int) num2.charAt(i);
            int tempno = ascii-48;
            b += Math.pow(10,blen-1)*tempno;
            blen--;
        }
        System.out.println(a+" "+ b);
        sum = a+b;
        System.out.println(sum);
        String ans = "";
        Stack<Integer> stack = new Stack<Integer>();
        return "asdf";
    }

    public boolean isLongPressedName(String name, String typed) {
        if (typed.length() < name.length()){
            return false;
        }
        LinkedList<Character> namechar = new LinkedList<Character>();
        LinkedList<Character> typedchar = new LinkedList<Character>();

        for (int i = 0;i<name.length();i++){
            namechar.add(name.charAt(i));
        }
        for (int i = 0;i<typed.length();i++){
            typedchar.add(typed.charAt(i));
        }
        int count = -1;
        while (count <= typed.length()){
            if (typedchar.get(0) == namechar.get(0)){
                typedchar.remove(0);
                if (typedchar.isEmpty()){
                    return true;
                }
                if (typedchar.get(0) != namechar.get(0)){
                    namechar.remove(0);
                }
            }
            if (namechar.isEmpty()){
                return true;
            }
            if (typedchar.isEmpty()){
                return false;
            }
            count++;
        }

        if (name.isEmpty()){
            return true;
        }
        return false;
    }

    public int countSegments(String s) {
        if (s.isEmpty()){
            return 0;
        }
        int ans = 1;
        for (int i = 0;i<s.length()-1;i++){
            if (s.charAt(i) != ' ' && s.charAt(i+1) == ' '){
                ans++;
            }
        }
        if (s.charAt(s.length()-1) == ' '){
            ans--;
        }
        return ans;
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        LinkedList<String> lsstring = new LinkedList<String>();
        for (int i = 0;i<words.length;i++){
            String str = words[i];
            if (str.length() == pattern.length()){
                int value = 0;
                for (int j = 0;j<str.length()-1;j++){
                    for (int k = j+1;k<str.length();k++){
                        if (str.charAt(j) == str.charAt(k)){
                            if (pattern.charAt(j) == pattern.charAt(k)){
                            }else {
                                value++;
                            }
                        }else if (pattern.charAt(j) != pattern.charAt(k)){
                        }else {
                            value++;
                        }
                    }
                }
                if (value == 0){
                    lsstring.add(str);
                }
            }
        }
        return lsstring;
    }

    public static void printallsubstring(String str){
        for (int i = 0;i<str.length()-1;i++){
            for (int j = 1;j<str.length();j++){
                System.out.print(str.substring(i,i+j)+" ");
            }
        }
    }

    public String truncateSentence(String s, int k) {
        int count = 1;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i) == ' '){
                count++;
            }
            if (count == k){
                return s.substring(0,i);
            }
        }
        return s;
    }

    public static int rowWithMax1s(int arr[][], int n, int m) {
        int maxln = 0;
        int ans = -1;
        for (int i = 0;i<n;i++){
            int count = 0;
            for (int j = m-1;j>=0;j--){
                if (arr[i][j] == 1){
                    count++;
                }else {
                    break;
                }
            }
            if (maxln<count){
                maxln = count;
                ans = i;
            }
        }
        return ans;
    }

    public static void negtooneside(int[] arr){
        int last = arr.length-1;
        for (int i = 0;i<arr.length && last>=i;i++){
            if (arr[i]<0){
                int temp = arr[last];
                arr[last] = arr[i];
                arr[i] = temp;
                last--;
                i--;
            }
        }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void minmaxarr(int[] arr){
        int min = arr[0];
        int max = arr[0];
            for (int i = 0;i<arr.length;i++){
                if (max<arr[i]){
                    max = arr[i];
                }
                if (min>arr[i]){
                    min = arr[i];
                }
            }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reversearray(int[] arr){
        int last = arr.length-1;
        for (int i = 0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
            last--;
        }
        for (int i = 0;i<arr.length;i++){
            System.out.println();
            System.out.print(arr[i]+" ");
        }
    }

    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        String ans = "";
        int bh = 0;
        for (int i = 0;i<S.length();i++){
            if (indexes[bh] == i){
                int token = 0;
                int lenofword = sources[bh].length();
                int count = 0;
                int mk = i;
                for (int n = 0;n<lenofword;n++){
                    if (mk<S.length() && count<sources[bh].length()) {
                        if (S.charAt(mk) == sources[bh].charAt(count)) {
                            token++;
                        }
                    }
                    mk++;
                    count++;
                }
                if (token == lenofword) {
                    ans += targets[bh];
                    bh++;
                    i += lenofword - 1;
                }
            }else {
                ans += S.charAt(i);
            }
        }
        return ans;
    }

    public String modifyString(String s) {
        String ans = "";
        for (int i = 1;i<s.length()-1;i++){
            if (s.charAt(i) == '?'){
                char forward = s.charAt(i+1);
                char backward = s.charAt(i-1);

            }
        }
        return ans;
    }

    public static void reverseWord(String str)
    {
        String ans = "";
        for (int i = str.length()-1;i>=0;i--){
            ans += str.charAt(i);
        }
    }
    public boolean isValid(String s) {
        LinkedList<Character> ls = new LinkedList<Character>();
        for (int i =0;i<s.length();i++){
            ls.add(s.charAt(i));
        }
        for (int i = 0;i<ls.size();i++){
            char ch = ls.get(i);
            if (ch == '{' || ch == '(' || ch == '['){
            }else {
                if (i == 0){
                    System.out.println(ls);
                    System.out.println("a");
                    return false;
                }
                int backchar = ls.get(i-1);
                if (ch == ']'&& backchar == '['){
                    ls.remove(i);
                    ls.remove(i-1);
                    i--;
                    i--;
                }else if (ch == '}' && backchar == '{'){
                    ls.remove(i);
                    ls.remove(i-1);
                    i--;
                    i--;
                }else if (ch == ')' && backchar == '('){
                    ls.remove(i);
                    ls.remove(i-1);
                    i--;
                    i--;
                }else{
                    System.out.println("b");
                    return false;
                }
            }
        }
        if (ls.size() == 0){
            System.out.println("c");
            return true;
        }
        System.out.println("d");
        return false;
    }

    public boolean checkRecord(String s) {
        int absent = 0;
        int bhagwat = 0;
        int template = 1;
        int present = 0;
        int continousCount = 1;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)=='P'){
                present++;
                continousCount = 0;
            }else if (s.charAt(i) == 'L'){
                if (i>0){
                    if (s.charAt(i-1) == 'L'){
                        continousCount++;
                        if (continousCount>=2){
                            bhagwat = 1;
                        }
                    }
                }
            }else{
                absent++;
                continousCount = 0;
            }
        }
        System.out.println(absent);
        System.out.println(continousCount);
        System.out.println(present);
        if ( absent<2 && bhagwat == 0){
            return true;
        }
        return false;
    }

    public boolean isPerfectSquare(int num) {
        for (int i = 1;i<=num;i++){
            if (i*i == num){
                return true;
            }
        }
        return false;
    }
    public String reformat(String s) {
        LinkedList<Character> lsalpha = new LinkedList<Character>();
        LinkedList<Character> lssymbol = new LinkedList<Character>();

        for (int i = 0;i<s.length();i++){
            int ascii = (int) s.charAt(i);
            if (ascii>=97 && ascii<=122){
                lsalpha.add(s.charAt(i));
            }else {
                lssymbol.add(s.charAt(i));
            }
        }
        System.out.println(lsalpha);
        System.out.println(lssymbol);
        String ans = "";
        if ( lsalpha.size() == lssymbol.size()+1 || lssymbol.size() == lsalpha.size()+1 || lsalpha.size() == lssymbol.size()){
            int len = s.length();
            int j =0;
            for (int i = 0;i<len;i++){
                if (lsalpha.size()<lssymbol.size() && i == 0){
                    ans += lssymbol.getFirst();
                }
                if (j<=lsalpha.size() && j<=lssymbol.size()) {
                    System.out.println(j);
                    if (j<lsalpha.size()) {
                        ans += lsalpha.get(j);
                    }
                    if (j<lssymbol.size() && lsalpha.size()>=lssymbol.size()) {
                        ans += lssymbol.get(j);
                    }

                    if (j<lssymbol.size()-1 && lsalpha.size()<lssymbol.size()) {
                        ans += lssymbol.get(j+1);
                    }
                    j++;
                }
                if (lsalpha.size()>lssymbol.size() && i == len-1){
                    ans += lsalpha.getLast();
                }
            }
            if (lsalpha.size()<lssymbol.size()){
                ans = ans.substring(0,ans.length()-2);
            }
            return ans;
        }else {
            return ans;
        }
    }

    public int[] arrayRankTransform(int[] arr) {
    int[] rank = new int[arr.length];
    int ramk = 1;
    int minindex = 0;
    int tempmin = Integer.MIN_VALUE;
    for (int i = 0;i<rank.length;i++){
        int min = Integer.MAX_VALUE;
        for (int j = 0;j<arr.length;j++){
            if (min>arr[j]){
                min = arr[j];
                minindex = j;
            }
        }
        if (min == tempmin){
            ramk--;
        }
        rank[minindex] = ramk;
        arr[minindex] = Integer.MAX_VALUE;
        ramk++;
        tempmin = min;
    }
    return rank;
    }



    int counter = 0;

    public String entityParser(String text) {
    String ans = "";
        for (int i = 0;i<text.length();i++){
            int temp = -1;
            if (text.charAt(i) == '&'){
                //1
                if (text.substring(i,i+5).equals("&quot")){
                    ans += '"';
                    temp = 5;
                }else if (text.substring(i,i+5).equals("&apos")){
                    ans += '\'';
                    temp = 5;
                }else if (text.substring(i,i+4).equals("&amp")){
                    System.out.println("hello");
                    ans += '&';
                    temp = 4;
                }else if (text.substring(i,i+3).equals("&gt")){
                    ans += '>';
                    temp = 3;
                }else if (text.substring(i,i+3).equals("&lt")){
                    ans += '<';
                    temp = 3;
                }else if (text.substring(i,i+6).equals("&frasl")){
                    ans += '/';
                    temp = 6;
                }
                i = i+temp;
            }else {
                ans += text.charAt(i);
            }
        }
        return ans;
    }

    public boolean find132pattern(int[] nums) {
        for (int i = 0;i<nums.length-2;i++){
            for (int j = i+1;j<nums.length-1;j++){
                for (int k = j+1;k<nums.length;k++){
                    if (nums[i] < nums[k] && nums[k] < nums[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public List<List<Integer>> minimumAbsDifference(int[] arr) {
    int mindis = Integer.MAX_VALUE;
    for (int i =0;i<arr.length-1;i++){
        for (int j = i+1;j<arr.length;j++){
            int diff = Math.abs(arr[i]-arr[j]);
            if (diff<mindis){
                mindis = diff;
            }
        }
    }
    //add
        List<List<Integer>> lspair = new ArrayList<List<Integer>>();
    for (int i =0;i<arr.length-1;i++){
            for (int j = i+1;j<arr.length;j++){
                int diff = Math.abs(arr[i]-arr[j]);
                if (diff==mindis){
                    List<Integer> temp = new ArrayList<Integer>();
                    if (arr[i]<arr[j]) {
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                    }else {
                        temp.add(arr[j]);
                        temp.add(arr[i]);
                    }
                    lspair.add(temp);
                }
            }
    }
    sortlsls(lspair);
    return lspair;
    }
    public void sortlsls(List<List<Integer>> lspair){
        for (int n = lspair.size(); n > 0; n--) {
            for (int i = 0; i < (n - 1); i++) {
                if (lspair.get(i).get(0) > lspair.get(i+1).get(0)) {
                    List<Integer> tempi = lspair.get(i);
                    List<Integer> tempi1 = lspair.get(i+1);
                    lspair.remove(i);
                    lspair.remove(i);
                    lspair.add(i,tempi);
                    lspair.add(i,tempi1);
                }
            }
        }
    }

    public String removeDuplicates(String s, int k) {
        Stack<Character> stack = new Stack<Character>();
        stack.add(s.charAt(0));
        for (int i = 1;i<s.length();i++){
            if (stack.get(stack.size()-1) != s.charAt(i)){
                stack.add(s.charAt(i));
            }
        }
        String ans = "";
        for (int i = 0;i<stack.size();i++){
            ans += stack.get(i);
        }
        return ans;
    }

    public int minEatingSpeed(int[] piles, int h) {
        for (int speed = 1;speed>=0;speed++){
            int hour = 0;
            for (int i = 0;i<piles.length;i++){
                if (piles[i]%speed == 0){
                    hour += piles[i]/speed;
                }else {
                    hour += piles[i]/speed;
                    hour++;
                }
                System.out.println(hour);
                if (hour<=0){
                    speed++;
                    i = -1;
                    hour=0;
                }
            }
            if (hour<=h){
                System.out.println(hour);
                return speed;
            }
        }
        return 0;
    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    int ans = 0;
        for (int i = 0;i<A.length;i++){
            for (int j = 0;j<B.length;j++){
                for (int k = 0;k<C.length;k++){
                    for (int l =0;l<D.length;l++){
                        if (A[i] +B[j] +C[k]+D[l] == 0){
                            ans++;
                        }
                    }
                }
            }
        }
    return ans;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int sum = 0;
        for (int i =0;i<nums.length;i++){
            sum += nums[i];
        }

        for (int i =1;i<=threshold;i++){

        }
        return 0;
    }

    public int findMin(int[] nums) {
        int minno = Integer.MAX_VALUE;
        int minindex = 0;
        for (int i = 0;i<nums.length;i++){
            if (minno<nums[i]){
                minno = nums[i];
                minindex = i;
            }
        }
        return minno;
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] noofsoldier = new int[mat.length];
        int[] rowindex = new int[mat.length];
        for (int i = 0; i < mat[0].length; i++) {
            noofsoldier[i] = nosoldier(mat, i);
            rowindex[i] = i;
        }
        int[] oldnoofsoldier = new int[noofsoldier.length];
        for (int i = 0;i<noofsoldier.length;i++){
            oldnoofsoldier[i] = noofsoldier[i];
        }
        for (int i = 0 ;i<noofsoldier.length;i++){
            System.out.print(noofsoldier[i]+" ");
        }
        System.out.println();
        for (int i = 0 ;i<rowindex.length;i++){
            System.out.print(rowindex[i]+" ");
        }
        System.out.println();
        System.out.println();
        sortArray(noofsoldier);
        for (int i = 0 ;i<noofsoldier.length;i++){
            System.out.print(noofsoldier[i]+" ");
        }
        System.out.println();

        for (int i = 0;i<rowindex.length;i++){
            for (int j = 0;j<oldnoofsoldier.length;j++){
                if (noofsoldier[i] == oldnoofsoldier[j]){
                    rowindex[i] = j;
                    oldnoofsoldier[j] = -1;
                    break;
                }
            }
        }


        for (int i = 0 ;i<rowindex.length;i++){
            System.out.print(rowindex[i]+" ");
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = rowindex[i];
        }
        return ans;
    }
    public int nosoldier(int[][] matrix,int i){
        int count = 0;
        for (int j = 0;j<matrix[0].length;j++){
            if (matrix[i][j] == 1){
                count++;
            }
        }
        return count;
    }





    public int firstUniqChar(String s) {
    String bh = s.substring(1);
    if (!bh.contains(Character.toString(s.charAt(0)))){
        return -1;
    }
        String afterrem = Character.toString(s.charAt(0));
        for (int i = 1;i<s.length();i++){
            afterrem = s.substring(0,i-1);
        if (i < 2) {
            afterrem = Character.toString(s.charAt(0));
        }
            afterrem += s.substring(i+1);
        if (i== s.length()-1){
            afterrem += Character.toString(s.charAt(s.length()-1));
        }
            if (!afterrem.substring(i+1).contains(Character.toString(s.charAt(i)))){
                System.out.println(afterrem);
                return i;
            }
        }
    return -1;
    }

    public int minOperations(String s) {
    LinkedList<Character> lschar = new LinkedList<Character>();
    for (int i = 0;i<s.length();i++){
        lschar.add(s.charAt(i));
    }
        int count = 0;
        for (int i= 0;i<s.length()-1;i++){
            if (lschar.get(i) == lschar.get(i+1)){
                count++;
                if (lschar.get(i+1) == '0'){
                    lschar.remove(i+1);
                    lschar.add(i+1,'1');
                }else {
                    lschar.remove(i+1);
                    lschar.add(i+1,'0');
                }
            }
        }


        LinkedList<Character> rev = new LinkedList<Character>();
        int b = s.length()-1;
        for (int i = 0;i<s.length();i++){
            rev.add(s.charAt(b));
            b--;
        }
        int count1 = 0;
        for (int i= 0;i<s.length()-1;i++){
            if (rev.get(i) == rev.get(i+1)){
                count1++;
                if (rev.get(i+1) == '0'){
                    rev.remove(i+1);
                    rev.add(i+1,'1');
                }else {
                    rev.remove(i+1);
                    rev.add(i+1,'0');
                }
            }
        }
        System.out.println(count+" "+count1);
        if (count<count1){
            return count;
        }else {
            return count1;
        }
    }

    public int minSetSize(int[] arr) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for (int i = 0;i<arr.length;i++){
            ls.add(arr[i]);
        }
        return ls.size();
    }

    public List<Integer> addToArrayForm(int[] num, int k) {
        int temp = num[num.length-1];
        int a = 0;
        if (k+num[num.length-1] <=9){
            num[num.length-1] = num[num.length-1]+k;
        }else {
            num[num.length-1] = (num[num.length-1]+k)%10;
            for (int i = num.length - 2; i >= 0 && a == 0; i--) {
                if (num[i]+1<=9){
                    num[i]++;
                    a = 1;
                }else {
                    num[i]= 0;

                }
            }
        }

        List<Integer> lsint = new LinkedList<Integer>();
        if (num[0] == 0){
            lsint.add(1);
        }
        for (int i = 0;i<num.length;i++){
            lsint.add(num[i]);
        }
        return lsint;
    }

    public static int most(int[] arr){
        int ans = -1;
        sortArray(arr);
        int prevno = arr[0];
        int count = 1;
        int maxoccc = Integer.MIN_VALUE;
        for (int i = 1;i<arr.length;i++){
            if (arr[i] == prevno){
                count++;
            }else {
                prevno = arr[i];
                if (count>maxoccc){
                    maxoccc = count;
                    ans = arr[i-1];
                }
                count = 1;
            }
        }
        return ans;
    }
//    public static void sortArray(int[] nums) {
//        for (int i = 0;i<nums.length;i++){
//            for (int j = i+1 ;j<nums.length;j++){
//                int minindex = Integer.MAX_VALUE;
//                if (minindex>nums[j]){
//                    minindex = j;
//                }
//                if (nums[minindex]<nums[i]){
//                    int temp = nums[i];
//                    nums[i] = nums[minindex];
//                    nums[minindex] = temp;
//                }
//            }
//        }
//    }
//

    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<nums.length-2;i++){
            for (int j = i+1;j<nums.length-1;j++){
                for (int k = j+1;k<nums.length;k++){
                    if (max< (nums[i]*nums[j]*nums[k])){
                        max = (nums[i]*nums[j]*nums[k]);
                    }
                }
            }
        }
        return max;
    }

    public boolean areAlmostEqual(String s1, String s2) {
        for (int i = 0;i<s1.length();i++){
            if (!s2.contains(Character.toString(s1.charAt(i)))){
                return false;
            }
        }
    int count = 0;
    for (int i = 0;i<s1.length();i++){
        if (s1.charAt(i) == s2.charAt(i)){
            count++;
        }
    }
    if (count == s1.length()-2 || count == s1.length()){
        return true;
    }else {
        return false;
    }
    }

    public String reverseStr(String s, int k) {
        String ans = "";
        if ((s.length() - k)<k) {
            for (int i = s.length()-1;i>=0;i--){
                ans += s.charAt(i);
            }
        }else {
            for (int i = k-1;i>=0;i--){
                ans += s.charAt(i);
            }
            for (int i = k;i<s.length();i++){
                ans += s.charAt(i);
            }
        }
        return ans;
    }

    public int secondHighest(String s) {
        LinkedList<Integer> ls =new LinkedList<Integer>();
        for (int i = 0;i<s.length();i++){
            int temp = (int) s.charAt(i);
            if (temp>=48 && temp<=57){
                ls.add(temp-48);
            }
        }
        System.out.println(ls);
        if (ls.isEmpty()){
            return -1;
        }
        sortls(ls);
        System.out.println(ls);
        int fhighest = ls.get(ls.size()-1);
        int shighest = -1;
        int bha = 0;
        int i = ls.size()-2;
        while (bha == 0 && i>=0){
            if (fhighest != ls.get(i)){
                shighest = ls.get(i);
                bha++;
            }
            i--;
        }
        System.out.println(fhighest);
        System.out.println(shighest);
        return shighest;
    }
    public void sortls(LinkedList<Integer> ls){
        for (int n = ls.size(); n > 0; n--) {
            for (int i = 0; i < (n - 1); i++) {
                if (ls.get(i) > ls.get(i+1)) {
                    int temp = ls.get(i+1);
                    ls.remove(i+1);
                    ls.add(i+1,ls.get(i));
                    ls.remove(i);
                    ls.add(i,temp);
                }
            }
        }
    }

    public int lengthOfLastWord(String s) {
        if (s.charAt(s.length()-1) == ' ') {
            for (int i = s.length() - 1; i >= 1; i--) {
                if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                    for (int j = i - 1; j >= 0; j--) {
                        if (j == 0 && s.charAt(j) == ' '){
                            return i-1;
                        }
                        if (j == 0){
                            return i;
                        }
                        if (s.charAt(j) == ' ') {
                            return (i - j - 1);
                        }
                    }
                }
            }
        }
        for (int i = s.length()-1;i>=0;i--){
            if (s.charAt(i) == ' '){
                return (s.length()-i-1);
            }
        }
        return s.length();
    }


    public String toGoatLatin(String S) {
        String ans = "";
        String vowel = "AEIOUaeiou";
        int temp = 1;
        for (int i = 0;i<S.length();i++) {
            String fir = Character.toString(S.charAt(0));
            if (vowel.contains(fir)) {
                temp = 0;
            }
        }
        return ans;
    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans =  -1;
        LinkedList<Integer> indexofvalid = new LinkedList<Integer>();
        LinkedList<Integer> manhattandistance = new LinkedList<Integer>();
        for (int i = 0;i<points.length;i++){
                if (points[i][0] == x || points[i][1] == y){
                    indexofvalid.add(i);
                }
        }
        System.out.println(indexofvalid);
        if (indexofvalid.isEmpty()){
            return -1;
        }
        for (int i =0;i<indexofvalid.size();i++){
                int d = Math.abs(points[indexofvalid.get(i)][0]-x) + Math.abs(points[indexofvalid.get(i)][1]-y);
                manhattandistance.add(d);
        }
        System.out.println(manhattandistance);
        LinkedList<Integer> mindistaneceindex = new LinkedList<Integer>();
        int mind = Integer.MAX_VALUE;
        for (int i = 0;i<manhattandistance.size();i++){
            if (mind > manhattandistance.get(i)){
                mind = manhattandistance.get(i);
            }
        }
        System.out.println(mind);

        for (int i = 0;i<manhattandistance.size();i++){
            if (manhattandistance.get(i) == mind){
                mindistaneceindex.add(i);
            }
        }
        System.out.println(mindistaneceindex);
        ans = Integer.MAX_VALUE;
        for (int i = 0;i<mindistaneceindex.size();i++){
            if (x == points[indexofvalid.get(mindistaneceindex.get(i))][0] && y == points[indexofvalid.get(mindistaneceindex.get(i))][1]) {
                return 0;
            }

            if (x!= points[indexofvalid.get(mindistaneceindex.get(i))][0]) {
                if (ans > points[indexofvalid.get(mindistaneceindex.get(i))][0]) {
                    ans = points[indexofvalid.get(mindistaneceindex.get(i))][0];
                }
            }else {
                if (ans > points[indexofvalid.get(mindistaneceindex.get(i))][1]) {
                    ans = points[indexofvalid.get(mindistaneceindex.get(i))][1];
                }
            }
        }
        System.out.println(ans);
        return ans;
    }


        public int arrangeCoins(int n) {
    int count = 0;
    int i = 1;
    while (n>=i){
        n -= i;
        i++;
        count++;
    }
    return count;
    }


    public int longestMountain(int[] arr) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        int maxlen = 0;
        for (int i = 0;i<arr.length-2;i++){
            for (int j = i+2;j<arr.length;j++){
                int max = i+j ;
            }
        }
        return maxlen;
    }

    public void moveZeroes(int[] nums) {
        int count = 0;
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for (int i = 0;i<nums.length;i++){
            if (nums[i] != 0){
                ls.add(nums[i]);
            }else {
                count++;
            }
        }
        if (count>0){
            for (int i = 0;i<count;i++){
                ls.add(0);
            }
        }
        for (int i = 0;i<ls.size();i++){
            nums[i] = ls.get(i);
        }
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1;i>=0;i--){
            if (digits[i] <= 8){
                digits[i]++;
                return digits;
            }else {
                digits[i] = 0;
            }
        }
        int[] oneextra = new int[digits.length+1];
        oneextra[0] = 1;
        for (int i = 0;i<digits.length;i++){
            oneextra[i+1] = digits[i];
        }
        return oneextra;
    }
    public int thirdMax(int[] nums) {
        LinkedList<Integer> maxls = new LinkedList<Integer>();
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            int no = nums[i];
            if (max1<no){
            max1 = no;
            }
            if (max2<no && max1>no){
                max2 = no;
            }
            if (max3<no && max1>no && max2>no){
                max3 = no;
            }
        }
        System.out.println(max1+" "+max2+" "+max3);
        if (max3 != Integer.MIN_VALUE){
            return max3;
        }else {
            return max1;
        }
    }


    public boolean detectCapitalUse(String word) {
        if (word.length()<=1){
            return true;
        }
        if (Character.isUpperCase(word.charAt(0))){
            if (Character.isUpperCase(word.charAt(1))){
                for (int i = 1;i<word.length();i++){
                    if (!Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
                return true;
            }else {
                for (int i = 1;i<word.length();i++){
                    if (!Character.isLowerCase(word.charAt(i))){
                        return false;
                    }
                }
                return true;
            }
        }else {
            for (int i = 1;i<word.length();i++){
                if (!Character.isLowerCase(word.charAt(i))){
                    return false;
                }
            }
            return true;
        }
    }

    public int maxind(int[] arr, int s, int e){
        for (int i = s;i<=e-2;i++){
            if (arr[i]<arr[i+1] && arr[i+1]>arr[i+2]){
                return i+1;
            }
        }
        return -1;
    }
    public int divide(int dividend, int divisor) {
    if (dividend == -2147483648 && divisor == -1){
        return 2147483647;
    }
    if (dividend == 0){
        return 0;
    }
        int temp = 0;
    if (dividend<0 && divisor>0){
        temp =1;
        dividend*=(-1);
    }
    if (dividend>0 && divisor<0){
        temp = 1;
        divisor*=(-1);
    }
    if (dividend<0 && divisor<0){
        dividend*=(-1);
        divisor*=(-1);
    }
    int ans = 0;
    if (divisor == 1){
        ans = dividend;
    }else {
        ans = dividend / divisor;
    }
        if (divisor == 1 && dividend == 1){
            ans = dividend;
        }
        if (temp == 1 && ans<0){
            return ans;
        }
    if (temp == 1){
        return ((-1)*ans);
    }else {
        return ans;
    }
    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        int lastanswer  = 0;
        LinkedList<Integer> ls = new LinkedList<Integer>();

        return ls;
    }
    public class SinglyLinkedListNode {
         int data;
         SinglyLinkedListNode next;
    }

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        while (sumoflist(h1) != sumoflist(h2) || sumoflist(h3) != sumoflist(h2)){
            int a = sumoflist(h1);
            int b = sumoflist(h2);
            int c = sumoflist(h3);

            int maxndex = maxndex(a,b,c);
            if (maxndex == 0){
                h1.remove(0);
            }else if (maxndex == 1){
                h2.remove(0);
            }else if (maxndex == 2){
                h3.remove(0);
            }
            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h3);
        }
        return sumoflist(h1);
    }
    public static int sumoflist(List<Integer> ls){
        int sum = 0;
        for (int i = 0;i<ls.size();i++){
            sum += ls.get(i);
        }
        return sum;
    }
    public static int maxndex(int a, int b, int c){
        if (a>=b && a>=c){
            return 0;
        }
        if (b>=a && b>=c){
            return 1;
        }
        if (c>=a && c>=b){
            return 2;
        }
        return 0;
    }

    public String reverseVowels(String s) {
        String ans = "";
        char add = 'a';
        String vowel = "AEIOUaeiou";
        int temp = s.length();
        for (int i =0;i<s.length();i++){
            if (vowel.contains(Character.toString(s.charAt(i)))){
                int repo = 0;
                for (int j =temp-1;j>=0 && repo ==0;j--){
                    if (vowel.contains(Character.toString(s.charAt(j)))){
                        add = s.charAt(j);
                        repo = 1;
                        temp = j;
                    }
                }
                ans += add;
            }else {
                ans += s.charAt(i);
            }
        }
        System.out.println(s);
        System.out.println(ans);
        return ans;
    }

    public boolean isPalindrome(String s) {
    String pal = "";
    String formattedstring = "";
    s.toLowerCase();
    for (int i = 0;i<s.length();i++){
        if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
            formattedstring+=s.charAt(i);
        }
    }
    formattedstring = formattedstring.toLowerCase();
    for (int i = formattedstring.length()-1;i>=0;i--){
        pal+=formattedstring.charAt(i);
    }
        System.out.println(formattedstring);
        System.out.println(pal);
    if (pal.equals(formattedstring)){
        return true;
    }else {
        return false;
    }
    }

    static int arrayManipulation(int n, int[][] queries) {
        int[] arr = new int[n];

        for (int i=0;i<queries.length;i++){
            for (int j=(queries[i][0]-1);j<=(queries[i][1]-1);j++){
                arr[j]+=(queries[i][2]);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] arr = new int[queries.length];
            for (int i = 0;i<queries.length;i++){
                for (int j = 0;j<strings.length;j++){
                    if (queries[i].equals(strings[j])){
                        arr[i]++;
                    }
                }
            }
        return arr;
    }
    public String reverseOnlyLetters(String S) {
    int lastindex = S.length()-1;
    String ans = "";
    for (int i = 0;i<S.length() && lastindex>=0;i++){
        int ascii = (int) S.charAt(i);
        if ((ascii>=65 && ascii<90) || (ascii>=97 && ascii<=122)){
            int lastindexascii = (int) S.charAt(lastindex);
            int trm = 0;
            if ((lastindexascii>=65 && lastindexascii<90) || (lastindexascii>=97 && lastindexascii<=122)) {
                ans += S.charAt(lastindex);
                trm = 1;
            }
            lastindex--;
            if (trm!=1){

            }

        }else {
            ans+=S.charAt(i);
        }
    }
    return ans;
    }

    public int singleNumber(int[] nums) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for (int i = 0;i<nums.length;i++){
            int temp = ls.get(nums[i]);
            temp++;
            ls.add(nums[i],temp);
        }
        for (int i = 0;i<ls.size();i++){
            if (ls.get(i)==1){
                return i;
            }
        }
        return -1;
    }

    public int minOperations(String[] logs) {
    LinkedList ls = new LinkedList();
    int point = 0;
    ls.add("Main");
    for (int i  = 0;i<logs.length;i++){
        if (logs[i].length()-1>=0) {
            if (logs[i].charAt(logs[i].length() - 1) == '/') {
                if (logs[i].length()-2 >=0) {
                    if (logs[i].charAt(logs[i].length() - 2) != '.') {
                        ls.add(logs[i].substring(0, logs[i].length() - 2));
                        point++;
                    } else {
                        if (logs[i].length() - 3 >= 0) {
                            if (logs[i].charAt(logs[i].length() - 3) == '.' && !ls.isEmpty() && point>=1) {
                                ls.pop();
                                point--;
                            }
                        }
                    }
                }
            }
        }
    }
    return point;
    }

    public String makeGood(String s) {
        LinkedList<Character> lschar = new LinkedList<Character>();
        for (int i = 0;i<s.length();i++){
            lschar.add(s.charAt(i));
        }

        int temp = 0;
        while (temp<=(s.length()+1/2)) {
            for (int i = 0; i < lschar.size()-1; i++) {
                    int upascii = (int) lschar.get(i + 1);
                    int lowscii = (int) lschar.get(i);


                if (lowscii >= 97 && lowscii <= 122 && lowscii - upascii == 32) {
                        lschar.remove(i);
                        lschar.remove(i);
                }

                if (upascii >= 97 && upascii <= 122 && upascii-lowscii == 32) {
                        lschar.remove(i);
                        lschar.remove(i);
                }

            }
            temp++;
        }

        String ans = "";
        for (int i = 0;i<lschar.size();i++){
            ans += lschar.get(i);
        }
        return ans;
    }
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
    int[][] darr = new int[R][C];
    int[][] arr = new int[1][2];
    return darr;
    }

    void prank(long[] a, int n)
    {   
        int bha = 0;
        LinkedList ls = new LinkedList();
        for (int i = 0;i<a.length && bha<a.length;i++){
            int temp = (int) a[i];
            ls.add(a[temp]);
            bha++;
        }
        for (int i = 0;i<a.length;i++){
            System.out.print(ls.get(i)+" ");
        }

    }

    public boolean circularArrayLoop(int[] nums) {
        int temp = 0;
        LinkedList<Integer> ls = new LinkedList<Integer>();
        ls.add(0);
        for (int i = 0;i<nums.length;){
            if (nums[i] >0){
                i += nums[i];
                if (i >nums.length){
                    i=i%nums.length;
                }
                ls.add(i);
            }else {
                i-=nums[i];

            }
            if (ls.getLast() == 0 && temp == 1){
                return true;
            }
            temp =1;
        }
        return false;
    }
}
