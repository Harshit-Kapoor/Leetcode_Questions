class Solution {

        public int removeDuplicates1(int[] nums) {

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

    public static int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }

        }

        System.out.println(Arrays.toString(nums));

        return i + 1;
        
    }
    
}
