import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/**train*/
class Solution2 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target){
                break;
            }
            if(nums[i] + nums[len-3] + nums[len-2] + nums[len-1] < target){
                continue;
            }
            for(int j = i+1; j < nums.length-2; j++){
                if(j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                if(nums[i] + nums[j] + nums[j+1] + nums[j+2] > target){
                    break;
                }
                if(nums[i] + nums[j] + nums[len-1] + nums[len-2]< target){
                    continue;
                }
                int left = j+1, right = len-1;
                while(left < right){
                    if(nums[i] + nums[j] + nums[left] + nums[right] == target){
                        List<Integer> member = new ArrayList<>();
                        member.add(nums[i]); member.add(nums[j]);member.add(nums[left]);member.add(nums[right]);
                        ans.add(member);
                        while(left < right && nums[left] == nums[left+1]){
                            left++;
                        }
                        left++;
                        while(left < right && nums[right] == nums[right-1]){
                            right--;
                        }
                        right--;
                    } else if (nums[i] + nums[j] + nums[left] + nums[right] < target) {
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}