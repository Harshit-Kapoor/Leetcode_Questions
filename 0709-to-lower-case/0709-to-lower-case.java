class Solution {
    public String toLowerCase(String s) {
        
        String ans  = "";
        
        for(int i=0; i<s.length(); i++) {
            
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                char c = (char)(s.charAt(i) + 32);
                ans += c;
            } else {
                ans += (char)(s.charAt(i));
            }
                        
        }
        
        return ans;
           
    }
}