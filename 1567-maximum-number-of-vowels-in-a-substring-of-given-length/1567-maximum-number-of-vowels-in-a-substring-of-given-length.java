class Solution {
    
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        
        ArrayList<Character> lst = new ArrayList<>();

        int i = 0;
        int j = 0;
        int n = s.length();
        int max = Integer.MIN_VALUE;

        while (j < n) {

            char ch = s.charAt(j);

            if(isVowel(ch)) {
                lst.add(ch);
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {

                max = Math.max(max, lst.size());

                if (!lst.isEmpty() && s.charAt(i) == lst.get(0)) {
                    lst.remove(0);
                }

                i++;
                j++;

            }


        }

        return max;

    }
}