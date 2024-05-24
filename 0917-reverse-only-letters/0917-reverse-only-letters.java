class Solution {
public static String reverseOnlyLetters(String s) {
        char[] charArray = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i <= j) {
            if (!Character.isLetter(charArray[i])) {
                i++;
            }
            else if (!Character.isLetter(charArray[j])) {
                j--;
            }
            else {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            }
        }
        return new String(charArray);
    }
}