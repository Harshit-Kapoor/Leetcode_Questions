class Solution {
public static String minWindow(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        int minWindowSize = Integer.MAX_VALUE;

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int countRequired = t.length();

        int i = 0;
        int j = 0;

        int startIndex = -1;

        while (j < s.length()) {

            char ch = s.charAt(j);

            if (map.containsKey(ch) && map.get(ch) > 0) {
                countRequired--;
            }

            map.put(ch, map.getOrDefault(ch, 0) - 1);

            while (countRequired == 0) {

                int currWindowSize = j - i + 1;

                if (minWindowSize > currWindowSize) {
                    minWindowSize = currWindowSize;
                    startIndex = i;
                }

                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

                if (map.get(s.charAt(i)) > 0) {
                    countRequired++;
                }

                i++;
            }

            j++;

        }

        return minWindowSize == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minWindowSize);

    }
}
