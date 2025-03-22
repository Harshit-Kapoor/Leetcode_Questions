class Solution {
    public static void nextPermutation(int[] nums) {

        int n = nums.length;

        // first find blue index

        int blueIndex = -1;

        for (int i=n-1; i>0; i--) {
            if (nums[i-1] < nums[i]) {
                blueIndex = i - 1;
                break;
            }
        }

        // check just greater element on the right side

        if (blueIndex != -1) {
            int swapIndex = blueIndex;

            for (int i = n - 1; i >= blueIndex; i--) {
                if (nums[i] > nums[blueIndex]) {
                    swapIndex = i;
                    break;
                }
            }

            swap(nums, blueIndex, swapIndex);

            reverse(nums, blueIndex + 1);
        } else {
            reverse(nums, 0);            
        }

        System.out.println(Arrays.toString(nums));;

    }


    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}