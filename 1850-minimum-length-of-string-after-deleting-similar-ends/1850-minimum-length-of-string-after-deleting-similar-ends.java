class Solution {
     public int minimumLength(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j && s.charAt(i) == s.charAt(j)) {
            char ch = s.charAt(i);  // Store the current character
            
            // Move i forward while it's equal to ch
            while (i <= j && s.charAt(i) == ch) i++;

            // Move j backward while it's equal to ch
            while (i <= j && s.charAt(j) == ch) j--;
        }

        return j - i + 1;
    }
}