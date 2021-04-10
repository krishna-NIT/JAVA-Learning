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
        int T = scan.nextInt();
        for (int i = 0;i<T;i++){
            int rlen = scan.nextInt();
            int clen = scan.nextInt();
            int x = scan.nextInt();
            int[][] tdarr = new int[rlen][clen];
            for (int j =0 ;j<rlen;j++){
                for (int k = 0;k<clen;k++){
                    tdarr[j][k] = scan.nextInt();
                }
            }
            // Main Solution
            int min = 0;
            if (rlen<clen){
                min = rlen;
            }else {
                min = clen;
            }
            int ans = 0;
            for (int a = 0;a<rlen;a++){
                for (int b = 0;b<clen;b++){
                    int temp = 0;
                    for (int d = 0;d<min && temp ==0;d++) {
                        int p = a+d;
                        int q = b+d;
                        if (p<rlen && q<clen) {
                            if (isWorthy(tdarr, a, b, p, q, x)) {
                                ans++;
                            }
                        }else {
                            temp++;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
    public void rotate(int[][] matrix) {
        int[][] fin = new int[matrix.length][matrix[0].length];
        int a = 0;

        while (a<matrix.length) {
            int rl = matrix.length - 1;
            for (int i = 0; i < matrix.length; i++) {
                fin[a][i] = matrix[rl][a];
                rl--;
            }
            a++;
        }

        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[0].length;j++){
                matrix[i][j] = fin[i][j];
            }
        }
    }

    public String rankTeams(String[] votes) {
        String ans = "";
        for (int i = 0;i<votes[0].length();i++){
            int[] asciiarray = new int[200];
            for (int j = 0;j<votes.length;j++){
                asciiarray[(int) votes[j].charAt(i)]++;
            }
            int ascii = maxindofarray(asciiarray);
            char ch = (char) ascii;
            ans += (ch);
        }
        return ans;
    }
    public int maxindofarray(int[] arr){
        int maxindex = 0;
        int maxvalue = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (maxvalue<arr[i]){
                maxvalue = arr[i];
                maxindex = i;
            }
        }
        return maxindex;
    }

    public boolean containsDuplicate(int[] nums) {
        sortArray(nums);
        for (int i =  0;i<nums.length-1;i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static boolean isWorthy(int[][] arr, int a, int b, int p, int q,int x){
        int sum = 0;
        for (int i = a;i<=p;i++){
            for (int j = b;j<=q;j++){
                sum += arr[i][j];
            }
        }
        int noofelement = (p-a+1)*(q-b+1);
        float mean = sum/noofelement;
        if (mean >=x){
            return true;
        }else {
            return false;
        }
    }

    public boolean uniqueOccurrences(int[] arr) {
        LinkedList<Integer> occurance = new LinkedList<Integer>();
        LinkedList<Integer> arrls = new LinkedList<Integer>();
        for (int i = 0;i<arr.length;i++){
            arrls.add(arr[i]);
        }
        for (int i = 0;i<arrls.size();i++){
            int occ = 0;
            for (int j = 0;j<arr.length;j++) {
                if (arrls.get(i) == arr[j]) {
                    occ++;
                }
            }
            if (!occurance.contains(occ)){
                occurance.add(occ);
                int numb = arrls.get(i);
                System.out.println(arrls.get(i));
                for (int d = 0;d<arrls.size();d++){
                    if (arrls.get(d).equals(numb)){
                        System.out.println(arrls.get(d));
                        arrls.remove(d);
                        if(d>=0){
                            d--;
                        }
                    }
                }
                System.out.println(arrls);
                i--;
            }else {
                System.out.println(occurance);
                System.out.println(arrls);
                return false;
            }
        }
        System.out.println(occurance);
        System.out.println(arrls);
        return true;
    }

    public String reverseWords(String s) {
        String ans = "";
        int a  = 0;
        int temp = -1;
        for (int i =0;i<s.length();i++){
            if (s.charAt(i) == ' '){
                if (a == 1){
                    ans += ' ';
                }
                for (int j = i-1;j>temp;j--){
                    ans += s.charAt(j);
                    a = 1;
                }
                temp  = i;
            }
        }
        if (a == 1){
            ans += ' ';
        }
        for (int i = s.length()-1;i>=temp+1;i--){
            ans += s.charAt(i);
        }
        return ans;
    }


    public int isPrefixOfWord(String sentence, String searchWord) {
        if (searchWord.length()-1 <sentence.length()) {
            if (sentence.substring(0, searchWord.length()).equals(searchWord)) {
                return 1;
            }
        }
        int word = 1;
        if (sentence.contains(searchWord)){
            for (int i= 1;i<sentence.length();i++){
                if (sentence.charAt(i) == ' '){
                    word++;
                }
                if (i+searchWord.length()-1 <sentence.length() && sentence.charAt(i-1) == ' ') {
                    System.out.println(sentence.substring(i, i + searchWord.length()));
                    if (sentence.substring(i, i + searchWord.length()).equals(searchWord)) {
                        return word;
                    }
                }
            }
        }
        return -1;
    }

    public static boolean isStrong(int a ,int b ,String str){
        int count = 0;
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i) == '*'){
                count++;
            }
            if (count>=b){
                return true;
            }
            if (str.charAt(i) != '*'){
                count = 0;
            }
        }
        return false;
    }

    public static void willBreak(float a, float b, float c, float v){
        float mul = a*b*c*v;
        float time = 100/mul;
        System.out.println(time);
        if (time <9.575000){
            System.out.println("YES");
        }else {
            System.out.println("No");
        }
    }

    public int hammingDistance(int x, int y) {
    int[] a = toBinary(x);
    int[] b = toBinary(y);
    System.out.println(a+" "+b);
    int count = 0;
    for (int i = 0;i<a.length;i++){
        System.out.println(a[i]+" "+b[i]);
        if (a[i] == b[i]){
            System.out.println("done");
            count++;
        }
    }
    return count;
    }

    public void rotate(int[] nums, int k) {
        for (int i = 0;i<k;i++){
            rotby1right(nums);
        }
    }
    public void rotby1right(int[] nums){
        int f = nums[nums.length-1];
        for (int i = nums.length-1;i>=1;i--){
            nums[i] = nums[i-1];
        }
        nums[0] = f;
    }

    public int[] toBinary(int decimal){
        int binary[] = new int[40];
        int index = 0;
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        return binary;
    }
    public int repeatedNTimes(int[] A) {
        int N = A.length/2;
        for (int i = 0;i<A.length;i++){
            int times = 0;
            for (int j = 0;j<A.length;j++){
                if (A[i] == A[j]){
                    times++;
                }
            }
            if (times == N){
                System.out.println("temp = N");
                return A[i];
            }
        }
        return -1;
    }

    public int[] sortArrayByParity(int[] A) {
    int[] arr = new int[A.length];
    int count = 0;
    for (int i = 0;i<A.length;i++){
        if (A[i] % 2 ==0){
            arr[count] = A[i];
            count++;
        }
    }
        for (int i = 0;i<A.length;i++){
            if (A[i] % 2 !=0){
                arr[count] = A[i];
                count++;
            }
        }
    return arr;
    }
    public int countGoodRectangles(int[][] rectangles) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for (int i = 0;i<rectangles.length;i++){
            if (rectangles[i][0]>rectangles[i][1]){
                ls.add(rectangles[i][1]);
            }else {
                ls.add(rectangles[i][0]);
            }
        }
        int max  = Integer.MIN_VALUE;
        for (int i = 0;i<ls.size();i++){
            if (max<ls.get(i)){
                max = ls.get(i);
            }
        }
        int count = 0;
        for (int i = 0;i<ls.size();i++){
            if (max == ls.get(i)){
                count++;
            }
        }
        return count;
    }
    public String sortString(String s) {
        String ans = "";
        for (int i = 0;i<s.length();i++){
            //Pending
        }
        return ans;
    }
    public String freqAlphabets(String s) {
    String ans = "";
        for (int i = 0;i<s.length();i++){
            if (i+2 < s.length()) {
                if (s.charAt(i + 1) != '#' && s.charAt(i + 2) != '#') {
                    int num = (int) s.charAt(i);
                    num = num - 48;
                    int asc = 96 + num;
                    char b = (char) asc;
                    ans += b;
                }
            }

        }
    return ans;
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0;i<image.length;i++) {
            for (int j = 0; j < image[0].length; j++) {
                //Reverse
                if (image[0].length%2 == 0 && j<image[0].length/2) {
                    int temp = image[i][j];
                    image[i][j] = image[i][image[0].length-j-1];
                    image[i][image[0].length-j-1] = temp;
                }else if (image[0].length%2 ==1 && j<=image[0].length/2){
                    System.out.println("ex1");
                    int temp = image[i][j];
                    image[i][j] = image[i][image[0].length-j-1];
                    image[i][image[0].length-j-1] = temp;
                }
                //Inverse
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                }else {
                    image[i][j] = 0;
                }

            }
        }
        return image;
    }
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
    int count = 0;
    for (int i =0;i<arr.length;i++){
        for (int j = i+1;j<arr.length;j++){
            for (int k = j+1;k<arr.length;k++){
                int a1 = arr[i] - arr[j];
                int a2 = arr[j] - arr[k];
                int a3 = arr[i] - arr[k];
                if (a1<0){
                    a1 *= (-1);
                }
                if (a2<0){
                    a2 *= (-1);
                }if (a3<0){
                    a3 *= (-1);
                }
                if (a1<= a && a2<=b && a3<=c && i<j && j<k && k<arr.length){
                    count++;
                }
                }
            }
        }
        return count;
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        int xcurrent = points[0][0];
        int ycurrent = points[0][1];
        for (int i = 1;i<points.length;i++){
            int x = points[i][0];
            int y = points[i][1];
            while (xcurrent != x && ycurrent != y){
                //movinng toward 1nd quardant
                if (xcurrent + 1 == x && ycurrent + 1 == y) {
                    ans++;
                    xcurrent = x;
                    ycurrent = y;
                }
                if (xcurrent+1<x && ycurrent+1<y){
                    xcurrent++;
                    ycurrent++;
                    ans++;
                }
                if (xcurrent<x && ycurrent == y){
                    xcurrent++;
                    ans++;
                }
                if (ycurrent<y && xcurrent ==x){
                    ycurrent++;
                    ans++;
                }

                //movinng toward 2nd quardant
                if (xcurrent -1 == x && ycurrent + 1 == y) {
                    ans++;
                    xcurrent = x;
                    ycurrent = y;
                }
                if (xcurrent-1<x && ycurrent-1<y){
                    xcurrent++;
                    ycurrent++;
                    ans++;
                }
                if (xcurrent<x && ycurrent == y){
                    xcurrent++;
                    ans++;
                }
                if (ycurrent<y && xcurrent ==x){
                    ycurrent++;
                    ans++;
                }
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
    // Teoplitz Matrix
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rlen = matrix.length;
        int clen = matrix[0].length;

        //horizontal checking
        for (int i = 0;i<clen;i++){
            int temp = 0;
            int val = matrix[temp][i];
            temp++;
            for (int j = i+1;j<clen && temp<rlen;j++){
                if (val!=matrix[temp][j]){
                    return false;
                }
                temp++;
            }
        }

        //vertical checking
        for (int i = 1;i<rlen;i++){
            int temp = 0;
            int val = matrix[i][temp];
            temp++;
            for (int j = i+1;j<rlen && temp<clen;j++){
                if (val!=matrix[j][temp]){
                    return false;
                }
                temp++;
            }
        }
        return true;
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] noofsoldier = new int[mat[0].length];
        int[] rowindex = new int[mat[0].length];
        for (int i = 0; i < mat[0].length; i++) {
            noofsoldier[i] = nosoldier(mat, i);
            rowindex[i] = i;
        }
        System.out.println(noofsoldier);
        sortArray(noofsoldier);
        System.out.println(noofsoldier);
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
    public int nocivil(int[][] matrix, int i){
        int count = 0;
        for (int j = 0;j<matrix[0].length;j++){
            if (matrix[i][j] == 0){
                count++;
            }
        }
        return count;
    }
    public char nextGreatestLetter(char[] letters, char target) {
    int targetascii = (int) target;
    int index = 0;
    int minascii = Integer.MAX_VALUE;
    for (int i = 0;i<letters.length;i++){
        int tempascci = (int) letters[i];
        if (tempascci>targetascii && minascii>tempascci){
            minascii = tempascci;
            index = i;
        }
    }
    return letters[index];
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
    public static double myPow(double x, int n) {
        if (n<= 2147483647 && n>= -2147483648){
            return 0;
        }
        if (x == 1.00000){
            return 1;
        }
        double ans = 1;
        int d =n;
        if(n<0){
            n *= (-1);
        }
        for (int i = 0;i<n;i++){
            ans *= x;
            System.out.println(ans);
        }
        if (d<0){
            System.out.println(ans);
            double temp = (1/ans);
            return temp;
        }
        return ans;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[0].length;j++){
                if (matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
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
    public double trimMean(int[] arr) {
        System.out.println(arr.length);
        double ans = 0;
        printarr(arr);
        sortArray(arr);
        System.out.println();
        printarr(arr);
        double sum = 0;
        int fivper = arr.length*5/100;
        System.out.println("THis added in sequence");
        for (int i = fivper;i<arr.length-fivper;i++){
            System.out.println(arr[i]);
            sum+=arr[i];

        }
        int len = arr.length-(2*fivper);
        System.out.println(sum);
        System.out.println("Length is"+len);
        ans = sum/len;
        return (sum/len);
    }
    public int[] sortArray(int[] nums) {
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
        return nums;
    }

    public void setZeroes(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        for (int i =0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans[i][j] = matrix[i][j];
            }
        }
        for (int i =0;i<matrix.length;i++){
            for (int j = 0;j<matrix[0].length;j++){
                if (matrix[i][j] == 0){
                    for (int k = 0;k<matrix[0].length;k++){
                        ans[i][k] = 0;
                    }
                    for (int b = 0;b<matrix.length;b++){
                        ans[b][j] = 0;
                    }
                }
            }
        }
        for (int i =0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }

    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int i =0;i<nums.length;i++){
            total += nums[i];
        }
        System.out.println(total+" "+p);
        System.out.println(total%p);
        if (total%p == 0){
            return 0;
        }
        for (int i = 0;i<nums.length;i++){
            if ((total - nums[i]) % p == 0){
                return 1;
            }
        }
        int k =1;
        while (k<=nums.length-1) {
            for (int i = 0; (i+k) < nums.length; i++) {
                long temptot = total;
                for (int d = i;d<=(i+k);d++){
                    temptot -= nums[d];
                }
                if (temptot == 0){
                    return -1;
                }
                if (temptot%p == 0){
                    return k+1;
                }
            }
            k++;
        }
        return -1;
    }

    
    public int removeElement(int[] nums, int val) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        int len = nums.length;
        int k = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] == val){
                len--;
            }else {
                nums[k] = nums[i];
                k++;
            }
        }
//
//        for (int i = 0;i<ls.size();i++){
//            nums[i] = ls.get(i);
//        }
        return len;
    }

    public void duplicateZeros(int[] arr) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        int len = 0;
        for (int i =0;i<arr.length && len <= arr.length;i++){
            ls.add(arr[i]);
            if (arr[i] == 0){
                ls.add(0);
            }
        }
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == 0){
            arr[i] = ls.get(i);
        }
    }



    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int productall = 1;
        for (int i =0;i<nums.length;i++){
            productall *= nums[i];
        }
        for (int i = 0;i<nums.length;i++){
            ans[i] = productall/nums[i];
        }
        return ans;
    }

    public int subarraysDivByK(int[] A, int K) {
        int count = 0;
        for (int i = 0;i<A.length-1;i++){
            if (A[i]%K == 0){
                count++;
            }
            for (int j = i+1;j<A.length;j++){
                if (isSumDiv(A,i,j,K)){
                    count++;
                }
            }
        }
        if (A[A.length-1]%K == 0){
            count++;
        }
        return count;
    }
    public boolean isSumDiv(int[] arr, int s,int e,int K){
        int sum = 0;
        for (int i = s;i<=e;i++){
            sum += arr[i];
        }
        if (sum%K == 0){
            return true;
        }else {
            return false;
        }
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        if (nums1.length<nums2.length){
            for (int i = 0;i<nums1.length;i++){
                int temp = nums1[i];
                for (int j = 0;j<nums2.length;j++){
                    if (nums2[j] == temp){
                        nums2[j] = Integer.MIN_VALUE;
                        ls.add(temp);
                        break;
                    }
                }
            }
        }else {
            for (int i = 0;i<nums2.length;i++){
                int temp = nums2[i];
                for (int j = 0;j<nums1.length;j++){
                    if (nums1[j] == temp){
                        nums1[j] = Integer.MIN_VALUE;
                        ls.add(temp);
                        break;
                    }
                }
            }
        }
        int[] arr = new int[ls.size()];
        for (int i = 0;i<arr.length;i++){
            arr[i] = ls.get(i);
        }
        return arr;
    }

    public int[] dailyTemperatures(int[] T) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for (int i = 0;i<T.length;i++){
            int count = 0;
            if (i+1 < T.length) {
                for (int j = i + 1; j < T.length && count >= 0; j++) {
                    count++;
                    if (T[j] > T[i]) {
                        ls.add(count);
                        count = -1;
                    }
                }
                if (count != -1){
                    ls.add(0);
                }
            }
        }
        ls.add(0);
        int[] ans = new int[ls.size()];
        for (int i = 0;i<ls.size();i++){
            ans[i] = ls.get(i);
        }
        return ans;
    }

    public void printarr(int[] arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public boolean divisorGame2(int N) {
        int temp = 0;
        while (N>0){
            //alience play
            if (N==1){
                return false;
            }
            N--;
            //bob play
            if (N==1){
                return true;
            }
            N--;
        }
        return false;
    }
    public boolean divisorGame(int N) {
        int temp = 0;
        int judge = 0;
        while (N>0){
            //Alice Playing
            for (int i = 1;i<N && judge ==0;i++){
                judge = 0;
                if (N%i ==0){
                    N = N-i;
                    judge++;
                }
                if (judge == 0){
                    return false;
                }
            }
            // Bob Playing
            for (int i = 1 ;i<N && judge ==0;i++){
                judge = 0;
                if (N%i ==0){
                    N = N-i;
                    judge++;
                }
                if (judge == 0){
                    return true;
                }
            }
        }
        return false;
    }

    public int totalMoney(int n) {
    int temp = n%7;
    int ans = 0;
    int bha = 1;
    while (n>=7){
        System.out.println();
        System.out.println("starting form"+bha);
        ans +=bha;
        int kri = bha;
        for (int i = 1;i<7;i++){
            System.out.println(kri+1);
            ans+=(kri+1);
            kri++;
        }
        n -= 7;
        bha++;
        System.out.println(ans);
    }
        System.out.println();
        System.out.println("reminder");
    for (int i = 1;i<=n;i++){
        System.out.println("starting from "+bha);
        ans += bha;
        bha++;
        System.out.println(ans);
    }
    return ans;
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