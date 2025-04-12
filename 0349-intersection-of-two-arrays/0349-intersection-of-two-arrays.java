class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> s1 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            s1.add(nums1[i]);
        }

        Set<Integer> s2 = new HashSet<>();

        for (int i = 0; i < nums2.length; i++) {
            s2.add(nums2[i]);
        }

        System.out.println(s1);
        System.out.println(s2);

        Set<Integer> s3 = new HashSet<>();

        for (int v : s1) {
            if (s2.contains(v)) {
                s3.add(v);
            }
        }

        int[] ans = s3.stream().mapToInt(Integer::intValue).toArray();

        return ans;
        
    }
}