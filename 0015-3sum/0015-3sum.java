class Solution {
        public static List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);

        int initialPointer = 0;
        List<List<Integer>> mainList = new ArrayList<>();

        while (initialPointer < nums.length - 1) {

            int i = initialPointer + 1;
            int j = nums.length - 1;
            int n1 = -nums[initialPointer];

            if (initialPointer > 0 && nums[initialPointer] == nums[initialPointer - 1]) {
                initialPointer++;
                continue;
            }

            while (i < j) {

                if (nums[i] + nums[j] < n1) {
                    i++;
                } else if (nums[i] + nums[j] > n1) {
                    j--;
                } else { 
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(nums[initialPointer]);
                    tempList.add(nums[i]);
                    tempList.add(nums[j]);
                    mainList.add(tempList);
                    while (i < j && nums[i] == nums[i + 1]) i++;
                    while (i < j && nums[j] == nums[j - 1]) j--;

                    i++;
                    j--;
                }
            }

            initialPointer++;
        }

        return mainList;
    }

}