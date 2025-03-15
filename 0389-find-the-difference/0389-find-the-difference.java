class Solution {
    public char findTheDifference(String s, String t) {
        
        char[] carr1 = new char[126];
        
        for (char c : s.toCharArray()) {
            carr1[c]++;
        }
        
        for (char c : t.toCharArray()) {
            carr1[c]--;
        }
        
        int ans = 0;
        
        for (int i=0; i<carr1.length; i++) {
            if (carr1[i] != 0) {
                ans = i;
                break;
            }
        }
        
        return (char) ans;
        
    }
}