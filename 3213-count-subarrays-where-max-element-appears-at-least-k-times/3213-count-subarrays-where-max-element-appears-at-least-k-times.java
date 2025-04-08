class Solution {
    public long countSubarrays(int[] nums, int k) {
        
        int i = 0;
        int j = 0;
        int n = nums.length;
        long count = 0;
        long ans = 0;

        int max = Integer.MIN_VALUE;

        for (int e : nums) {
            max = Math.max(max, e);
        }

        while (j < n) {

            if (nums[j] == max) {
                count++;
            }

            while (count >= k) {
                ans+= (n - j);
                if (nums[i] == max) {
                    count--;
                }
                i++;
            }

            j++;

        }

        return ans;

    }
}