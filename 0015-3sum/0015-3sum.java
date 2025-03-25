class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {

            int n1 = nums[i];
            int target = -n1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            twoSum(nums, target, i + 1, nums.length - 1, result);
            
        }

        return result;

    }

    public static void twoSum(int[] nums, int target, int i, int j, List<List<Integer>> result) {
        
        while (i < j) {

            if (nums[i] + nums[j] < target) i++;    
            else if (nums[i] + nums[j] > target) j--;
            else if (nums[i] + nums[j] == target) {
                while (i < j && nums[i] == nums[i+1]) i++;
                while (i < j && nums[j] == nums[j-1]) j--;

                List<Integer> temp = new ArrayList<>();
                temp.add(-target);
                temp.add(nums[i]);
                temp.add(nums[j]);                
                result.add(temp);   
                i++;
                j--;
            }
        }
        
    }

}