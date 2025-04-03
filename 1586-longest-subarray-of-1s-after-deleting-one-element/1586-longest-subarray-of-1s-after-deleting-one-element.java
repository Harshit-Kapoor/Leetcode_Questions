class Solution {

    public int longestSubarray(int[] nums) {

        int i = 0;
        int j = 0;
        int zeroCount = 0;
        int max = 0;
        int n = nums.length;

        while (j < n) {

            if (nums[j] == 0) {
                zeroCount++;
            }

            while(zeroCount > 1) {
                if (nums[i] == 0) {
                    zeroCount--;
                }
                i++;
            }

            max = Math.max(max, j - i);

            j++;

        } 

        return max;

    }


    // brute force tle

    // public int longestSubarray(int[] nums) {

    //     int n = nums.length;
    //     int result = 0;
    //     int countZero = 0;

    //     for (int i=0; i<n; i++) {

    //         if (nums[i] == 0) {
    //             countZero++;
    //             result = Math.max(result, findMax(nums, i));

    //         }

    //     }

    //     return countZero == 0 ? n - 1 : result;
        
    // }

    // public static int findMax(int[] nums, int skipIndex) {

    //     int currSubarrayLen = 0;
    //     int maxLen = 0;

    //     for(int i=0; i<nums.length; i++) {
    //         if (i == skipIndex) {
    //             continue;
    //         }

    //         if (nums[i] == 1) {
    //             currSubarrayLen++;
    //             maxLen = Math.max(maxLen, currSubarrayLen);
    //         } else {
    //             currSubarrayLen = 0;
    //         }
    //     }

    //     return maxLen;

    // }
}