class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedVal = String.valueOf(ch);

            if (!map.containsKey(sortedVal)) {
                map.put(sortedVal, new ArrayList<>());
            }

            map.get(sortedVal).add(word);

        }

        List<List<String>> ans = new ArrayList<>();

        for (String s : map.keySet()) {
            ans.add(map.get(s));
        }

        return ans;

    }
}