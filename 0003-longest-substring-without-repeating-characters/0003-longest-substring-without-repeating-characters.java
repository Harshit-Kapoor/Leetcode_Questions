class Solution {
    public int lengthOfLongestSubstring(String s) {

        int i = 0;
        int j = 0;
        int n = s.length();
        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (j < n) {

            char c = s.charAt(j);

            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.get(c) > 1) {

                char charAtI = s.charAt(i);

                if (map.get(charAtI) == 1) {
                    map.remove(charAtI);
                } else if (map.get(charAtI) > 1) {
                    map.put(charAtI, map.get(charAtI) - 1);                    
                }

                i++;
            }


            max = Math.max(max, j - i + 1);

            j++;

        }
        
        return max;
        
    }
}