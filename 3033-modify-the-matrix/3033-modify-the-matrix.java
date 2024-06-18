class Solution {
    public static int[][] modifiedMatrix(int[][] arr) {

        int r = arr.length;
        int c = arr[0].length;

        for(int i=0; i<c; i++) {

            int max = 0;

            for(int j=0; j<r; j++) {

                max = Math.max(max, arr[j][i]);

            }

            for(int j=0; j<r; j++) {

                if (arr[j][i] == -1) {
                    arr[j][i] = max;
                }

            }

        }

        return arr;

    }

}