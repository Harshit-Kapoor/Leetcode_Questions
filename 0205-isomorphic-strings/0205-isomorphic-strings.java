class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map = new HashMap<>();

        for (int i=0; i < s.length(); i++) {

            char originalChar = s.charAt(i);
            char replacedChar = t.charAt(i);

            if (!map.containsKey(originalChar)) {

                if (!map.containsValue(replacedChar)) {
                    map.put(originalChar, replacedChar);
                } else {
                    return false;
                }

            } else {

                char temp = map.get(originalChar);
                if (temp != replacedChar) {
                    return false;
                }
            }

        }

        return true;

        
    }
}