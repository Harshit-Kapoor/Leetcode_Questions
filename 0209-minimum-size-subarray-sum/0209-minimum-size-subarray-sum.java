class Solution {
        public static int minSubArrayLen(int target, int[] nums) {

            int minSize = Integer.MAX_VALUE;

            int i = 0;
            int j = 0;

            int sum = 0;

            while (j < nums.length) {

                sum += nums[j];

                while (sum >= target) {
                    minSize = Math.min(minSize, j - i + 1);
                    sum -= nums[i];
                    i++; 
                }

                j++;

            }

            return (minSize == Integer.MAX_VALUE) ? 0 : minSize;

        }
}