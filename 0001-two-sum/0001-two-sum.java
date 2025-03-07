class Solution {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            int currentNum = nums[i];

            if (map.containsKey(target - currentNum)) {
                return new int[]{map.get(target - currentNum), i};
            } else {
                map.put(currentNum, i);
            }

        }

        return new int[]{-1, -1};
    }

}