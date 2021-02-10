public class Main {
    public static void main(String[] args){
        System.out.println(Math.pow(2,31));
    }
}
//        public int[] twoSum(int[] nums, int target) {
//            int[] ans = new int[2];
//            for(int i=0;i<nums.length;i++){
//                for(int j=0;j<nums.length;j++){
//                    if(nums[i]+nums[j]==target && i!=j){
//                        ans[0]=i;
//                        ans[1]=j;
//                    }
//                }
//            }
//            return ans;
//        }
////
////    public List<List<Integer>> threeSum(int[] nums) {
////        List<List<Integer>> ls = new List<List<Integer>>();
//
//
//            for (int i=0;i<nums.length;i++){
//                for (int b=i+1;b<nums.length;b++){
//                     for (int k=b+1;k<nums.length;k++){
//                            if (nums[i]+nums[b]+nums[k]==0){
//
//                    }
//                }
//            }
//        }
//    }
//
//    public int reverse(int x) {
//    int ans =0;
//    if (x<(Math.pow(2,31)-1) && x>=-(Math.pow(2,31))){
//        return ans;
//    }else {
//        return 0;
//    }
//    while (x!=0){
//        int rem = x%10;
//        ans=(ans*10)+rem;
//        x/=10;
//    }
//    return ans;
//    }
//}
//
