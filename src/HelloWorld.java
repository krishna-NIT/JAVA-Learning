import com.TreeNode;

import java.util.*;
import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args){
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 5;
        int[] ans = kthSmallestPrimeFraction(arr,3);
        System.out.println(arr[0]+" "+arr[1]);
    }

    public int distributeCandies(int[] candyType){

        int m = candyType.length/2;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int value : candyType){
            hmap.put(value, hmap.getOrDefault(value,0)+1);
        }
        int len = hmap.size();
        if (len < m){
            return len;
        }else {
            return m;
        }
    }

    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Double> pq = new PriorityQueue<>();
        HashMap<Double, int[]> hmap = new HashMap<>();
        for (int i = 0;i<arr.length-1;i++){
            for (int j = i +1;j<arr.length;j++){
                double fract = (double) arr[i]/arr[j];
                pq.add(fract);
                int[] nd = new int[2];
                nd[0] = arr[i];
                nd[1] = arr[j];
                hmap.put(fract,nd);
            }
        }
        while (k >1){
            System.out.println(pq.poll());
            //pq.poll();
            k--;
        }
        return hmap.get(pq.poll());
    }

    public int minimumOperations(int[] nums) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums){
            if (n > 0){
                pq.add(n);
            }
        }

        while (pq.size() > 0){
            int min = 0;
            while (min == 0){
                min = pq.poll();
            }

            LinkedList<Integer> ls = new LinkedList<>();
            while (pq.size()>0){
                int v = pq.poll() - min;
                if (v > 0){
                    ls.add(v);
                }
            }
            for (int i = 0;i<ls.size();i++){
                pq.add(ls.get(i));
            }
            count++;
        }
        return count;
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> hmap1 = new HashMap<>();
        HashMap<String, Integer> hmap2 = new HashMap<>();

        for (int i = 0;i<list1.length;i++){
            hmap1.put(list1[i],i);

        }
        for (int i = 0;i<list2.length;i++){
            hmap2.put(list2[i],i);
        }

        LinkedList<String> ls = new LinkedList<>();
        int min_sum_count = Integer.MAX_VALUE;
        for (int i = 0;i<list2.length;i++){
            if (hmap1.containsKey(list2[i])){
                hmap2.put(list2[i],hmap2.get(list2[i])+hmap1.get(list2[i]));
                ls.add(list2[i]);

                int sm = hmap2.get(list2[i]);
                if (sm <min_sum_count){
                    min_sum_count = sm;
                }
            }else {
                hmap2.remove(list2[i]);
            }
        }

        System.out.println(min_sum_count);

        for (int i = 0;i<ls.size();i++){
            if (hmap2.get(ls.get(i)) != min_sum_count){
                hmap2.remove(ls.get(i));
            }
        }

        ArrayList<String> arrls = new ArrayList<>();
        for (String x : hmap2.keySet()){
            if (hmap2.get(x) != min_sum_count){
                hmap2.remove(x);
            }
        }


        String[] str = new String[hmap2.size()];
        int i = 0;
        for (String st : hmap2.keySet()){
            str[i] = st;
            i++;
        }
        return str;
    }

    public boolean checkAlmostEquivalent(String word1, String word2) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Character, Integer> hmap1 = new HashMap<>();
        HashMap<Character, Integer> hmap2 = new HashMap<>();
        LinkedList<Character> ls = new LinkedList<>();
        for (int i = 0;i<word1.length();i++){
            hmap1.put(word1.charAt(i),hmap1.getOrDefault(word1.charAt(i), 0)+1);
            if (!ls.contains(word1.charAt(i))){
                ls.add(word1.charAt(i));
            }
            hmap2.put(word2.charAt(i),hmap2.getOrDefault(word2.charAt(i), 0)+1);
            if (!ls.contains(word2.charAt(i))){
                ls.add(word2.charAt(i));
            }
        }

        for (int i = 0;i<ls.size();i++){
            int a = 0,b = 0;
            if (hmap1.containsKey(ls.get(i))) {
                a = hmap1.get(ls.get(i));
            }
            if (hmap2.containsKey(ls.get(i))) {
                b = hmap2.get(ls.get(i));
            }
            int diff = (a-b);
            if (Math.abs(diff) > 3){
                return false;
            }
        }
        return true;
    }

    public String bestHand(int[] ranks, char[] suits) {
        int status = 0;
        for (int i = 0;i<suits.length-1;i++){
            if (suits[i] != suits[i+1]){
                status++;
            }
        }
        if (status == 0){
            return "Flush";
        }
        status = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int rk : ranks){
            hmap.put(rk, hmap.getOrDefault(rk,0)+1);
            if (hmap.get(rk) == 3){
                return "Three of a Kind";
            }else if (hmap.get(rk) == 2){
                status++;
            }
        }
        if (status != 0){
            return "Pair";
        }
        return "High Card";
    }

    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, LinkedList<Integer>> hmap = new HashMap<>();
        int[] arr = new int[k];
        for (int i = 0; i<logs.length;i++) {
            int id = logs[i][0];
            int min = logs[i][1];
            if (hmap.containsKey(id)) {
                LinkedList<Integer> lsget = hmap.get(id);
                if (!lsget.contains(min)) {
                    lsget.add(min);
                }
                hmap.replace(id, lsget);
            } else {
                LinkedList<Integer> lsi = new LinkedList<>();
                lsi.add(min);
            }
        }
        return arr;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arrls = new ArrayList<>();
        for (int value : nums){
            if (!arrls.contains(value)){
                arrls.add(value);
            }
        }
        for (int i =1; i<=nums.length ;i++) {
            if (!arrls.contains(i)) {
                arrls.add(i);
            }
        }
        return arrls;
    }

    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        LinkedList<Integer> keys = new LinkedList<>();

        int max_count = 0;
        for (int i = 1;i<=n;i++){
            int sum_digit = sum_digit(i);
            if (hmap.containsKey(sum_digit)){
                hmap.replace(sum_digit,hmap.get(sum_digit)+1);
            }else {
                hmap.put(sum_digit,1);
                keys.add(sum_digit);
            }
            if (max_count < hmap.get(sum_digit)){
                max_count = hmap.get(sum_digit);
            }
        }
        int max_count_group = 0;
        for (int i = 0;i<keys.size();i++){
            if (hmap.get(keys.get(i)) == max_count){
                max_count_group++;
            }
        }
        return max_count_group;
    }
    public static int sum_digit(int n){
        int sum = 0;
        while (n>0){
            sum += (n%10);
            n /= 10;
        }
        return sum;
    }

    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if (hmap.containsKey(ch)){
                return ch;
            }else {
                hmap.put(ch,2);
            }
        }
        return 's';
    }


    static int numberOfPairs2(int[] a, long k) {
        int N = a.length;
        int cntPairs = 0;
        HashMap<Integer,Integer> cntFre = new HashMap<Integer,Integer>();
        ArrayList<Integer> arrls = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if(cntFre.containsKey(a[i]))
                cntFre.put(a[i], cntFre.get(a[i]) + 1);
            else
                cntFre.put(a[i], 1);
                arrls.add(a[i]);
        }

        System.out.println(cntFre.containsKey(46));
        for (int j = 0;j<arrls.size();j++){
            int i = arrls.get(j);
            System.out.println(i);
            System.out.println(k-i);
            System.out.println(cntFre.containsKey(k-i));
            int nu = (int) (k-i);
            if (2 * i == k) {
                if (cntFre.get(i) > 1)
                    cntPairs += 2;
            }else if (cntFre.containsKey(nu)){
                cntPairs += 1;
            }
            System.out.println("Count ="+cntPairs);
        }
        cntPairs = cntPairs / 2;
        return cntPairs;
    }

    static int numberOfPairs(int[] a, long k){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0;i<a.length-1;i++){
            for (int j = i+1;j<a.length;j++){
                if (a[i] + a[j] == k){
                    if (!hmap.containsKey(a[i])){
                        if (!hmap.containsKey(a[j])){
                            hmap.put(a[i], a[j]);
                        }
                    }
                }
            }
        }
        return hmap.size();
    }

    static int collectGold(int[][] gold, int x, int y, int n, int m, int[][] dp){
        // Base condition.
        if ((x < 0) || (x == n) || (y == m)) {
            return 0;
        }

        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        // Right upper diagonal
        int rightUpperDiagonal
                = collectGold(gold, x - 1, y + 1, n, m, dp);

        // right
        int right = collectGold(gold, x, y + 1, n, m, dp);

        // Lower right diagonal
        int rightLowerDiagonal
                = collectGold(gold, x + 1, y + 1, n, m, dp);

        // Return the maximum and store the value
        return gold[x][y]
                + Math.max(Math.max(rightUpperDiagonal,
                rightLowerDiagonal),
                right);
    }

    static int getMaxGold(int[][] gold)
    {
        int n = gold.length;
        int m = gold[0].length;
        int maxGold = 0;
        int[][] dp = new int[n][m];
        for (int row = 0; row < n; row++) {
            Arrays.fill(dp[row], -1);
        }
        for (int i = 0; i < n; i++) {
            int goldCollected
                    = collectGold(gold, i, 0, n, m, dp);
            maxGold = Math.max(maxGold, goldCollected);
        }
        return maxGold;
    }



    public int maximumSum(int[] nums) {
        ArrayList<Integer> arrls = new ArrayList<>();
        for (int value : nums){
            int sumofdigit = 0;
            int num = value;

            while (value>0){
                sumofdigit += (value%10);
                value /= 10;
            }
            arrls.add(sumofdigit);
        }
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int i = 0;i<arrls.size();i++){
            if (hmap.containsKey(arrls.get(i))){
                hmap.replace(arrls.get(i),hmap.get(hmap)+1);
            }else {
                hmap.put(arrls.get(i),1);
            }
        }
        int i = 0;
        for (int value : arrls){
            if (hmap.get(value) == 1){
                hmap.remove(value);
                arrls.remove(i);
            }
            i++;
        }


        return -1;
    }

    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int value : piles){
            pq.add(value);
        }
        while (k>0){
            int resp = pq.poll();
            int value = resp/2;
            resp -= value;
            pq.add(resp);
            k--;
        }
        int ans = 0;
        while (!pq.isEmpty()){
            ans += pq.poll();
        }
        return ans;
    }

    public String frequencySortk(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if (hmap.containsKey(ch)){
                hmap.put(ch, hmap.get(ch)+1);
            }else {
                hmap.put(ch, 1);
            }
        }

        // Priority Queue is awersome
        PriorityQueue<Character> pq = new PriorityQueue<>(
                (a,b) -> {
                    return hmap.get(b)-hmap.get(a);             // it means to store values such that greater frequency character comes first
                }
        );
        PriorityQueue<Character> pq2 = new PriorityQueue<>(
                (a,b) -> {
                    return hmap.get(b)-hmap.get(a);
                }
        );

        ArrayList<Character> arrch = new ArrayList<>(hmap.keySet());
        for (int i = 0;i<arrch.size();i++){
            pq.add(arrch.get(i));
        }

        String str = "";
        while (hmap.size() >= 1){
            char ch = pq.poll();
            int count = hmap.get(ch);

            for (int i = 0;i<count;i++){
                str += ch;
            }
            hmap.remove(ch);
        }
        return str;
    }



    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int value : nums){
            pq.add(value);
        }

        while (k > 0){
            int eml = pq.poll();
            if (k == 1){
                return eml;
            }
            k--;
        }
        return -1;
    }

    public String get_rank_apl(int rank){
        if (rank == 1){
            return "Gold Medal";
        }else if (rank == 2){
            return "Silver Medal";
        }else if (rank == 3){
            return "Bronze Medal";
        }else {
            return Integer.toString(rank);
        }
    }


    public String reorganizeString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        LinkedList<Character> ls = new LinkedList<>();
        for (int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                map.replace(ch, map.get(ch)+1);
            }else {
                map.put(ch,1);
                ls.add(ch);
            }
        }

        return "S";
    }

    public static List<Integer> sortedMatrix(int[][] mat, int n) {
        // Write your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i =0;i<n;i++){
            for (int j = 0;j<n;j++){
                pq.add(mat[i][j]);
            }
        }
        ArrayList<Integer> ls = new ArrayList<>();

        while (!pq.isEmpty()){
            ls.add(pq.poll());
        }
        return ls;
    }

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i =0;i<matrix.length;i++){
            for (int j = 0;j<matrix[0].length;j++){
                pq.add(matrix[i][j]);
            }
        }
        while (k>1){
            pq.poll();
            k--;
        }
        return pq.poll();
    }



    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap();
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                map.replace(ch, map.get(ch)+1);
            }else {
                map.put(ch, 1);
            }
        }
        return "Ans Incomplete";
    }

    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : amount){
            if (i != 0){
                pq.add(i);
            }
        }
        int count = 0;

        while (pq.size() > 1){
            int big = pq.poll();
            int small = pq.poll();
            if (small-1 != 0){
                pq.add(small-1);
            }
            if (big-1 != 0) {
                pq.add(big - 1);
            }
            count++;
        }

        if (pq.size() == 1){
            count += pq.poll();
            return count;
        }
        return count;
    }

    public int largestInteger(int num) {
        PriorityQueue<Integer> odd = new PriorityQueue<>();
        PriorityQueue<Integer> even = new PriorityQueue<>();
        List<Integer> even_status = new ArrayList<>();


        while (num >0){
            int digit = num%10;
            num /= 10;

            if (digit%2 == 0){
                even.add(digit);
                even_status.add(1);
            }else {
                odd.add(digit);
                even_status.add(0);
            }
        }

        int multiplier = 1;
        int no = 0;
        int i = 0;
        while (multiplier < Math.pow(10,even_status.size()) && i < even_status.size()){
            int ev_Status = even_status.get(i);
            int mul;
            if (ev_Status == 1){
                mul = even.poll();
            }else {
                mul = odd.poll();
            }
            no += (multiplier * mul);
            multiplier *= 10;
            i++;
        }
        return no;
    }

    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : score) {
            pq.add(i);
        }
        String[] rank = new String[score.length];
        int rankh = score.length;

        for (int i = 0;i<rank.length;i++){
            int rk = pq.poll();

        }


        return rank;
    }

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones){
            pq.add(i);
        }
        while (pq.size() > 1){
            int max1 = pq.poll();
            int max2 = pq.poll();

            if (max1 == max2){

            }else {
                pq.add(max1-max2);
            }
        }

        if (pq.size() == 1){
            return pq.poll();
        }else if (pq.size() == 0){
            return 0;
        }
        return 0;
    }

    public static int get_min_trips(int[] arr){
        List<Integer> distinct = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                map.replace(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
                distinct.add(arr[i]);
            }
        }

        int count = 0;
        for (int i = 0;i<distinct.size();i++){
            int response = no_of_trip(map.get(distinct.get(i)),0);
            if (response == -1){
                return -1;
            }
            count += response;
        }
        return count;
    }
    public static int no_of_trip(int weight, int count){
        if (weight == 0){
            return count;
        }
        if (weight == 1){
            return -1;
        }else if (weight == 2){
            return 1+count;
        }else if (weight == 3){
            return 1+count;
        }

        int rem = count%3;
        int div = count/3;
        count += div;

        return no_of_trip(rem,count);
    }



    public static int max_greyness(List<String> strls){
        int[] rsum = new int[strls.size()];
        int[] csum = new int[strls.get(0).length()];

        int rmax = 0;
        int cmax = 0;

        for (int i = 0;i<strls.size();i++){
            int rowsum = 0;
            for (int j = 0 ;j<strls.get(0).length();j++){
                if (strls.get(i).charAt(j) == '1'){
                    rowsum += 1;
                }
            }
            rsum[i] = rowsum;
            if (rowsum > rmax){
                rmax = rowsum;
            }
        }

        for (int i = 0;i<strls.get(0).length();i++){
            int colsum = 0;
            for (int j = 0 ;j<strls.size();j++){
                if (strls.get(j).charAt(i) == '1'){
                    colsum += 1;
                }
            }
            csum[i] = colsum;
            if (colsum > cmax){
                cmax = colsum;
            }
        }
        int max_grey = ((2*(cmax + rmax)) - (strls.size() + strls.get(0).length()));
        return max_grey;
    }

    public List<String> wordSubsets(String[] words1, String[] words2) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> arrls = new ArrayList<String>();
        for (int i = 0;i<words1.length;i++){
            map.put(words1[i], 0);
            int count = 0;
            for (int j = 0;j<words2.length;j++){
                if (words1[i].contains(words2[i])){
                    count++;
                }
            }
            if (count == words2.length){
                arrls.add(words1[i]);
            }
        }
        return arrls;
    }

    HashMap<Character, String> mapk = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        List<String> ls = new ArrayList<>();
        if (digits.length() == 0){
            return ls;
        }
        mapk.put('2',"abc");
        mapk.put('3',"def");
        mapk.put('4',"ghi");
        mapk.put('5',"jkl");
        mapk.put('6',"mno");
        mapk.put('7',"pqrs");
        mapk.put('8',"tuv");
        mapk.put('9',"wxyz");
        backTrack(0,digits,ls,"");
        return ls;
    }
    public void backTrack(int i, String digits, List<String> arr, String str){
        if (i == digits.length()){
            arr.add(str);
        }else {
            //String numString = map.get(digits.charAt(i));
//            for (int j = 0;j<numString.length();j++){
//                String s = str;
//                s += numString.charAt(j);
//                backTrack(i+1,digits,arr,s);
//            }
        }
    }

    public static boolean isSafe(int[][] arrstatus, int x, int y){
        if (x < arrstatus.length && y < arrstatus.length && arrstatus[x][y] == 1){
            return true;
        }
        return false;
    }

    public static boolean ratinmaze(int[][] arr, int x, int y, int[][] sol){
        if (x ==  arr.length-1 && y == arr.length-1){
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(arr,x,y)){
            sol[x][y] = 1;
            if (ratinmaze(arr,x+1,y,sol)){
                return true;
            }else if (ratinmaze(arr,x,y+1,sol)){
                return true;
            }else {
                sol[x][y] = 0; // backtrack
                return false;
            }
        }else {
            sol[x][y] = 0;
            return false;
        }

    }
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))){
                if (map.get(t.charAt(i)) == 0){
                    return t.charAt(i);
                }else {
                    map.replace(t.charAt(i), map.get(t.charAt(i))-1);
                }
            }else {
                return t.charAt(i);
            }
        }
        return 'd';
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int index = 0;
        for (int i=0;i<s.length();i++){
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),index);
                index++;
            }
        }

        index = 0;
        int[] iloc = new int[s.length()];
        for (int i=0;i<s.length();i++) {
            iloc[i] = map.get(s.charAt(i));
        }

        HashMap<Character, Integer> word = new HashMap<>();
        for (int i=0;i<t.length();i++){
            if (!word.containsKey(t.charAt(i))){
                word.put(t.charAt(i),index);
                index++;
            }
        }
        for (int i=0;i<s.length();i++) {
            if (iloc[i] != word.get(t.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
                if (map.get(nums[i]) > 1){
                    return true;
                }
            }else {
                map.put(nums[i],1);
            }
        }
        return false;
    }


    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        LinkedList<Integer> ls = new LinkedList<Integer>();
        ls.add(n);
        while (n>1){
            ArrayList<Integer> arls = new ArrayList<>();
            int num = n;
            int sum = 0;
            while (num > 0){
                int digit = num % 10;
                num /= 10;
                sum += (digit*digit);
            }
            n = sum;
            System.out.println(n);
            if (ls.contains(n)){
                return false;
            }
            ls.add(n);
            if(n == 1){
                return true;
            }
        }

        if (n==1){
            return true;
        }else {
            return false;
        }
    }

    public static Integer maxfreqno(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxno = Integer.MIN_VALUE;
        int freq = 0;
        for (int i = 0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
            if (map.get(arr[i]) > freq){
                maxno = arr[i];
                freq = map.get(arr[i]);
            }
        }
        return maxno;
    }

    public static int maxFrequencyNumber(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> arls = new ArrayList<>();
        for (int i =0;i<arr.length;i++){
            if (hm.containsKey(arr[i])){
                int precount = hm.get(arr[i]);
                hm.replace(arr[i],precount+1);
            }else {
                hm.put(arr[i],1);
                arls.add(arr[i]);
            }
        }
        int maxno = 0;
        int maxrepeat = Integer.MIN_VALUE;
        for (int i =0;i<arls.size();i++){
            if (maxrepeat < hm.get(arls.get(i))){
                maxrepeat = hm.get(arls.get(i));
                maxno = arls.get(i);
            }
        }
        return maxno;
    }

    public static ArrayList<Integer> remodub(int arr[]){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0;i<arr.length;i++){
            if (!map.containsKey(arr[i])){
                ans.add(arr[i]);
                map.put(arr[i], true);
            }
        }
        return ans;
    }

    public static int arcessium(List<Integer> ls, int target){
        int start = 0;
        int end = ls.size()-target;
        int sum = 0;
        for (int i = end;i<ls.size();i++){
            sum += ls.get(i);
        }
        int maxsum = sum;
        int i = 0;
        while (end<ls.size()){
            sum += ls.get(i);
            sum -= ls.get(end);
            if (maxsum < sum){
                maxsum = sum;
            }
            end++;
            i++;
        }
        return maxsum;
    }


    public static boolean checkRedundantBrackets(String expression) {
        //Your code goes here
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();

        for (int i =0;i<expression.length();i++){
            
        }
        return true;
    }

    public static String moveHyphen (String str, int n){
        String st = "";
        for (int i =0;i<str.length();i++){
            if (Character.isAlphabetic(str.charAt(i))){
                st += str.charAt(i);
            }
        }
        int no_of_dash = n - st.length();
        String fin = "";
        for (int i = 0;i<no_of_dash;i++){
            fin += "-";
        }
        fin += st;
        return fin;
    }

    public static String moveHyphen2 (String str, int n)
    {
        String res = "";
        for (int i = 0; i < n; i++)
        {
            if (str.charAt (i) == '-')
                res = str.charAt (i) + res;
            else
                res = res + str.charAt (i);
        }
        return res;
    }

    public static void reverseQueue(Queue<Integer> input) {
        if (input.size()<=0){
            return;
        }
        int temp = input.remove();
        reverseQueue(input);
        input.add(temp);
    }


    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        if (input.size()<=0){
            return;
        }
        int temp = input.pop();
        reverseStack(input,extra);
        while (!input.isEmpty()){
            extra.add(input.pop());
        }
        input.add(temp);
        while (!extra.isEmpty()){
            input.add(extra.pop());
        }
    }

    public static void printLevelWise(TreeNode<Integer> root){
        System.out.println(root.data);
        int n = root.children.size();
        if (n<=0){
            return;
        }
        for (int i =0;i<n;i++){
            System.out.print(root.children.get(i).data+" ");
        }
        System.out.println();
        for (int i =0;i<n;i++){
            printLevelWise(root.children.get(i));
        }
    }



    LinkedList<Integer> ls = new LinkedList<Integer>();
    int count = 0;
    public int ArrayChallenge(int num){
        num = Math.abs(num);

        int no = num;
        while (no >0){
            int rem = num%10;

            if (ls.getLast() == rem){
                return count;
            }

            ls.add(rem);
            no /= 10;
        }
        count++;
        return 0;
    }

    public int minMoves(int target, int maxDoubles) {
        int start = 1;
        int count = 0;

        int d = (int) (target/Math.pow(2,maxDoubles));
        

        return count;
    }

    public static String[] divideString(String s, int k, char fill) {
        int len = s.length()/k;
        if (s.length()%k>0){
            len++;
        }
        String[] arr = new String[len];
        int startind = 0;
        for (int i=0;i<len-1;i++){
                arr[i] = s.substring(startind, startind + k);
                startind += k;
        }
        arr[arr.length-1] = s.substring(startind,s.length());
        int rem = s.length()%k;
        if (rem>0) {
            for (int i = 0; i < k-rem; i++) {
                arr[arr.length - 1] += fill;
            }
        }
        return arr;
    }

    public static int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (int i=0;i<sentences.length;i++){
            int count = 1;
            for (int j=0;j<sentences[i].length();j++){
                if (sentences[i].charAt(j)==' '){
                    count++;
                }
            }
            if (sentences[i].charAt(sentences[i].length()-1) == ' '){
                count--;
            }
            if (sentences[i].charAt(0) == ' '){
                count--;
            }
            if (count>ans){
                ans = count;
            }
        }
        return ans;
    }

//    int[] brr = new int[n];
//
//        for (int i = 0;i<n;i++){
//        int index = 0;
//        int a = arr[i];
//        int b = Integer.MAX_VALUE;
//        for (int j = 0;j<n;j++){
//            if (a < arr[j] && b>arr[j]){
//                b = arr[j];
//            }
//        }
//
//
//        brr[i] = b;
//        arr[index] = a;
//    }
//
//
//    int count = 0;
//        for (int i = 0;i<n;i++){
//        if (arr[i] < brr[i]){
//            count++;
//        }
//        System.out.print(brr[i]+" ");
//    }
//
//        System.out.println();
//        System.out.println(count);

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        int M = scan.nextInt();
//        int K = scan.nextInt();
//
//        int[] a = new int[N];
//        int[] b = new int[M];
//
//        for (int i= 0;i<N;i++){
//            a[i] = scan.nextInt();
//        }
//        for (int i= 0;i<M;i++){
//            b[i] = scan.nextInt();
//        }
//        int maxbook = 0;
//        int ai = 0;
//        int bi = 0;
//
//        while (K>0 && ai < N && bi < M) {
//            int minus = a[ai];
//            if (a[ai] > b[bi]) {
//                minus = b[bi];
//                bi++;
//            }else {
//                ai++;
//            }
//
//            if (K-minus >= 0) {
//                K -= minus;
//                maxbook++;
//            }else {
//                System.out.println(maxbook);
//                return;
//            }
//        }
//        if (ai < N && bi >= M && K>0){
//            if (K-a[ai] >= 0) {
//                maxbook++;
//                K -= a[ai];
//            }else {
//                System.out.println(maxbook);
//                return;
//            }
//            ai++;
//        }
//        if (ai >= N && bi < M && K>0){
//            if (K-b[bi] >= 0) {
//                maxbook++;
//                K -= b[bi];
//            }else {
//                System.out.println(maxbook);
//                return;
//            }
//            bi++;
//        }
//        System.out.println(maxbook);
//    }

    public String addSpaces(String s, int[] spaces) {
        String ans = "";
        for (int i =0;i<spaces.length;i++){
            int loc = spaces[i];
            
        }
        return ans;
    }

    public static int ispossible(String s, String com){
        int ans = 0;
        for (int i = 0;i<s.length()-1 && i<com.length()-1;i++){
            int a1 = (int) s.charAt(i);
            int a2 = (int) s.charAt(i+1);
            int b = (int) com.charAt(i);
            int b2 = (int) com.charAt(i+1);
            if (a1 > b){
                return ans;
            }else if (a2 > b){
                return ans+1;
            }
            if (a1 > b2){
                return ans+1;
            }
            if (a1 > a2){
                //swap
                s = charinterchage(s,i,i+1);
                ans++;
            }
        }
        if (ans == 0){
            ans = -1;
        }
        return ans;
    }
    public static String charinterchage(String s, int i, int j){
        String fin = "";
        if (i != 0){
            fin += s.substring(0,i);
        }
        fin += s.charAt(j);
        fin += s.charAt(i);
        if (j != s.length()-1){
            fin += s.substring(j+1,s.length());
        }
        return fin;
    }












    //        double doublevar = 22.85;
//        double doublevar2 = 80.00;
//        double p = (doublevar+doublevar2)*100.00;
//        double rem = p % (40.00);
//
//        boolean val = (rem == 0) ? true : false;
//
//        System.out.println(val);
//        if(!val){
//            System.out.println("Got some Reminder");
//        }
//
//        long pri = toMilesPerHour(-5.6);
//        System.out.println(pri);
//
//        printConversion(25.42);
//
//
//        boolean a = shouldWakeUp(false,2);
//        System.out.println(a);
//
//        printMegaBytesAndKiloBytes(5000);
//
//        boolean bhagwat = areEqualByThreeDecimalPlaces(-3.1756d,-3.175d);
//        System.out.println("3 Decical Output  :  " +bhagwat);
//
//        printYearsAndDays(561600);


    //Playing Cat
    public static boolean isCatPlaying(boolean summer, int temperature){
        if ( temperature<=45 && temperature>=25){
            if (summer == true){
                return true;
            }else if (temperature<=35){
                return true;
            }else{
                return false;
            }
        } else {
            return false;
        }
    }



    //Entity Printer
    public static void printEqual(int a, int b, int c){
    if (a<0 || b<0 || c<0){
        System.out.println("Invalid Value");
    } else if (a==b && b==c){
        System.out.println("AA numbers are equal");
    } else if (a!=b && b!=c && a!=c){
        System.out.println("All numbers are different.");
    } else{
        System.out.println("Neither all are equal or different.");
    }
    }



    //Min to Years and Days Calculator
    public static void printYearsAndDays(long minutes){
        if ( minutes >= 0){
            int YY = (int)(minutes/525600);
            int ZZ = (int)( (minutes%525600) / 1440);
            System.out.println(minutes+" min = "+YY+" y and "+ZZ+" d");
        }else{
            System.out.println("Invalid Value");
        }
    }


    //Area Cal of circle and Rectangle
    public static double area(double radius){
        if (radius >= 0){
            return (radius*radius*Math.PI);
        }else{
            return -1;
        }
    }

    public static double area(double x, double y){
        if (x >= 0 && y >=0){
            return (x*y);
        }else{
            return -1;
        }
    }



    // 3decimal with Decimal Error


    public static boolean areEqualByThreeDecimalPlaces(double a,double b){
        int tempa = (int)a;
        int tempb = (int)b;
        System.out.println(tempa+""+tempb);

        int a3dec = (int)((a-tempa)*1000);
        int b3dec = (int)((b-tempb)*1000);
        System.out.println(a3dec+""+b3dec);
        System.out.println(b-tempb);

        if (tempa == tempb && a3dec == b3dec){
            return true;
        }else{
            return false;
        }
    }

    // 3 Deciamls

    public static boolean areEqualByThreeDecimalPlacesexact(double firstValue, double secondValue) {
        int moveThreeDecimalPlacesToRight = (int) Math.pow(10, 3);
        return (int) (firstValue * moveThreeDecimalPlacesToRight) == (int) (secondValue * moveThreeDecimalPlacesToRight);
    }


    // km miles converter

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }else {
            int mph = (int) (kilometersPerHour * 2/3);
            long retval = mph;
            return retval;
        }
    }
    public static void printConversion(double kilometersPerHour){
        double milesHr = (kilometersPerHour * 2/3);
        long mile = Math.round(milesHr);
        if (kilometersPerHour >=0){
            System.out.println(""+kilometersPerHour +" Km/h = "+mile +" mi/h"   );
        }else{
            System.out.println("Invalid Value");}
    }



    // Mile Convertor Exact Ans
    public static long toMilesPerHourexact(double kilometersPerHourexact) {
        if (kilometersPerHourexact < 0d) {
            return -1L;
        }

        return Math.round(kilometersPerHourexact / 1.609d);
    }

    public static void printConversionexact (double kilometersPerHourexact) {
        if (kilometersPerHourexact < 0d) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHourexact(kilometersPerHourexact);
            System.out.println(kilometersPerHourexact + " km/h = " + milesPerHour + " mi/h");
        }
    }




    // megabytes converter
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes>=0) {
            int ZZ = kiloBytes % 1024;
            int YY = (int) (kiloBytes / 1024);
            System.out.println(kiloBytes + " KB = " + YY + " MB and " + ZZ + " KB");
        }else{
            System.out.println("Invalid Value");
        }
    }

    // Barking Dog
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (barking == true) {
            if (hourOfDay <= 23 && hourOfDay >= 0) {
                if (hourOfDay < 8 || hourOfDay > 22) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }else{
            return false;
        }
    }


    //Equal Sum Checker
    public static boolean hasEqualSum(int p, int q, int r){
        if (p+q == r){
            return true;
        }else{
            return false;
        }
    }



    //teen no checker
    public static boolean hasTeen(int q,int w, int r){
        if ((q <=19 && q>=13) || (w <=19 && w>=13) || (r <=19 && r>=13) ){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isTeen(int no){
//        if (no>=13 && no<=19){
//            return true;
//        }else{
//            return false;
//        }
        boolean bol =  (no>=13 && no<=19) ? true : false;
        return bol;
    }
}



