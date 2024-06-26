class Solution {
    public int maximumWealth(int[][] arr) {
        
        int r = arr.length;
        
        int max = Integer.MIN_VALUE;

        for(int i=0; i<r; i++) {
            
            int sum = 0;
            
            for(int j=0; j<arr[i].length; j++) {
                
                sum += arr[i][j];
                
            }
            
            max = Math.max(max, sum);
            
        }
        
        return max;
        
    }
}