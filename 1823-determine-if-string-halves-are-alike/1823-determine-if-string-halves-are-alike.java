class Solution {

    public static boolean isVowel(char c) {
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U');
    }

    public boolean halvesAreAlike(String s) {

        int n = s.length();
        int i = 0; 
        int j = n / 2;
        int leftCount = 0;
        int rightCount = 0;

        while (i < n / 2 && j < n) {

            if (isVowel(s.charAt(i))) leftCount++;
            if (isVowel(s.charAt(j))) rightCount++;

            i++;
            j++;
            
        }

        return leftCount == rightCount;

    }
}