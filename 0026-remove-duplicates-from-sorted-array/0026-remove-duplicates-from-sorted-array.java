class Solution {

        public int removeDuplicates(int[] nums) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int e : nums) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        int size = map.size();

        int  i = 0;
        for (int e : map.keySet()) {
            nums[i] = e;
            i++;
        }

        return size;

    }
    
}
