class Solution {

    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'I' || c == 'i' || c == 'o' || c == 'O' || c == 'u' || c == 'U');
    }

    public static String reverseVowels(String s) {

        int i = 0;
        int j = s.length() - 1;

        StringBuffer sb = new StringBuffer(s);

        while (i < j) {

            if (!isVowel(s.charAt(i)) && !isVowel(s.charAt(j))) {
                i++;
                j--;
            } else if (isVowel(s.charAt(i)) && !isVowel(s.charAt(j))) {
                j--;
            } else if (!isVowel(s.charAt(i)) && isVowel(s.charAt(j))) {
                i++;
            } else {
                char temp = s.charAt(i);
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j, temp);                
                i++;
                j--;
            }

        }

        return sb.toString();

    }

}