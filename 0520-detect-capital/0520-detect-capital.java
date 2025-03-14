class Solution {

    public static boolean allCapital(String s) {

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) > 90) {
                return false;
            }
        }

        return true;
    }

    public static boolean allSmall(String s) {

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) < 97) {
                return false;
            }
        }

        return true;
        
    }

    public boolean detectCapitalUse(String word) {

        if (allCapital(word) || allSmall(word) || allSmall(word.substring(1))) {
            return true;
        }

        return false;
        
    }
}