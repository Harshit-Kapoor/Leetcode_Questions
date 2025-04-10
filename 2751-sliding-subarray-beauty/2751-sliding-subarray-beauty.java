class Solution {
        public static int[] getSubarrayBeauty(int[] arr, int k, int x) {

        int n = arr.length;
        int[] ans = new int[n - k + 1];
        int ansIndex = 0;
        int i = 0;
        int j = 0;
        List<Integer> lst = new ArrayList<Integer>();

        while (j < n) {

            if (arr[j] < 0) {
                lst.add(arr[j]);
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {

                

                if (!lst.isEmpty()) {
                    List<Integer> copy = new ArrayList<Integer>(lst);
                    Collections.sort(copy);
                    ans[ansIndex++] = copy.get(x - 1);

                    if (arr[i] == lst.get(0)) {
                        lst.remove(0);
                    }
                    copy.clear();
                } else {
                    ans[ansIndex++] = 0;
                }

                i++;
                j++;


            }
        }

        return ans;

    }

}

