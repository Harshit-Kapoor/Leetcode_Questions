class Solution {
    public int trap(int[] height) {

        int n = height.length;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        for (int i=0; i<n; i++) {
            leftMax[i] = i == 0 ? height[i] : Math.max(height[i], leftMax[i - 1]);
        }

        for (int i=n-1; i>=0; i--) {
            rightMax[i] = i == n-1 ? height[i] : Math.max(height[i], rightMax[i + 1]);
        }

        int sum = 0;

        for (int i=0; i<n; i++) {
            sum += (Math.min(leftMax[i], rightMax[i]) - height[i]);
        }

        return sum;

    }
}