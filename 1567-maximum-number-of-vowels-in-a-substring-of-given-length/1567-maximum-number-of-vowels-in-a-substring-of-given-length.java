class Solution {
    
    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
    
    public int maxVowels(String s, int k) {
    
        int i = 0;
        int j = 0;
        int n = s.length();
        int ans = 0;

        int vowelCount = 0;

        while (j < n) {

            if (isVowel(s.charAt(j))) {
                vowelCount++;
            }

            if (j - i + 1 < k) {
                j++;
            }
            else if (j - i + 1 == k) {
                ans = Math.max(ans, vowelCount);
                if (isVowel(s.charAt(i))) {
                    vowelCount--;
                }
                i++;
                j++;
            }

        }
        
        return ans;
        
    }
}