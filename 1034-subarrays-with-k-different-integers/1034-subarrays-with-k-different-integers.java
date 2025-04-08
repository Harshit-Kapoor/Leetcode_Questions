class Solution {

    public static int subarraysWithKDistinctAns(int[] nums, int k) {

        int i = 0;
        int j = 0;
        int n = nums.length;
        int ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        while (j < n) {

            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            while (map.size() > k) {
                int count = map.getOrDefault(nums[i], 0);
                if (count == 1) {
                    map.remove(nums[i]);
                } else {
                    map.put(nums[i], count - 1);
                }
                i++;
            }

            ans += (j - i + 1);
            j++;
        }

        return ans;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        int v1 = subarraysWithKDistinctAns(nums, k);
        int v2 = subarraysWithKDistinctAns(nums, k - 1);        
        return v1 - v2;
    }
}
