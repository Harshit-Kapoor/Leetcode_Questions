class Solution {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums2.length;
        int[] res = new int[n];

        // Step 1: Get NGE for nums2 and store in res[]
        
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            int number = nums2[i];

            if (st.isEmpty()) {
                st.push(number);
                res[i] = -1;
                continue;
            }

            if (st.peek() > number) {
                res[i] = st.peek();
                st.push(number);
                continue;
            }

            while (!st.isEmpty() && st.peek() <= number) {
                st.pop();
            }

            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }

            st.push(number);

        }


        // Step 2: Map nums2[i] -> res[i]

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], res[i]);
        }


        // Step 3: For each element in nums1, get its NGE from the map

        int[] output = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            output[i] = map.get(nums1[i]);
        }



        return output;

    }


/*        public static int[] nextGreaterElement1(int[] nums1, int[] nums2) {

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

    */
}