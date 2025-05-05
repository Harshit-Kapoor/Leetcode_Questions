class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map = new HashMap<>();

        for (int i=0; i<s.length(); i++) {

            char originalChar = s.charAt(i);
            char replacedChar = t.charAt(i);

            if (map.containsKey(originalChar)) {
                if (map.get(originalChar) != replacedChar) {
                    return false;
                }
            } else {
                if (map.containsValue(originalChar)) {
                    return false;
                } else {
                    map.put(originalChar, replacedChar);
                }

            }

        }

        return true;
        
    }
}