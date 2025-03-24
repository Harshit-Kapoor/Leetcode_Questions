class Solution {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            
            int currentElement = nums[i];

            if (map.containsKey(target - currentElement) == true) {
                return new int[]{map.get(target - currentElement), i};
            } else {
                map.put(currentElement, i);
            }

        }

        return new int[]{-1, -1};

    }

}