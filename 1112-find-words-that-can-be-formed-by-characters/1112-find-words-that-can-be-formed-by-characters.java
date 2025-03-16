class Solution {
    public int countCharacters(String[] words, String chars) {

        int result = 0;

        Map<Character, Integer> charsMap = new HashMap<>();

        for (Character c : chars.toCharArray()) {
            charsMap.put(c, charsMap.getOrDefault(c, 0) + 1);
        }

        for (int i=0; i < words.length; i++) {

            String s = words[i];
            Map<Character, Integer> wordMap = new HashMap<>();

            for (char c : s.toCharArray()) {
                wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
            }

            boolean possible = true;

            for (Character c : wordMap.keySet()) {
                if (wordMap.get(c) > charsMap.getOrDefault(c, 0)) {
                    possible = false;
                }
            }

            if (possible) {
                result += s.length();
            }

        }

        return result;

    }
}