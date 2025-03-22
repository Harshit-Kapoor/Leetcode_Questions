class Solution {
public int maxArea(int[] height) {
    
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
    
    public int maxArea1(int[] height) {
        
        int maxWater = 0;
        int maxArea = 0;
        
        for (int i=0; i<height.length; i++) {
            
            for (int j=i+1; j<height.length; j++) {
                
                int minHeight = Math.min(height[i], height[j]);
                
                int width = j - i;
                
                maxArea = Math.max(maxArea, minHeight * width);
                
            }
            
        }
        
        return maxArea;
        
    }
}