class Solution {
        public static int minSubArrayLen(int target, int[] nums) {

            int minWindowSize = Integer.MAX_VALUE;

            int i = 0;
            int j = 0;

            int sum = 0;

            while (j < nums.length) {

                sum += nums[j];

                while (sum >= target) {
                    minWindowSize = Math.min(minWindowSize, j - i + 1);
                    sum -= nums[i];
                    i++; 
                }

                j++;

            }

            return (minWindowSize == Integer.MAX_VALUE) ? 0 : minWindowSize;

        }
}