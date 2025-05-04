class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 1) {                
                return n == 0 ? true : false;
            } else if (flowerbed[0] == 0) {
                return n <= 1 ? true : false;
            }
        }
        
        int initialCount = 0;
        
        for (int number : flowerbed) {
            if (number == 1) {
                initialCount++;
            }
        }
        
        
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
        }
        
        if (flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
        }
        
        for(int i=1; i<flowerbed.length-1; i++) {
            
            if (flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                flowerbed[i] = 1;
            }
            
            
        }
        
        int count = 0;
        
        for (int number : flowerbed) {
            if (number == 1) {
                count++;
            }
        }
        
        return ((count - initialCount) >= n) ? true : false;
        
    }
}