class Solution {
    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        int stringLength = s.length();
        int patternLength = p.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int k = 0; k < patternLength; k++) {
            map.put(p.charAt(k), map.getOrDefault(p.charAt(k), 0) + 1);
        }

        int count = map.size();

        while (j < stringLength) {

            char c = s.charAt(j);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    count--;
                }
            }

            if (j - i + 1 < patternLength) {
                j++;
            } else {

                if (count == 0) {
                    result.add(i);
                }

                //if (map.containsKey(s.charAt(i))) {  we are using this bcz
                // since we are removing only pattern ke chars then we'll add only
                // pattern ke chars which are present in map

                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                    if (map.get(s.charAt(i)) == 1) {
                        count++;
                    }
                }

                i++;
                j++;

            }

        }

        return result;

    }
}