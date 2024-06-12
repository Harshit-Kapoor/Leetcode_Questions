class Solution {
    public int maxVowels(String s, int k) {
        
        char[] ch = s.toCharArray();
        
        int vowelCount = 0;
        
        for(int i=0; i<k; i++) {
            
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
               vowelCount++;                             
            }
            
        }
        
        int maxCount = vowelCount;
        
        for(int i=k; i<ch.length; i++) {
            
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                vowelCount++;
            }
            
            if (ch[i-k] == 'a' || ch[i-k] == 'e' || ch[i-k] == 'i' || ch[i-k] == 'o' || ch[i-k] == 'u') {
                vowelCount--;
            }
            
            maxCount = Math.max(maxCount, vowelCount);
            
        } 
        
        return maxCount;
        
    }
}