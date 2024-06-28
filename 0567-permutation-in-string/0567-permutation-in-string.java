class Solution {
    public static boolean checkInclusion(String s1, String s2) {

        boolean b = false;
        int i = 0;
        int j = 0;
        int n = s2.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int z = 0; z < s1.length(); z++) {
            map.put(s1.charAt(z), map.getOrDefault(s1.charAt(z), 0) + 1);
        }

        int count = map.size();

        while (j < n) {

            if (map.containsKey(s2.charAt(j))) {
                map.put(s2.charAt(j), map.get(s2.charAt(j)) - 1);
                if (map.get(s2.charAt(j)) == 0) {
                    count--;
                }
            }

            if (j - i + 1 < s1.length()) {
                j++;
            }

            else if (j - i + 1 == s1.length()) {

                if (count == 0) {
                    b = true;
                }

                if (map.containsKey(s2.charAt(i))) {
                    map.put(s2.charAt(i), map.get(s2.charAt(i)) + 1);
                    if (map.get(s2.charAt(i)) == 1) {
                        count++;
                    }
                }

                i++;
                j++;

            }
        }

        return b;
    }
}