public class Main {
        public int[] twoSum(int[] nums, int target) {
            int[] ans = new int[2];
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++){
                    if(nums[i]+nums[j]==target && i!=j){
                        ans[0]=i;
                        ans[1]=j;
                    }
                }
            }
            return ans;
        }

}