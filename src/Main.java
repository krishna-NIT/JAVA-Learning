import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new List<List<Integer>>();


            for (int i=0;i<nums.length;i++){
                for (int b=i+1;b<nums.length;b++){
                     for (int k=b+1;k<nums.length;k++){
                            if (nums[i]+nums[b]+nums[k]==0){

                    }
                }
            }
        }
    }


}