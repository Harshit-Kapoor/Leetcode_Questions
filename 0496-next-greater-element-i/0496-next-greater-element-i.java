class Solution {
        public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            int number = nums1[i];

            boolean numberFound = false;
            boolean assigned = false;

            for (int j = 0; j < nums2.length; j++) {

                if (nums2[j] == number) {
                    numberFound = true;
                }

                if (numberFound && nums2[j] > nums1[i]) {
                    res[i] = nums2[j];
                    assigned = true;
                    break;
                }

            }

            if (!assigned) {
                res[i] = -1;
            }


        }

        return res;

    }
}