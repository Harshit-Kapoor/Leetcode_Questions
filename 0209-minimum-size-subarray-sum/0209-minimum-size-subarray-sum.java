class Solution {
    public static int minSubArrayLen(int target, int[] nums) {

        int sum = 0;

        int ans = Integer.MAX_VALUE;
                        
        int i = 0;
        int j = 0;
        int n = nums.length;

        while (j < n) {

            sum += nums[j];

            while (sum >= target) {
                ans = Math.min(ans, j - i + 1);
                sum -= nums[i];
                i++;
            }

            j++;

        }

        
        return (ans == Integer.MAX_VALUE) ? 0 : ans;

    
    }
        
}