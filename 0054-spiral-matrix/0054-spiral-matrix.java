class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        
        int R = arr.length;
        int C = arr[0].length;
        
        ArrayList<Integer> lst = new ArrayList<Integer>();
        
        int topRow = 0, botRow = R - 1, leftCol = 0, rightCol = C - 1;

        while (topRow <= botRow && leftCol <= rightCol) {

            // Top Row (left to right)
            for (int c = leftCol; c < rightCol; ++c)
                lst.add(arr[topRow][c]);

            if (topRow == botRow) {
                lst.add(arr[topRow][rightCol]);
                break;
            }

            // Right Col (top to bottom)
            for (int r = topRow; r < botRow; ++r)
                lst.add(arr[r][rightCol]);

            if (leftCol == rightCol) {
                lst.add(arr[botRow][rightCol]);
                break;
            }

            // Bot Row (right to left)
            for (int c = rightCol; c > leftCol; --c)
                lst.add(arr[botRow][c]);

            // Left Col (bottom to top)
            for (int r = botRow; r > topRow; --r)
                lst.add(arr[r][leftCol]);

            // Compress the boundary
            topRow++;
            leftCol++;
            botRow--;
            rightCol--;
        }

        return lst;
        
    }
}