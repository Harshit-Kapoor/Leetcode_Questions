class NumMatrix {

    private int pre[][];

    public NumMatrix(int[][] matrix) {
        pre = new int[matrix.length][matrix[0].length];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (r == 0 && c == 0)
                    pre[r][c] = matrix[r][c];
                else if (r == 0)
                    pre[r][c] = pre[r][c - 1] + matrix[r][c];
                else if (c == 0)
                    pre[r][c] = pre[r - 1][c] + matrix[r][c];
                else
                    pre[r][c] = pre[r - 1][c] + pre[r][c - 1] - pre[r - 1][c - 1] + matrix[r][c];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = pre[row2][col2];

        if (row1 > 0)
            ans -= pre[row1 - 1][col2];
        if (col1 > 0)
            ans -= pre[row2][col1 - 1];
        if (row1 > 0 && col1 > 0)
            ans += pre[row1 - 1][col1 - 1];

        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */