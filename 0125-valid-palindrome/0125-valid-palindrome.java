class Solution {
    public boolean isPalindrome(String s) {
     
        if(s.isEmpty() || s.length()==1){
            return true;
        }
        
        String str = "";
        
        for(int i=0; i<s.length(); i++) {
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || 
               (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
               (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                str += s.charAt(i);
            }
        }

        str = str.toLowerCase();
            
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;

        }

        return true;
        
    }
}