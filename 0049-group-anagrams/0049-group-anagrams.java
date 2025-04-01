class Solution {

    public String giveMeNewWord(String s) {

        String newWord = "";

        int[] arr = new int[26];

        for (int i=0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            while (arr[i] > 0) {
                newWord += (char) (i + 'a'); // Fix: Using correct index to create sorted word
                arr[i]--;
            }
        }

        return newWord;

    }


    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            String newWord = giveMeNewWord(word);

            if (!map.containsKey(newWord)) {
                map.put(newWord, new ArrayList<>());
            }

            map.get(newWord).add(word);

        }

        List<List<String>> ans = new ArrayList<>();

        for (String s : map.keySet()) {
            ans.add(map.get(s));
        }

        return ans;

    }
}