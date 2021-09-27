package com;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        String c = scan.next();

        System.out.println(isSumEqual(a,b,c));


    }
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int a = numv(firstWord);
        int b = numv(secondWord);
        int c = numv(targetWord);

        if(a+b == c){
            return true;
        }else if(a+c == b){
            return true;
        }else if(c+b == a){
            return true;
        }else{
            return false;
        }
    }

    public static int numv(String str){
        String n_string = "";
        for(int i = 0;i<str.length();i++){
            int ascii = (int) str.charAt(i);
            ascii -= 97;

            n_string += Integer.toString(ascii);
        }
        System.out.print(n_string);
        int n = 0;
        for(int i = 0;i<n_string.length();i++){
            int ascii = (int) n_string.charAt(i);
            ascii -= 48;
            int tempdouble = (int) Math.pow(10,n_string.length()-1-i);
            n += (ascii*tempdouble);
        }

        System.out.println(n);
        return n;

    }

    public static int getLucky(String s, int k) {
        int len = s.length();
        int t = 0;
        int sum = 0;
        String num = "";
        for(int i = 0 ; i<s.length();i++ ){
            int ascii = (int) s.charAt(i);
            ascii = ascii - 96;
            String tempnum = Integer.toString(ascii);
            num = num.concat(tempnum);
        }
        //System.out.println(num);
        for(int i = 0 ; i<num.length();i++ ){
            int ascii = (int) num.charAt(i);
            ascii = ascii - 48;
            sum+= ascii;
        }

        return sumofdig(sum, k-1);


    }

    public static int sumofdig(int num, int k){
        if( k == 0){
            return num;
        }

        int sum = 0;
        while (num!= 0){
            int rem = num % 10;
            num /= 10;
            sum += rem;
        }
        return sumofdig(sum,k-1);
    }

    public static void quickSort(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * No need to print or return the output.
         * Taking input and printing output is handled automatically.
         */
        qs(input, 0,input.length-1);
    }

    public static void qs(int[] arr, int si, int ei){
        if(si >= ei ){
            return;
        }

        int pivotloc = partision(arr, si,ei);

        qs(arr, si, pivotloc-1);
        qs(arr, pivotloc+1,ei);

    }

    public static int partision(int[] arr, int si, int ei){
        int pivot = arr[si];
        int count = 0;
        for(int i = si;i<=ei;i++){
            if(arr[i] < pivot){
                count++;
            }
        }
        int pivotloc = si + count;
        //swap pivot
        arr[si] = arr[pivotloc];
        arr[pivotloc] = pivot;

        //Verifiy Partision Rule and Satisfy Pivot Location
        int i = si;
        int j = ei;

        while(i<pivotloc && j>pivotloc){
            j = ei;
            int tempi = i;
            if(arr[i] < pivot){
                i++;
            }else{
                while (i <=tempi) {
                    if (arr[j] < pivot) {
                        //swap maro
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        i++;
                    } else {
                        j--;
                    }
                }
            }

        }
        return pivotloc;
    }

    public static void mergeSort(int[] input){
        // Write your code here
        ms(input,0,input.length-1);

    }

    public static void ms(int[] input, int s, int e){
        if(s>=e){
            return;
        }

        int mid = (s+e)/2;
        ms(input,s,mid);
        ms(input,mid+1,e);
        merge(input,s,e);
    }
    public static void merge(int[] arr, int s, int e){
        int mid  = (s+e)/2;
        int[] arr2 = new int[e-s+1];

        int i = s;
        int j = mid +1 ;

        for(int k = 0;k<arr2.length;k++){

            if (i <= mid && j <= e){
                if(arr[i] < arr[j]){
                    arr2[k] = arr[i];
                    i++;
                }else{
                    arr2[k] = arr[j];
                    j++;
                }
            }else{
                if (j>e){
                    arr2[k] = arr[i];
                    i++;
                }else{
                    arr2[k] = arr[j];
                    j++;
                }
            }
        }
        for(i = s;i<=e;i++){
            arr[i] = arr2[i-s];
        }

    }

    public int sumBase(int n, int k) {
        int base6 = 0;
        int sum = n% k;
        n = n - sum;

        int i = 2;
        while (n <=0){
            double kz = Math.pow(6,i);
            int ki = (int) kz;
            int val = n % ki;
            n = n-val;
            double z = Math.pow(6,i-1);
            int zi = (int) z;
            int newv = val / zi;
            sum += newv;
            i++;

        }
        return sum;
    }

    public static int game(int val){
        //Alice
        int n = 2;
        if (val <= 0){
            return 1;
        }

        while (val % n !=0 && n > val){
            n *= 2;
        }

        if (val%n == 0){
            val = val/ n;
        }else {
            val--;
        }

        return 1+game(val);
    }

//    public static int pairSum(int arr[], int i, int j, int num){
//        int k =0;
//        while (i<j)
//        {
//            if (arr[i]+arr[j]<num)
//                i++;
//            else if (arr[i]+arr[j]>num)
//                j--;
//            else {
//                if (arr[i]==arr[j])
//                {
//                    int h=j-i;
//                    k=h*(h+1)/2+k; return k;
//                }
//                else{
//                    int a=1,b=1;
//                    while(arr[i]==arr[i+1]){
//                        a++; i++;
//                    }
//                    while(arr[j]==arr[j-1]){
//                        b++; j--;
//                    }
//                    k=a*b+k;i++;j--;
//                }
//            }
//        }
//        return k;
//    }
//
//    public static int tripletSum(int arr[], int n, int num)
//    {
//        sort(arr, arr+n);
//        int ans = 0;
//        for(int i=0; i<n; i++){
//            ans += pairSum(arr, i+1, n-1, num-arr[i]);
//        }
//
//        return ans;
//    }


    public String freqAlphabets(String s) {
        String str = "";

        Stack<Integer> stack = new Stack<Integer>();

        for(int i = s.length()-1 ; i >=0 ; i--){
            if(s.charAt(i) == '#'){
                int t = (int) s.charAt(i-2);
                int d = (int) s.charAt(i-1);

                t -= 48;
                d -= 48;

                t = t*10;
                t += d;

                stack.add(t);
                i -= 2;
            }else{
                int d = (int) s.charAt(i);
                d -= 48;
                stack.add(d);
            }

        }

        System.out.println(stack);
        while(!stack.isEmpty()){
            int n = stack.pop();
            char ch = (char) (96+n);
            str += ch;
        }

        return str;
    }



    public static void intersection(int[] arr1, int[] arr2) {
        //Your code goes here
        int len1 = arr1.length;
        int len2 = arr2.length;

        sort(arr1,0,len1-1);
        sort(arr2,0,len2-1);


        for (int i = 0 ;i<len1;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for (int i = 0 ;i<len2;i++){
            System.out.print(arr2[i]+" ");
        }

        System.out.println();

        int i = 0;
        int j = 0;

        while( i < len1 && j < len2){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr1[i] > arr2[j]){
                j++;
            }else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }



    }

    public static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        //return arr;
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void countOrdinary(int num){
        int count = 0;
        int numdig = countdigits(num);

        if (numdig >=2) {
            count += 9 * (numdig - 1);

//            double tem = Math.pow(10,numdig-1);
//            int temp = (int) tem;

            int oneoneone = 0;
            for (int i = 1;i<=numdig;i++){
                oneoneone = oneoneone*10 +1;
            }

            int div = num/oneoneone;
            count += div;
//            for (int i = temp;i<=num;i++){
//                if (isOrdinary(i)){
//                    count++;
//                }
//            }


            System.out.println(count);
        }else{
            System.out.println(num);
        }
    }

    public static boolean isOrdinary(int n){
//        if (n<=9 && n>=1){
//            return true;
//        }
        int rem = n%10;
        n /= 10;
        while (n > 0){
            int rem2 = n%10;
            n/=10;
            if (rem2!=rem){
                return false;
            }
        }
        return true;
    }

    public static int countdigits(int n){
        int count = 0;
        while (n>0){
            n /=10;
            count++;
        }
        return count;
    }


    public static int findUnique(int[] arr) {
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = 0;i<arr.length;i++){
            ls.add(arr[i]);
        }

        for (int i = 0;i<arr.length;i++){
            int num = arr[i];
            int a = 0;
            if (ls.contains(num)){

            }else {

            }
        }
        return  ls.size();
    }


    public int[] deckRevealedIncreasing(int[] deck) {

        // Sorting Deck small to largest
        int nn = 0;
        Arrays.sort(deck);
        if ( deck.length %2 == 0){
            nn = deck.length / 2;
        }else{
            nn = (deck.length/2) +1;
        }
        int[] dec1 = new int[nn];
        int[] dec2 = new int[deck.length/2];

        for (int i = 0 ; i<dec1.length ; i+=2){
            dec1[i] = deck[i];
        }
        for (int i = 0 ; i<dec2.length ; i+=2){
            dec2[i] = deck[deck.length - dec2.length +i];
        }

        int k = 0;
        int l = 0;
        for (int i = 0 ; i<deck.length ; i+=2){
            deck[i] = dec1[k];
            k++;

            if(i+1 < deck.length){
                deck[i+1] = dec2[l];
                l++;
            }
        }

        return deck;
    }


    public static int staircase(int n){

        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int count = 0;
        if( n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }else if (n == 3){
            return 4;
        }


        return (1*staircase(n-1)) + (2*staircase(n-2)) + (4* staircase(n-3));

    }


    public static String removeConsecutiveDuplicates(String s) {

        String str= "";
        for(int i = 0 ;i <s.length()-1;i++){
            if (s.charAt(i) == s.charAt(i+1)){

                String sechalf = s.substring(i+2,s.length());

                if (i == s.length()-2){
                    if (s.charAt(s.length()-1) == s.charAt(s.length()-2)){
                        sechalf = "";
                    }
                }

                str = s.substring(0,i+1) + sechalf;
                return removeConsecutiveDuplicates(str);
            }



        }
        return s;
    }

    public static boolean candivide(int n){
        for (int i = 2;i<n;i+=2){
            int temp = n-i;
            if (temp %2 == 0){
                return true;
            }
        }
        return false;
    }

//        int m = scan.nextInt();
//        int count = 0;
//        for (int i = 0;i<=s;i++){
//            for (int j = 0;j<=s;j++){
//                for (int k = 0;k<=s;k++){
//                    int sum = i+j+k;
//                    int mul = i*j*k;
//
//                    if (sum<=s && mul<=m){
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
}
