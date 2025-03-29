class Solution {

    // Counting Sort

    public static int[] sortArray(int[] nums) {

        int n = nums.length;

        // take max and min of the given array

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        // Create a llist containing all numbers from min to max 

        List<Integer> list = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            list.add(i);
        }

        // Creating frequency map of nums

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Now iterate over the list check if element is present in list then uski freq jitna add krdo

        int[] result = new int[n];

        int pointer = 0;

        for (int e : list) {

            if (map.containsKey(e)) {

                for (int i=0; i<map.get(e); i++) {
                    result[pointer] = e;
                    pointer++;
                }

            }

        }

        return result;

    }
}