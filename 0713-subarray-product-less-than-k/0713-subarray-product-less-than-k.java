class Solution {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        int i = 0;
        int j = 0;
        int product = 1;
        int n = nums.length;
        int count = 0;

        if (k <= 1) {
            return 0;
        }

        while (j < n) {

            product *= nums[j];

            while (product >= k) {
                product /= nums[i];
                i++;
            }

            if (product < k) {
                count += ((j - i) + 1);
            }

            j++;

        }

        return count;

    }
}