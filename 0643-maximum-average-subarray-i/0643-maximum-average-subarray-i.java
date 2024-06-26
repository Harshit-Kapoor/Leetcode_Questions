class Solution {
    
    public static double findMaxAverage(int[] arr, int k) {
 
        if (arr.length == 1) {
            return (double) (arr[0] / k);
        }
        
        int i = 0;
        int j = 0;
        double n = arr.length;
        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;

        while (j < n) {

            sum += arr[j];

            if (j - i + 1 < k) {
                j++;
            }

            else if (j - i + 1 == k) {
                double avg =  sum / (double) k;
                max = Math.max(max, avg);
                sum -= arr[i];
                i++;
                j++;
            }
        }

        return max;

    }
    
/*    public static double findMaxAverage(int[] nums, int k) {

        int[] prefixSum = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i] = (i == 0) ? nums[i] : nums[i] + prefixSum[i - 1];
        }

        System.out.println(Arrays.toString(prefixSum));

        double maxAvg = (double) prefixSum[k - 1] / k;

        for (int start = 1; start <= nums.length - k; start++) {

            int end = start + k - 1;

            int sum = prefixSum[end] - prefixSum[start - 1];

            double avg = (double) sum / k;

            maxAvg = Math.max(maxAvg, avg);

            avg = 0;

        }

        return maxAvg;
    }
*/    
    /*
    public double findMaxAverage(int[] nums, int k) {
        // If the array has only one element, return the element itself as the maximum average
        if (nums.length == 1)
            return (double) nums[0];

        int start = 0;
        int end = k;
        double average = 0;

        // Calculate the initial average of the first k elements
        for (int i = 0; i < k; i++) {
            average = average + (double) nums[i] / k;
        }

        // Set the initial maximum average to the calculated average
        double max = average;

        while (end < nums.length) {
            // Slide the window and update the average
            average = average - (double) nums[start++] / k;
            average = average + (double) nums[end++] / k;

            // Update the maximum average if the current average is greater
            max = Math.max(average, max);
        }

        return max;
    }
    
    */
}