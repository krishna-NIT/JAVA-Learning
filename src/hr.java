import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class hr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mail = scan.nextLine();
        for (int j = 0; j < mail.length(); j++) {
            if (mail.charAt(j) == '+') {
                mail = atmeth(mail, j);
                break;
            }
        }
        System.out.println(mail);
    }

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i =0;i<h1.size();i++){
            sum1+=h1.get(i);
        }
        for (int j =0;j<h1.size();j++){
            sum1+=h1.get(j);
        }
        for (int k =0;k<h1.size();k++){
            sum1+=h1.get(k);
        }


    }


// answer
    public static String atmeth(String mail, int index){
        int indexofatrate=0;
        for (int i =0;i<mail.length();i++){
            if (mail.charAt(i) =='@' ){
                indexofatrate = i;
            }
        }
        if (indexofatrate==0){
            return mail;
        }
        String ltem = mail.substring(indexofatrate,mail.length());
        String ftem = mail.substring(0,index);
        return (ftem+""+ltem);
    }

    public static String removealphabet(String mail, int index){
    String ltem = mail.substring(index+1,mail.length());
    String ftem = mail.substring(0,index);
    System.out.println(ftem+ltem);
    return (ltem+""+ftem);
    }
    public int numUniqueEmails(String[] emails) {
    LinkedList<String> finalsingleemail = new LinkedList<String>();
    for (int i = 0;i<emails.length;i++){
        //make email simple by .
        int k = 0;
        String mail = emails[i];
        for (int j =0;j<mail.length();j++){
            if (mail.charAt(j)=='.'){
                mail = removealphabet(mail,j);
                j--;
            }
            if (mail.charAt(j)=='@'){
                break;
            }
        }
        //make email simply by @
        for (int j =0;j<mail.length();j++){
            if (mail.charAt(j)=='+'){
                mail = atmeth(mail,j);
                break;
            }
        }

        //add in list if not included
        if (!finalsingleemail.contains(mail)){
            finalsingleemail.add(mail);
        }
    }
    return finalsingleemail.size();
    }



    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int len = s.length();
        String a = s.substring(0,((len/2)));
        String b = s.substring(len/2,len);
        System.out.println(s);
        System.out.println(a+" "+b);
        int avcount = 0;
        int bvcount = 0;
        for (int i =0;i<a.length();i++){
            if(a.charAt(i)=='a' ||a.charAt(i)=='e' ||a.charAt(i)=='i' ||a.charAt(i)=='o' ||a.charAt(i)=='u'){
                System.out.print(a.charAt(i)+"");
                avcount++;
            }
            if(b.charAt(i)=='a' ||b.charAt(i)=='e' ||b.charAt(i)=='i' ||b.charAt(i)=='o' ||b.charAt(i)=='u'){
                System.out.print(b.charAt(i)+"");
                bvcount++;
            }
        }
        if (avcount==bvcount){
            return true;
        }else {
            return false;
        }
    }


    public void reverseString(char[] s) {
    int k =0;
    char[] fin = new char[s.length];
    for (int i=s.length-1;i>=0;i--){
    fin[k]= s[i];
    k++;
    }
    for (int i =0;i<s.length;i++){
        s[i]= fin[i];
    }
}

    public int maximumUnits(int[][] boxTypes, int truckSize) {
return  0;
    }

    public boolean isSubsequence(String s, String t) {
    int a = 0;
    int tempp = 0;
    for (int i =0;i<s.length();i++){
        for (int j=i+1;j<t.length();j++) {
            if (s.charAt(i) == t.charAt(j) && j>tempp) {
                a++;
                tempp=j;
            }
        }
    }
    if (a==s.length()){
        return true;
    }
    return false;
    }


    public void twoSum(int[] numbers, int target) {
    int[] ans = new int[2];
        for (int i= 0;i<numbers.length-1;i++){
        for (int j =i+1;j<numbers.length;j++){
            if (numbers[i]+numbers[j]==target){
                ans[0]=i;
                ans[1]=j;
            }
        }
    }
    }

//    public int firstBadVersion(int n) {
//        for (int i =1;i<=n;i++){
//            if (!isBadVersion(i)){
//                if (isBadVersion(i+1)){
//                    return i+1;
//                }
//            }
//        }
//        return -1;
//    }
//

    public int mySqrt(int x) {
    int i=0;
    int k=0;
        while (i==0){
            if(x>=Math.pow(k,2) && x<Math.pow(k+1,2)){
                return k;
            }
            k++;
        }
        return k;
    }



    public int[] intersection(int[] nums1, int[] nums2) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        if (nums1.length<=nums2.length){
        for (int i=0;i<nums1.length;i++){
            for (int j =0;j<nums2.length;j++){
                if (nums1[i]==nums2[j] && !ls.contains(nums1[i])){
                    ls.add(nums1[i]);
                }
            }
        }
        }else{
            for (int i=0;i<nums2.length;i++){
                for (int j =0;j<nums1.length;j++){
                    if (nums2[i]==nums1[j] && !ls.contains(nums2[i])){
                        ls.add(nums2[i]);
                    }
                }
            }
        }
        int[] arr = new int[ls.size()];
        for (int i =0;i<ls.size();i++){
            arr[i]=ls.get(i);
        }
        return arr;
    }

    public int guessNumber(int n) {
       // int gue = guess(n);
return 0;
    }

    public int search(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target){
                return i;
            }else if (nums[i]>target){
                return -1;
            }

        }
        return -1;
    }
    public String removeDuplicates(String S) {
        int count =1;
        int len = S.length();
        while (count>0){
            for (int i=0;i<S.length()-2;i++){
                if (S.charAt(i)==S.charAt(i+1)){
                    String oldstri = S.substring(0,i);
                    String laststr = S.substring(i+2,len-1);
                }
                count=0;
            }

            for (int i =0;i<S.length()-1;i++){
                if (S.charAt(i)==S.charAt(i+1)){
                    count++;
                }
            }
        }
        return S;
    }

    public String destCity(List<List<String>> paths) {
return "dom";
    }


    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int lasttemp1=0;
        int lasttemp2=0;
        String ans = "";
        for (int i=0;i<len1 && i<len2;i++){
            if (i<len1){ ans+=word1.charAt(i); lasttemp1=i; }
            if (i<len2){ ans+=word2.charAt(i); lasttemp2=i; }
        }
        if (len1<len2){
            ans+=word2.substring(lasttemp2+1,len2-1);
        }
        if (len1>len2){
            ans+=word1.substring(lasttemp1+1,len1-1);
        }
    return ans;
    }


    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        for (int i=0;i<word1.length;i++){
            a+=word1[i];
        }
        for (int i=0;i<word2.length;i++){
            b+=word2[i];
        }
        if (a.equals(b)){
            return true;
        }else {
            return false;
        }
    }

    public int maxProduct(int[] nums) {
    int max  = Integer.MIN_VALUE;
    for (int i =0;i<nums.length-1;i++){
        for (int j = i+1;j<nums.length;j++){
            if (max<(nums[i]-1)*(nums[j]-1)){
                max= (nums[i]-1)*(nums[j]-1);
            }
        }
    }
    return max;
    }
    public int oddCells(int n, int m, int[][] indices) {
    int[][] darr = new int[n][m];
    for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                darr[i][j] = 0;
            }
        }
    for (int i = 0;i<indices[0].length;i++){
        int a = indices[i][0];
        int b = indices[i][1];
        for (int j = 0;j<m;j++){
            darr[a][i]++;
        }
        for (int j =0;j<n;j++){
            darr[i][b]++;
        }
    }
    int countodd = couodd(n,m,darr);
    return countodd;
    }
    public static int couodd(int n, int m, int[][] indices){
        int count =0;
        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                if (indices[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }


    public static void findNumbers(int[] nums) {
    int ans = 0;
    for (int i = 0; i<nums.length;i++) {
        int digit = 0;
        int n = nums[i];
        while (n>0){
            digit++;
            n/=10;
        }
        System.out.println(digit);
        if (digit%2==0) {
        ans++;
        }
        System.out.println("d");
    }
        System.out.println(ans);
    }


    public int fact(int n){
        int ans = 1;
        while (n>0){
            ans *= n;
            n--;
        }
        return ans;
    }
    public int distributeCandies(int[] candyType) {
    LinkedList<Integer> ls = new LinkedList<Integer>();
    for (int i = 0;i<candyType.length;i++){
    if (!ls.contains(candyType[i])){
        ls.add(candyType[i]);
    }
    }
    int n = ls.size();
    int r = candyType.length/2;
    int ans = (fact(n)/(fact(r)*fact(n-r)));
    return ans;
    }
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        int n = scan .nextInt();
//        int[][] darr = new int[n][n];
//        for(int i =0;i<n;i++){
//            for (int j =0;j<n;j++){
//                darr[i][j] = scan.nextInt();
//            }
//        }
//     // Printing 90 rotated in clockwise direction.
//        int temp = n;
//        int k=0;
//        while(temp>0){
//            for (int i =n-1;i>=0;i--){
//                System.out.print(darr[i][k]+" ");
//            }
//            k++;
//            temp--;
//            System.out.println();
//        }













//    static int[] reverseArray(int[] a) {
//        int[] arr = new int[a.length];
//        int j = 0;
//        for (int i =a.length-1;i>=0;i--){
//            arr[j] = a[i];
//            j++;
//        }
//        return arr;
//    }
    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        int m = scan.nextInt();
//        for (int i=0;i<m;i++){
//            int l = scan.nextInt();
//            int r = scan.nextInt();
//            metho(s.substring(1-l,r-1));
//        }
//
//      }
//      public static void metho(String s){
//        for (int i=0;i<=s.length()-3;i++){
//            String temp = s.substring(i,i+2);
//
//        }
//      }
//      public static void queans(int[] arr){
////
//    }
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//    Scanner scan = new Scanner(System.in);
//    int n = scan.nextInt();
//    for (int i=0;i<n;i++){
//        ans(scan.nextDouble());
//    }
//    }
//    public static void ans(double n){
//        double temp= n;
//        for (int i =1;i<=16;i++){
//            if (n<Math.pow(i+1,3)&&n>=Math.pow(i,3)){
//                temp=temp-(Math.pow(i,3));
//                break;
//            }
//        }
//        int kb =1;
//        int bhagwat =0;
//        while (temp>0){
//            double te = temp;
//            temp-=Math.pow(kb,3);
//            if (temp>=0) {
//                kb++;
//            }else {
//                temp=te;
//                kb++;
//                bhagwat++;
//            }
//
//            if (bhagwat==16){
//                break;
//            }
//        }
//        if (temp==0){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }
//    }
//


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        String[] arrstr = new String[n];
//        for (int i=0;i<n;i++){
//            arrstr[i]=scan.next();
//        }
//        for (int i=0;i<n;i++){
//           ans(arrstr[i]);
//        }
//    }
//    public static void ans(String que){
//        int i=0;
//        int j=0;
//        int k=0;
//        for (int ju=0;ju<que.length();ju++){
//            char temp = que.charAt(ju);
//            temp = Character.toLowerCase(temp);
//            if (temp =='q' ||temp =='a'|| temp =='z' ||temp =='w' ||temp =='s'|| temp =='x'||temp =='e' ||temp =='d'|| temp =='c' ){
//                i++;
//            }
//            if (temp =='r' ||temp =='f'|| temp =='v' ||temp =='t' ||temp =='g'|| temp =='b'||temp =='y' ||temp =='h'|| temp =='n'|| temp =='m'|| temp =='j'|| temp =='u' ){
//                j++;
//            }
//            if (temp =='i' ||temp =='k'|| temp =='l' ||temp =='o' ||temp =='p' ){
//                k++;
//            }
//        }
//        System.out.println(i+" "+j+" "+k);
//        if (i==que.length() || k==que.length() || j==que.length()){
//            System.out.print(que+" ");
//        }
//    }
//    public int balancedStringSplit(String s) {
//        int count=0;
//        for (int i=0;i<s.length()-1;i++){
//            for (int j=i+1;j<s.length();j++){
//                if (isBal(s.substring(i,j))){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//public static void main(String[] args) {
//    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//    Scanner scan = new Scanner(System.in);
//    int len = scan.nextInt();
//    if (len==1||len==2){
//        System.out.println(0);
//        return;
//    }
//    int[] arr = new int[len];
//    for (int i=0;i<arr.length;i++){
//        arr[i]=scan.nextInt();
//    }
//    //sort
//    LinkedList<Integer> rem1 = new LinkedList<Integer>();
//    LinkedList<Integer> rem2 = new LinkedList<Integer>();
//    int maxsum=0;
//    for (int i=0;i<arr.length;i++){
//        int nu = arr[i];
//        if (nu%3==0){
//            maxsum+=nu;
//        }else if (nu%3==1){
//            rem1.push(nu);
//        }else if (nu%3==2){
//            rem2.push(nu);
//        }
//    }
//    System.out.println(rem1);
//    System.out.println(rem2);
//
//    //sort descending order
//    InsertSort(rem1);
//    InsertSort(rem2);
//
//
//    System.out.println(rem2);
//    int maxoftwo =0;
//    int bha2 = rem2.size()-(rem2.size()%3);
//    System.out.println(bha2);
//    for (int i=0;i<bha2;i++){
//        maxsum+=rem2.get(i);
//    }
//    int bha1 = rem1.size()-(rem1.size()%3);
//    System.out.println(bha1);
//    for (int i =0;i<bha1;i++){
//        maxsum+=rem1.get(i);
//    }
//
//    while (bha1<rem1.size() && bha2<rem2.size()){
//        maxsum+=rem1.get(bha1)+rem2.get(bha2);
//        bha1++;
//        bha2++;
//    }
//    System.out.println(maxsum+maxoftwo);
//    }
//    public static void swap2(LinkedList<Integer> rem,int i, int j) {
//        if (i==j){
//            return;
//        }
//        int temp = rem.get(i);
//        rem.add(i,rem.get(i+1));
//        rem.add(i+1,temp);
//    }

    public static void InsertSort(LinkedList<Integer> ls) {
        for (int i =0;i<ls.size();i++){
            for (int j=i;j>=0;j--) {
                if (ls.get(j) < ls.get(j+1)) {
                    swap(ls.get(j), ls.get(j+1));
                }
            }
        }
    }

    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b = temp;
    }








  public static boolean isBal(String a){
        int noL=0;
        int noR=0;
        int noO=0;
        for (int i =0;i<a.length();i++){
            char temp = a.charAt(i);
            if (temp=='L'){
                noL++;
            }else if (temp=='R'){
                noR++;
            }else {
                noO++;
            }
        }

        if (noL==noR && noO==0){
            return true;
        }else{
            return false;
        }
    }
    public int countConsistentStrings(String allowed, String[] words) {
    int ans = 0;
    char[] chararr = allowed.toCharArray();
    for (int i=0;i<words.length;i++){
        int count = 0;
        int co =0;
        String s = words[i];
        for (int j =0;j<s.length();j++){
            char tempchar = s.charAt(j);
            for (int k = 0;k<chararr.length;k++){
                if (tempchar == chararr[k]){
                    count=1;
                }
            }
            if (count==1) {
                co++;
            }
        }
        if (co==s.length()){
            ans++;
        }
    }
    return ans;
    }

//    public static void swap2(LinkedList<Integer> rem,int i, int j) {
//        if (i==j){
//            return;
//        }
//        int temp = rem.get(i);
//        rem.add(i,rem.get(i+1));
//        rem.add(i+1,temp);
//    }


    public int sumOddLengthSubarray(int[] arr) {
    int sum =0;

    for (int j=1;j<=arr.length;j+=2){
        int d=0; //d is sum of sub arrays
        for (int k=0;k<arr.length;k++) {

        }
        sum+=d;
    }
    return sum;
    }
    public static int sumofarr(int[] arr){
        int sum =0;
        for (int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner scan = new Scanner(System.in);
//        int len = scan.nextInt();
//        if (len==1||len==2){
//            System.out.println(0);
//            return;
//        }
//        int[] arr = new int[len];
//        for (int i=0;i<arr.length;i++){
//            arr[i]=scan.nextInt();
//        }
//        //sort
//        for (int n = arr.length; n > 0; n--) {
//            for (int i = 0; i < (n - 1); i++) {
//                if (arr[i] > arr[i + 1]) {
//                    swap2(arr, i, (i + 1));
//                }
//            }
//        }
//        int a = ans(arr);
//        System.out.println(a);
//    }
    public static int ans(int[] arr){
        int b = arr.length;
        int[] sumarr = new int[b];
        int max =0;
        for (int i = arr.length-1;i>=0;i--){
            max+=arr[i];
            sumarr[i]=max;
        }
        int as = Integer.MIN_VALUE;
        for (int i = 0;i<sumarr.length;i++){
            if (sumarr[i]>as && sumarr[i]%3==0){
                as = sumarr[i];
            }
        }
        return as;
    }







    public int numTeams(int[] rating) {
        int ans = 0;
        for (int i=0;i<rating.length-2;i++){
            for (int j = i+1;j<rating.length-1;j++){
                for (int k = j+1;k<rating.length;k++){
                    if (rating[i]>rating[j] && rating[j]>rating[k]){
                        ans++;
                    }else if (rating[i]<rating[j] && rating[j]<rating[k]){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer> ls = new LinkedList<Integer>();
    for (int i=0;i<nums.length;i++){
        int count=0;
        int a = nums[i];
        for (int j=i+1;j<nums.length;j++){
            if (a==nums[j] && !ls.contains(a)){
                    count++;
            }
        }
        if (count!=0){
            ls.add(a);
        }
    }
    return ls;
    }

    public int getMaximumGenerated(int n) {
    int[] arr = new int[n+1];
    arr[0]=0;
    arr[1]=1;
    for (int i=0;i<arr.length;i++){
        int k = 2*i;
        if (2<=k && k<=n) {
            arr[k] = arr[i];
        }
    }
    for (int i=0;i<arr.length;i++){
         int k = ((2*i)+1);
         if (2<=k && k<=n) {
             arr[k] = arr[i] + arr[i + 1];
         }
    }
    int max = arr[0];
    for (int i =0;i<arr.length;i++){
        if (max<arr[i]){
            max=arr[i];
        }
    }
    return max;
    }


    public int peakIndexInMountainArray(int[] arr) {
    int val =0;
    for (int i=0;i<arr.length-1;i++){
        if (arr[i]>arr[i+1]){
            val = i;
            break;
        }
    }
    return val;
    }
    public int sumOddLengthSubarrays(int[] arr) {
    int sum =0;

    for (int j=1;j<=arr.length;j+=2){
        int d=0;
        for (int k=0;k<=arr.length-j;k++) {
            for (int i = k; i < arr.length && d <= j; i++) {
                sum += arr[i];
                d++;
            }
        }
    }
    return sum;
    }
   public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col = accounts[0].length;
        int max =0;
        int[] totweal = new int[row];
    for (int i=0;i<row;i++){
        for (int j=0;j<col;j++){
            totweal[i]+=accounts[i][j];
        }
        if (totweal[i]>max){
             max = totweal[i];
        }
    }
    return max;
    }
    public int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length+1];
        altitudes[0]=0;
        int max = altitudes[0];
        for (int i=1;i<altitudes.length;i++){
            altitudes[i]=altitudes[i-1]+gain[i-1];
            if (max<altitudes[i]){
                max=altitudes[i];
            }
        }
        return max;

    }
    public int subtractProductAndSum(int n) {
        int sum =0;
        int pro = 1;
        while (n!=0){
            int digit = n%10;
            sum+=digit;
            pro*=digit;
            n = n/10;
        }

        int ans = pro-sum;
        return ans;
    }
    public int balancedStringSplit(String s) {
        int finans=0;
        for (int i=0;i<s.length()-1;i++){
            String newone="";
            for (int j=i+1;j<s.length();j++){
                if (i!=j) {
                    newone = s.substring(i, j);
                }
                int noL=0;
                int noR=0;

                for (int k =0;k<newone.length();k++){
                    if (newone.charAt(k)=='L'){
                        noL++;
                    }else if (newone.charAt(k)=='R'){
                        noR++;
                    }
                }
                if (noL==noR){
                    finans++;
                }

            }
        }
        return finans;
    }

    public int numberOfMatches(int n) {
        int fin = 0;
        int temp;
        while (n!=1){
            temp=n/2;
            fin+=temp;
            n=n-temp;
        }
        return fin;
    }
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for (int i = 0;i<jewels.length();i++){
            int ch = jewels.charAt(i);
            for (int j = 0 ;j<stones.length();j++){
                if (ch == stones.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i =0;i<nums.length;i++){
            for (int j =0;j<nums.length;j++){
                if (nums[i]==nums[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] fin = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int q = nums[i];
            int count =0;
            for (int j=0;j<nums.length;j++){
                if (q>nums[j]){
                    count++;
                }
            }
            fin[i]=count;
        }
        return fin;
}
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        ArrayList arrls = new ArrayList();
//        Scanner scan = new Scanner(System.in);
//        int q = scan.nextInt();
//        for (int i=0;i<q;i++){
//            int opt = scan.nextInt();
//            switch (opt){
//                case 1:
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    break;
//            }
//        }
//        for (int j =0;j<;j++){
//
//        }
//
//
//    }
 static int[] matchingStrings(String[] strings, String[] queries) {
        int[] finalarr = new int[queries.length];
        for (int i=0;i<queries.length;i++){
        int count = 0;
            for (int j=0;j<strings.length;j++){
                String a = strings[j];
                String b = strings[i];
                if (a.equals(b) && a.length()==b.length()){
                    count++;
                }
            }
            finalarr[i]=count;
        }
        return finalarr;
    }

    static int temp;
    static String del;
    static int len;
    static String string = "";
    static Stack<Integer> stack = new Stack<Integer>();
    static Stack<String> delstack = new Stack<String>();
    static Stack<Integer> lenstack = new Stack<Integer>();
    public static void ne(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i=0;i<n;i++){
            int opt = scan.nextInt();
            switch (opt){
                case 1:
                    String a = scan.next();
                    one(a);
                    stack.push(1);
                    len = a.length();
                    break;
                case 2:
                    int b = scan.nextInt();
                    two(b);
                    stack.push(2);
                    break;
                case 3:
                    int c = scan.nextInt();
                    three(c);
                   // stack.push(3);
                    break;
                case 4:
                    four();
                    break;
            }
        //    System.out.println(string);
        }
    }
    public static void one(String a){
        string+=a;
        lenstack.push(a.length());
    }
    public static void two(int b){
        delstack.push(string.substring(string.length()-b,string.length()-1));
        string = string.substring(0,string.length()-b);
    }
    public static void three(int c){
        System.out.println(string.charAt(c-1));
    }
    public static void four(){
        //System.out.println(string);
        //System.out.println(stack);
        int val = stack.pop();
        //System.out.println(val);
        //System.out.println(stack);
        if (val == 1){
            string=string.substring(0,string.length()-lenstack.pop());
        }else if (val ==2){
            string += delstack.pop();
        }
        //System.out.println(string);
    }








    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> fls = new LinkedList<Integer>();
        for (int i =(d) ;i<arr.size();i++){
            fls.add(arr.get(i));
        }
        for (int i = 0;i<d;i++){
            fls.add(arr.get(i));
        }
        return fls;
    }

//    static Stack<Integer> stack = new Stack<Integer>();
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        int que = scan.nextInt();
//        for (int i=0;i<que;i++){
//            int opt = scan.nextInt();
//            switch (opt){
//                case 1:
//                    int bh = scan.nextInt();
//                    ins(bh);
//                    break;
//                case 2:
//                    de();
//                    break;
//                case 3:
//                    pri();
//                    break;
//            }
//
//        }
//    }
    public static void ins(int a){
        stack.push(a);
        System.out.println(stack);
    }
    public static void de(){
        stack.pop();
        System.out.println(stack);
    }
    public static void pri(){
        System.out.println(stack);
        int max = Integer.MIN_VALUE;
     for (int i =0;i<stack.size();i++){
         if (max <stack.get(i)){
             max = stack.get(i);
         }
     }
        System.out.println(max);
    }

    static int arrayManipulation(int n, int[][] queries) {
        int[] arr = new int[n];
        LinkedList<Integer> ls = new LinkedList<Integer>();
        // for (int i =0;i<n;i++){
        //     arr[i]=0;
        // }
        //check start
        int max = Integer.MIN_VALUE;

        for (int i=0;i<queries.length;i++){
            int start = queries[i][0]-1;
            int end = queries[i][1]-1;
            int what = queries[i][2];

            for (int j=start;j<=end;j++){
                arr[j]+=what;
                if(arr[j]>max){
                    max = arr[j];
                }
            }
        }
        return max;
    }

    public int[] runningSum(int[] nums) {
    int[] ret = new int[nums.length];
    int sum = 0;
    for (int i = 0;i<nums.length;i++){
        sum+=nums[i];
        ret[i]=sum;
    }
    return ret;
    }
    public String defangIPaddr(String address) {
    String fin="";
    for (int i = 0;i<address.length();i++){
        if (Character.isDigit(address.charAt(i))){
            fin+=address.charAt(i);
        }else {
            fin+="[";
            fin+=address.charAt(i);
            fin+="]";
        }
    }
    return fin;
    }
    public double[] medianSlidingWindow(int[] nums, int k) {
        int len = nums.length-k+1;
        double[] arr = new double[len];
        if (k%2!=0){
            ////////////////zol hai yaha pegit
            for (int b =0;b<len;b++){
                arr[b] = median(nums,b,(b+((k+1)/2)));
            }
        }else {
            for (int b =0;b<len;b++){
                int mid1 = (b+(k/2));
                int mid2 = (b+(k/2)-1);
                arr[b] = ( mid1+mid2 )/2;
            }
        }
        return arr;
    }
    public int median(int[] brr,int sindex, int eindex){
        int[] arr = brr;
        int minindex=0;
        for (int i=sindex;i<eindex-1;i++){
            int min = Integer.MAX_VALUE;
            for (int j = i;j<arr.length;j++){
                if (min>arr[j]){
                    min = arr[j];
                    minindex=j;
                }
            }
            //Swap
            arr[minindex]=arr[i];
            arr[i]=min;
        }
        int median = arr[(sindex+eindex)/2];
        return median;
    }














    public static boolean backspaceCompare(String S, String T) {
        LinkedList<Character> stack1 = new LinkedList<Character>();
        LinkedList<Character> stack2 = new LinkedList<Character>();
        for (int i = 0;i<S.length();i++){
            if (Character.isAlphabetic(S.charAt(i))){
                stack1.push(S.charAt(i));
            }else {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            }
        }
        for (int i = 0;i<T.length();i++){
            if (Character.isAlphabetic(T.charAt(i))){
                stack2.push(T.charAt(i));
            }else {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
        }



        if (stack1.size() == stack2.size()){
            if (!stack1.equals(stack2)){
                return false;
            }
            return true;
        }else {
            return false;
        }
    }
    public List<String> buildArray(int[] target, int n) {
        List<String> ls= new  LinkedList<String>();
        int checck=0;
        for (int i=1;i<=n;i++){
            int count =0;
            ls.add("Push");
            for (int j = 0;j<target.length;j++){
                if (target[j] == i){
                    count++;
                    checck++;
                    break;
                }
            }
            if (count==0){
                ls.add("Pop");
            }
            if (checck==target.length){
                break;
            }
        }
        return ls;
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        int indexin2=0;
        int val=2;
        for (int i =0;i<nums1.length;i++){
            int count =0;
            for (int j=0;j<nums2.length;j++){
                if (nums1[i]==nums2[j]){
                    indexin2=j;
                    break;
                }
            }
            for (int k =(indexin2+1);k<nums2.length;k++){
                if (nums2[k]>nums1[i]){
                    val = nums2[k];
                    count++;
                    break;
                }
            }
            if (count==0){
                val = -1;
            }
        arr[i]=val;
        }
        return arr;
    }
    public static int searchInsert(int[] nums, int target) {
        int val=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if (((i+1)<(nums.length))) {
                if (target >= nums[i] && target <= nums[i + 1]) {
                    val = i + 1;
                }
            }

        }
        if (target>=nums[nums.length-1]){
            return nums.length;
        }
        return val;
    }

    public static boolean hasGroupsSizeX(int[] deck) {
        LinkedList<Integer> factor = new LinkedList<Integer>();

        for (int i =2;i<deck.length;i++){
            if (deck.length%i==0) {
                factor.add(i);
            }
        }
        int bha=0;
        System.out.println(factor);
        for (int k = 0;k<factor.size();k++) {
            for (int i = 0; i < deck.length; i++) {
                int count = 0;
                for (int j = 0; j < deck.length; j++) {
                    if (deck[i] == deck[j]) {
                        count++;
                    }
                }
                if ((count % factor.get(k)) != 0) {
                    return false;
                }else{
                    bha++;
                }

            }
            System.out.println(bha);
            if(bha == (deck.length)){
                return true;
            }
        }
        return true;
    }
    public static boolean met(String input){
        Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if (c=='[' || c=='{' || c=='('){
                stack.push(c);
            }else if (c=='}'){
                if (stack.isEmpty() || stack.pop()!=c){
                    return false;
                }
            }else if (c==']'){
                if (stack.isEmpty() || stack.pop()!=c){
                    return false;
                }
            }else if (c==')'){
                if (stack.isEmpty() || stack.pop()!=c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }}

//    class Difference {
//        private int[] elements;
//        LinkedList<Integer> ls = new LinkedList<Integer>();
//        public int maximumDifference = Integer.MIN_VALUE;
//        public Difference(int[] arr){
//            this.elements = arr;
//        }
//
//        LinkedList<Integer> lsls = new LinkedList<Integer>();
//        // Add your code here
//        public void computeDifference(){
//            for (int i=0;i<elements.length-1;i++){
//                for(int j = i+1;j<elements.length;j++){
//                    int temp = elements[i]-elements[j];
//                    if (temp>=0){
//                        ls.add(temp);
//                    }else {
//                        ls.add(-1*temp);
//                    }
//                }
//            }
//            int temp = elements[0]-elements[elements.length-1];
//            if (temp>=0){
//                ls.add(temp);
//            }else {
//                ls.add(-1*temp);
//            }
//            System.out.println(ls);
//        }
//        //   Correct it
//        public int maximumDifference(){
//            maximumDifference = Integer.MIN_VALUE;
//            while (!ls.isEmpty()){
//                if (ls.getLast()>maximumDifference){
//                    maximumDifference = ls.pop();
//                }else {
//                    ls.pop();
//                }
//            }
////
////            for (int i =0;i<ls.size();i++){
////                if (ls.get(i)>maximumDifference){
////                    maximumDifference=ls.get(i);
////                }
////            }
//            System.out.println(maximumDifference);
//            return maximumDifference;
//        }
//    } // End of Difference class

    //public class Solution {

//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int[] a = new int[n];
//            for (int i = 0; i < n; i++) {
//                a[i] = sc.nextInt();
//            }
//            sc.close();
//
//          //  Difference difference = new Difference(a);
//
//          //  difference.computeDifference();
//
//          //  System.out.print(difference.maximumDifference);
//        }

