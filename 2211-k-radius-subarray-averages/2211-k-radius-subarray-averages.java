class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n = nums.length;

        if (k == 0) {
            return nums;
        }

        int[] result = new int[n];

        Arrays.fill(result, -1);

        if (n < 2 * k + 1) {
            return result;
        }

        long windowSum = 0;
        int left = 0;
        int right = 2 * k;
        int i = k;

        for (int j=left; j<=right; j++) {
            windowSum += nums[j];
        }

        result[i] = (int) (windowSum / (2 * k + 1));

        i++;
        right++;

        while (right < n) {

            int outOfWindow = nums[left];
            int cameToWindow = nums[right];

            windowSum += cameToWindow;
            windowSum -= outOfWindow;

            result[i] = (int) (windowSum / (2 * k + 1));

            i++;
            left++;
            right++;


        }

    return result;

    }
}