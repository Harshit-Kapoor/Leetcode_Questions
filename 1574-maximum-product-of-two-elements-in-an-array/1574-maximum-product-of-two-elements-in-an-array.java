class Solution {
    public static int maxProduct(int[] nums) {

        int result = 0;
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int product = (currentMax - 1) * (nums[i] - 1);
            result = Math.max(result, product);

            currentMax = Math.max(currentMax, nums[i]);

        }

        return result;

    }
}