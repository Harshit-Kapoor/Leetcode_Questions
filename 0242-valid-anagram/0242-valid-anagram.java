class Solution {
        public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> fhm = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            fhm.put(ch, fhm.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if(fhm.containsKey(ch)) {

                if(fhm.get(ch) == 1) {
                    fhm.remove(ch);
                } else {
                    fhm.put(ch, fhm.get(ch) - 1);
                }

            }

        }

        if (fhm.size() == 0) {
            return true;
        } else {
            return false;
        }

    }
}