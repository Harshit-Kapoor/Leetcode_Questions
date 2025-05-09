class Solution {
    public int minPairSum(int[] nums) {

        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;
        int max = Integer.MIN_VALUE;

        while (start < end) {
            max = Math.max(max, nums[start] + nums[end]);
            start++;
            end--;
        }

        return max;
        
    }
}