class Solution {
    
    public static int max(int[] nums, int start, int end) {

        int max = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            max = Math.max(max, nums[i]);
        }

        return max;
    }

    public static long[] findPrefixScore(int[] nums) {

        int n = nums.length;

        long[] prefixMax = new long[n];
        
        int max = 0;

        for (int i = 0; i < n; i++) {

            max = Math.max(max, nums[i]);
            
            prefixMax[i] = (i == 0) ? (nums[i] + nums[i]) : (nums[i] + max);

        }

        long[] score = new long[n];

        for(int i=0; i<n; i++) {

            score[i] = (i == 0) ? prefixMax[i] : prefixMax[i] + score[i-1];

        }

        return score;
    }
    

}