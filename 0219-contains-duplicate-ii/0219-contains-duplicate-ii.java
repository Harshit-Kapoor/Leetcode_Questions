class Solution {

    public boolean containsNearbyDuplicate1(int[] nums, int k) {

        int n = nums.length;

        Set<Integer> set = new HashSet<>();

        int i=0; int j = 0;

        while (j < n) {
            if (set.contains(nums[j])) {
                return true;
            }

            set.add(nums[j]);

            // Shrink the window if its size exceeds k
            if (j - i >= k) {
                set.remove(nums[i]);
                i++;
            }

            j++;
        }

        return false;

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {

            int num = nums[i];

            if (!map.containsKey(num)) {
                map.put(num, i);
            } else {

                if (Math.abs(i - map.get(num)) <= k) {
                    return true;
                }

                map.put(num, i);

            }

        }

        return false;

    }
}