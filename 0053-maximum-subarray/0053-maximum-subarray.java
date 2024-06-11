class Solution {
    public int maxSubArray(int[] nums) {
        
        // Kadane's Algo
        
        int currSum = 0, finalAns = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++) {
            
            currSum += nums[i];
            
            finalAns = Math.max(currSum, finalAns);
            
            if(currSum < 0) {
                currSum = 0;
            }
        }
        
        return finalAns;
        
    }
}