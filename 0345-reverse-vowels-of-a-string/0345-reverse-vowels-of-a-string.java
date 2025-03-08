class Solution {
    
    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    public static String reverseVowels(String s) {

        int i = 0;
        int j = s.length() - 1;

        StringBuilder sb = new StringBuilder(s);

        while (i < j) {

            if (!isVowel(s.charAt(i)) && isVowel(s.charAt(j))) {
                i++;
            } else if (isVowel(s.charAt(i)) && !isVowel(s.charAt(j))) {
                j--;
            } else if (isVowel(s.charAt(i)) && isVowel(s.charAt(j))) {
                char temp = s.charAt(i);
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            } else {
                i++;
                j--;
            }

        }

        return sb.toString();

    }

}