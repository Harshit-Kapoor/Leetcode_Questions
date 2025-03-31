class Solution {

    public static boolean checkAllZeroAlready(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkWithDiffArray(int[] nums, int[][] queries, int k) {

        int[] diff = new int[nums.length];

        for (int i=0; i<=k; i++) {

            int left  = queries[i][0];
            int right = queries[i][1];
            int x     = queries[i][2];

            diff[left] += x;

            if (right + 1 < nums.length) {
                diff[right + 1] -= x;
            }
        }

        int currSum = 0;

            for (int i=0; i<nums.length; i++) {
                
                currSum += diff[i];

                diff[i] = currSum; 

                if (nums[i] - diff[i] > 0) {   // 0 nhi bna
                    return false;
                }

            }
    
            return true;
    }

    public int minZeroArray(int[] nums, int[][] queries) {
        
        int n = nums.length;
        int q = queries.length;

        if (checkAllZeroAlready(nums)) {
            return 0;   // no query reqd because all are already 0 
        }

        int l = 0;
        int r = q - 1;
        int k = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (checkWithDiffArray(nums, queries, mid)) {
                k = mid + 1; // possible ans
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        // for (int i=0; i<q; i++) {
        //     if (checkWithDiffArray(nums, queries, i)) {
        //         return i + 1;
        //     }
        // }

        // return -1;

        return k;

    }


    public int minZeroArray2(int[] nums, int[][] queries) {
        
        int n = nums.length;
        int q = queries.length;
        int[] diff = new int[n];   // Difference array to track incremental changes
        int remainingNonZero = 0;

        // Count how many elements are initially non-zero
        for (int num : nums) {
            if (num != 0) remainingNonZero++;
        }
        
        if (remainingNonZero == 0) {
            return 0;  // No query needed if already zero
        }

        // Process queries one by one
        for (int i = 0; i < q; i++) {

            int left  = queries[i][0];
            int right = queries[i][1];
            int x     = queries[i][2];

            // Apply updates to the difference array
            diff[left] += x;
            if (right + 1 < n) {
                diff[right + 1] -= x;
            }

            // Apply difference array effect on `nums`
            int currSum = 0;
            remainingNonZero = 0;  // Reset count

            for (int j = 0; j < n; j++) {
                currSum += diff[j];
                if (nums[j] - currSum > 0) {  
                    remainingNonZero++;
                }
            }

            if (remainingNonZero == 0) {
                return i + 1;  // Found the minimum number of queries required
            }
        }

        return -1;  // Not possible to make all elements zero
    }
}