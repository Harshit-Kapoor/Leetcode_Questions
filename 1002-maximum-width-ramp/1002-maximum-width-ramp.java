class Solution {
    public int maxWidthRamp(int[] nums) {

        int n = nums.length;
        int[] suffixMax = new int[n];
        for (int i=n-1; i>=0; i--) {
            suffixMax[i] = (i == n - 1) ? nums[i] : Math.max(nums[i], suffixMax[i + 1]);
        }

        int i = 0;
        int j = 0;
        int max = 0;

        while (j < n) {

            if (i < j && nums[i] > suffixMax[j]) {
                i++;
            }

            max = Math.max(max, j - i);
            j++;
        }

        return max;
        
    }
}