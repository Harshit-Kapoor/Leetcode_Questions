class Solution {
    
    public static int  findDigitSum(int num) {
        
        int sum = 0;
        
        while(num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
    
    public int addDigits(int num) {
        
        if (num == 0) {
            return 0;
        }
        
        while(num >= 10) {
            num = findDigitSum(num);            
        }
        
        return num;
        
        
    }
}