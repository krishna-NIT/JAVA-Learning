/*
Here we will take input of String and then we will find index of space occured in
String, then upto that index we will reverse word & will add in temp String using
Concatenation & at last will reverse last word & hence will return the string temp
*/

package com;

import java.util.*;

public class revindivstring {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int[] stu = new int[n1];
        int[] san = new int[n1];
        for (int i = 0;i<stu.length;i++){
            stu[i] = scan.nextInt();
            san[i] = scan.nextInt();
        }
        System.out.println(countStudents(stu,san));
    }
    public int isPrefixOfWord(String sentence, String searchWord) {
        int count = 1;
        if (sentence.contains(searchWord)){
            for (int i = 0;i<sentence.length();i++){
                if (searchWord.charAt(i) == ' '){
                    count++;
                }
                int orii = i;
                int temp = 0;
                for (int j = 0;j<searchWord.length() && (orii+searchWord.length())<sentence.length();j +=0){
                if (searchWord.charAt(j)==sentence.charAt(i)){

                }
                if (temp == searchWord.length()){
                    return count;
                }
                i = orii;
                }
            }
        }else {
            return -1;
        }
        return -1;
    }
    //1700
    public static int countStudents(int[] students, int[] sandwiches) {
        LinkedList<Integer> lsstudent = new LinkedList<Integer>();
        LinkedList<Integer> lssandwiches = new LinkedList<Integer>();
        for (int i = 0;i<sandwiches.length;i++){
            lssandwiches.add(sandwiches[i]);
            lsstudent.add(students[i]);
        }
        int count0 = count0(lsstudent);
        int count1 = count1(lsstudent);
        while (count0>0 && count1>0) {
            for (int i = 0;i<lssandwiches.size(); i++) {
                if (lssandwiches.get(i) == lsstudent.get(i)){
                    lssandwiches.remove(i);
                    lsstudent.remove(i);
                }else {
                    int temp = lsstudent.get(i);
                    lsstudent.remove(i);
                    lsstudent.add(temp);
                }
            }
            count0 = count0(lsstudent);
            count1 = count1(lsstudent);
        }
        return lssandwiches.size();
    }
    public static int count0(LinkedList<Integer> ls0){
        int count = 0;
        int i = 0;
        while (i<ls0.size()){
            if (ls0.get(i) == 0){
                count++;
            }
        }
        return count;
    }

    public static int count1(LinkedList<Integer> ls1){
        int count = 0;
        int i = 0;
        while (i<ls1.size()){
            if (ls1.get(i) == 0){
                count++;
            }
        }
        return count;
    }


    public int[] sortArray(int[] nums) {
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1 ;j<nums.length-1;j++){
                int minindex = Integer.MAX_VALUE;
                if (minindex>nums[j]){
                    minindex = j;
                }
                if (nums[minindex]<nums[i]){
                    swap(nums[i],nums[minindex]);
                }
            }
        }
        return nums;
    }
    //985
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        LinkedList<Integer> ls = new LinkedList<Integer>();

        int[] arr = new int[ls.size()];
        for (int i = 0;i<arr.length;i++){
            arr[i] = ls.get(i);
        }
        return arr;
    }
    public String thousandSeparator(int n) {
        String ans = "";
        if(n ==0){
            return "0";
        }
        Stack<Integer> stack = new Stack<Integer>();
        while (n>0){
            stack.add(n%10);
            n /= 10;
        }
        int temp = stack.size()%3;
        if (stack.size()>3) {
            if (temp == 1) {
                ans += stack.pop();
                for (int i = 0; i < stack.size(); i++) {
                    ans += ".";
                    ans += stack.pop();
                    ans += stack.pop();
                    ans += stack.pop();
                }
            }
            if (temp == 2) {
                ans += stack.pop();
                ans += stack.pop();
                for (int i = 0; i < stack.size(); i++) {
                    ans += ".";
                    ans += stack.pop();
                    ans += stack.pop();
                    ans += stack.pop();
                }
            }
            if (temp == 0) {
                ans += stack.pop();
                ans += stack.pop();
                ans += stack.pop();
                for (int i = 0; i < stack.size(); i++) {
                    ans += ".";
                    ans += stack.pop();
                    ans += stack.pop();
                    ans += stack.pop();
                }
            }
        }else {
            for (int i =0;i<=stack.size();i++){
                ans+=stack.pop();
            }
        }
        return ans;
    }

    public int numSpecial(int[][] mat) {
        int sp = 0;
        for (int i =0;i<mat.length;i++){
            for (int j = 0;j<mat[0].length;j++){
                if (mat[i][j] == 1){
                    int temp = 0;
                    for (int k = 0;k<mat[0].length;k++){
                        if (mat[i][k] == 1){
                            temp++;
                        }
                    }
                    for (int k = 0;k<mat.length;k++){
                        if (mat[k][j] == 1){
                            temp++;
                        }
                    }
                    if (temp == 2){
                        sp++;
                    }
                }
            }
        }
        return sp;
    }
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] arr = new int[keysPressed.length()];
        arr[0] = releaseTimes[0];
        for (int i =1;i<arr.length;i++){
            arr[i] = releaseTimes[i] - releaseTimes[i-1];
        }
        LinkedList<Character> lschar = new LinkedList<Character>();
        int maxindex = 0;
        for (int i = 0;i<arr.length;i++){
            if (maxindex<arr[i]){
                maxindex = arr[i];
            }
        }
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == maxindex){
                lschar.add(keysPressed.charAt(i));
            }
        }
        if (lschar.size() == 1){
            return lschar.get(0);
        }else {
            //compare lexico... form lschar
            char fin = ' ';
            int maxascci = 0;
            for (int i = 0;i<lschar.size();i++){
                int temp = (int) lschar.get(i);
                if (temp>maxascci){
                    maxascci = temp;
                    fin  = lschar.get(i);
                }
            }
            return fin;
        }
    }
    public int majorityElement(int[] nums) {
        int ans = 0;
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for (int i = 0;i<nums.length;i++){
            if (!ls.contains(nums[i])){
                ls.add(nums[i]);
            }
        }
        int[] arr = new int[ls.size()];
        for (int i = 0;i<nums.length;i++){
            arr[ls.indexOf(nums[i])]++;
        }
        int maxcount = 0;
        int maxval = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>maxcount){
                maxcount = arr[i];
                maxval = ls.get(i);
            }
        }
        return maxval;
    }
    //1446 Consecative Character
    public int maxPower(String s) {
        int ans = 0;
        int max = 0;
        char temp = s.charAt(0);
        for (int i = 1;i<s.length();i++){
            if (s.charAt(i) == temp){
                 ans++;
                 if (max<ans){
                     max = ans;
                 }
            }else {
                ans = 0;
            }
            temp = s.charAt(i);
        }
        return max+1;
    }
    //transpose matrix
    public int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix[0].length][matrix.length];
        int k = 0;
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[0].length;j++){
                arr[j][k]=matrix[i][j];
            }
            k++;
        }
        return arr;
    }

    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b = temp;
    }

    public String reformatDate(String date) {
        String ans = "";
        int count = 0;
        int temp = date.length()-1;
        ans += date.charAt(temp-3);
        ans += date.charAt(temp-2);
        ans += date.charAt(temp-1);
        ans += date.charAt(temp);
        ans += "-";
        //add Month
        int bha = 0;
        int inc = 0;
        while (bha == 0){
            if (date.charAt(inc) == ' '){
                bha = inc+1;
                break;
            }
            if (bha == 0) {
                inc++;
            }
        }
        String mon = date.substring(bha,bha+3);
        if (mon.equals("Jan")){
            ans+="01";
        }else if (mon.equals("Feb")){
            ans+="02";
        }else if (mon.equals("Mar")){
            ans+="03";
        }else if (mon.equals("Apr")){
            ans+="04";
        }else if (mon.equals("May")){
            ans+="05";
        }else if (mon.equals("Jun")){
            ans+="06";
        }else if (mon.equals("Jul")){
            ans+="07";
        }else if (mon.equals("Aug")){
            ans+="08";
        }else if (mon.equals("Sep")){
            ans+="09";
        }else if (mon.equals("Oct")){
            ans+="10";
        }else if (mon.equals("Nov")){
            ans+="11";
        }else if (mon.equals("Dec")){
            ans+="12";
        }
        //add day
        ans += "-";
        if (date.charAt(1) == 't' || date.charAt(1) == 'r' ||date.charAt(1) == 's'||date.charAt(1) == 'n'){
            ans+="0";
            ans+=date.charAt(0);
        }else {
            ans+=date.charAt(0);
            ans+=date.charAt(1);
        }
        return ans;
    }

// trial changes
    public int[] numberOfLines(int[] widths, String s) {
    int[] result = new int[2];
    int count = 0;
    int dose = 1;
    for (int i = 0;i<s.length();i++){
        int cha = s.charAt(i);
        int ascii = (int) cha -97;
        if (count+widths[ascii] <=100){
            count+=widths[ascii];
        }else {
            dose++;
            count = widths[ascii];
        }
    }
    result[0] = dose;
    result[1] = count;
    return result;
    }
    public static int calPoints(String[] ops) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for (int i = 0;i<ops.length;i++){
            if (ops[i].equals("C")){
                ls.remove(ls.size()-1);
            }else if (ops[i].equals("D")){
                ls.add(2*ls.getLast());
            }else if (ops[i].equals("+")){
                ls.add((ls.getLast()+ls.get(ls.size()-2)));
            }else {
                int n = Integer.parseInt(ops[i]);
                ls.add(n);
            }
            System.out.println(ls);
        }
        int sum = 0;
        for (int i = 0;i<ls.size();i++){
            sum += ls.get(i);
        }
        return sum;
    }

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
    int count = 0;
        for (int i = 0;i<arr1.length;i++){
        for (int j = 0;j<arr2.length;j++){
            int temp = arr1[i] - arr2[j];
            if (temp<0){
                temp = temp*(-1);
            }
            if (temp<= d && temp>0){
                count++;
            }
            }
        }
        return count;
    }
    // Fibonacci Number
    public int fib(int n) {
    LinkedList<Integer> ls = new LinkedList<Integer>();
    ls.add(0);
    ls.add(1);
    for (int i = 2 ;i<=n;i++){
        ls.add(ls.get(i-1) + ls.get(i-2));
    }
    return ls.get(n);
    }
    //1694 Reformat Phone Number ---> Leetcode Pending
    public String reformatNumber(String number) {
    String fin = "";
        ArrayList<Character>  arrchar = new ArrayList<Character>();
        for (int i = 0;i<number.length();i++) {
        if (number.charAt(i)!='-' && number.charAt(i)!=' '){
            arrchar.add(number.charAt(i));
        }
        }
        System.out.println(arrchar);
        int count = 0;
        int bh = 0;
        if (arrchar.size() == 4) {
            fin += Character.toString(arrchar.get(bh));
            fin += Character.toString(arrchar.get(bh+1));
            fin += "-";
            fin += Character.toString(arrchar.get(bh+2));
            fin += Character.toString(arrchar.get(bh+3));
        }
        for (int i = 0;i<arrchar.size();i++) {
            if (count <= 3) {
                fin += Character.toString(arrchar.get(i));
                count++;
            }
            if (count == 3 && i!= arrchar.size()-1) {
                count = 0;
                fin += "-";
            }
            System.out.println();
            if (arrchar.size() - i == 4 && arrchar.size()%3 == 1) {
                fin += Character.toString(arrchar.get(i));
                fin += Character.toString(arrchar.get(i+1));
                fin += "-";
                fin += Character.toString(arrchar.get(i+2));
                fin += Character.toString(arrchar.get(i+3));
            }
        }
        return fin;
    }


    // 500 Keyword Row  ---> Leetcode Pending
    public String[] findWords(String[] words) {
    LinkedList<String> ls = new LinkedList<String>();
        String a = "qwertyuiop";
        String b = "asdfghjkl";
        String c = "zxcvbnm";

    for (int i = 0;i<words.length;i++) {
        int z = 0;
        int x = 0;
        int v = 0;
        String def = words[i];
        words[i] = words[i].toLowerCase();
            for (int j = 0;j<words[i].length();j++) {
            String tem = Character.toString(words[i].charAt(j));
                System.out.println(tem);
                if (a.contains(tem)) {
                    z++;
                }
                if (b.contains(tem)) {
                    x++;
                }
                if (c.contains(tem)) {
                    v++;
                }
            }
        System.out.println(z+" "+x+" "+v);
            if (z == words[i].length() || x == words[i].length() || v == words[i].length()) {
            ls.add(def);
            }
        }
    String[] arr = new String[ls.size()];
    for (int i = 0;i<ls.size();i++) {
            arr[i] = ls.get(i);
        }
    return arr;
    }

    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0;i<arr.length-2;i++) {
        if (arr[i]%2 !=0 && arr[i+1]%2 !=0 && arr[i+2]%2 !=0) {
        return true;
        }
        }
        return false;
    }
    public int[] shortestToChar(String s, char c) {
        int[] arr = new int[s.length()];
        int val;
        for (int i = 0; i < s.length(); i++) {
            val = -1;
            int front = i;
            int back = i - 1;
            int temp = 1;
            while (temp == 1) {
                if(front < s.length()){
                    if (s.charAt(front) == c) {
                        val = (i - front);
                        temp = 0;
                    }
                }
                if (front<s.length()) {
                    if (s.charAt(front) != c) {
                        if (back >= 0) {
                            if (s.charAt(back) == c && back >= 0) {
                                val = i - back;
                                temp = 0;
                            }
                        }
                    }
                }
                back--;
                front++;
            }
            if (val < 0) {
                val *= (-1);
                arr[i] = val;
            }
            arr[i] = val;
        }
        return arr;
    }

    public int[] sortByBits(int[] arr) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for (int n = arr.length; n > 0; n--) {
            for (int i = 0; i < (n - 1); i++) {
                //if (Integer.toBinaryString(arr[i]) > Integer.toBinaryString(arr[i+1])) {
                  //  swap2(arr, i, (i + 1));
                //}
            }
        }


        int[] ar = new int[ls.size()];
        for (int i = 0;i<ls.size();i++) {
            ar[i] = ls.get(i);
        }
        return ar;
    }

    public String removeDuplicates(String S) {
        String ans = "";
        LinkedList<Character> ls = new LinkedList<Character>();
        for (int i = 0; i < S.length(); i++) {
            ls.add(S.charAt(i));
        }
        for (int i = 0;i<ls.size()-1;i++) {
            if (ls.get(i) == ls.get(i + 1)) {
                ls.remove(i);
                ls.remove(i);
                i = -1;
            }
        }
        for (int i = 0;i<ls.size();i++) {
        ans += ls.get(i).toString();
        }
        return ans;
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        LinkedList<Integer> min1 = new LinkedList<Integer>();
        LinkedList<Integer> max1 = new LinkedList<Integer>();

        for (int i = 0;i<matrix[0].length;i++) {
            int max = Integer.MIN_VALUE;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][i] > max) {
                    max = matrix[k][i];
                }
            }
            max1.add(max);
        }

        for (int i = 0;i<matrix.length;i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            min1.add(min);
        }
        System.out.println(min1+" "+max1);
        for (int i = 0;i<max1.size();i++) {
            if (min1.contains(max1.get(i))) {
                ls.add(max1.get(i));
            }
        }
            System.out.println(ls);
        return ls;
        }
    

    public List<String> commonChars(String[] A) {
        LinkedList<String> lsc = new LinkedList<String>();
        LinkedList<Character> aa = new LinkedList<Character>();
    for (int i = 0;i<A[0].length();i++){
        char temp = A[0].charAt(i);
        aa.add(temp);
    }

    for (int i = 0;i<aa.size();i++){
        int temp = 0;
        String chtostr = aa.get(i).toString();
        for (int j = 0;j<A.length;j++){
            if (!A[j].contains(chtostr)){
                temp = 1;
                break;
            }else {
                int bhu = A[j].indexOf(chtostr);
            }
        }
        if (temp == 0){
            lsc.add(chtostr);
        }
    }
        return lsc;
    }
    //trial check

    public boolean canMakeArithmeticProgression(int[] arr) {
        for (int n = arr.length; n > 0; n--) {
            for (int i = 0; i < (n - 1); i++) {
                if (arr[i] > arr[i + 1]) {
                    swap2(arr, i, (i + 1));
                }
            }
        }
        int d = arr[1]-arr[0];
        for (int i = 0;i<arr.length-1;i++) {
            if (arr[i + 1] - arr[i] != d) {
                return false;
            }
        }
        return true;
    }
    public static void swap2(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }



    public static List<Integer> selfDividingNumbers(int left, int right) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for (int i = left;i<=right;i++){
            if (selfdivno(i)){
                ls.add(i);
            }
        }
        System.out.println(ls);
        return ls;
    }
    public static boolean selfdivno(int i){
        int num = i;
        int temp = 0;
        LinkedList<Integer> ls2 = new LinkedList<>();
        while (i>0){
            int d = i%10;
            ls2.add(d);
            i/=10;
        }
        if (ls2.contains(0)){
            return false;
        }else {
            for (i = 0;i<ls2.size();i++){
                if (num%ls2.get(i) != 0){
                    temp = 1;
                }
            }
        }
        if (temp == 1){
            return false;
        }
        return true;
    }


    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int temp = 4;
        if (n>0){
            for (int i = 0;i<=(n/2-1);i++){
                arr[i] = temp;
                arr[n-1-i] = (-1*temp);
                temp++;
            }
        }
        if (n%2!=0){
            arr[n/2] = 0;
        }
        return arr;
    }
    public static int maximum69Number (int num) {
        int temp = num;
        int len = 0;
        LinkedList<Integer> ls = new LinkedList<Integer>();
        while (temp > 0) {
            ls.add(temp%10);
            temp/=10;
        }
        System.out.println(ls);
        for (int i = ls.size()-1;i>=0 && len == 0;i--){
            if (ls.get(i) == 6){
                ls.remove(i);
                ls.add(i,9);
                len = 1;
            }
        }
        int num1 = 0;
        for (int i = ls.size()-1;i>=0;i--){
            num1 += (ls.get(i)*Math.pow(10,i));
        }
        return num1;
    }
    public static String RevIndivString(String txt){
        String temp = "";
        int carry = 0;
        for (int i = 0;i<txt.length();i++){
            if (txt.charAt(i) == ' '){
                for (int j = i-1;j>=carry;j--){
                    temp += txt.charAt(j);
                }
                temp += ' ';
                carry = i+1;
            }

        }
        for (int i = txt.length()-1;i>=carry;i--){
            temp += txt.charAt(i);
        }
        return temp;
    }
}
/*
    Test Cases:
        Input: He is Good
        Output: eH si dooG

        Input: I am krishna-NIT
        Output: I ma TIN-anhsirk

        Time Complexity: O(n)
        Space Complexity: O(1)


 */