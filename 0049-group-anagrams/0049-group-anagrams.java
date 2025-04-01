class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        List<List<String>> ans = new ArrayList<>();

        for (String s : strs) {

            List<String> result = new ArrayList<>();

            char[] ch = s.toCharArray();

            Arrays.sort(ch);

            String sortedString = String.valueOf(ch);

            if (map.containsKey(sortedString) == false) {
                map.put(sortedString, new ArrayList<>());
            } 

            map.get(sortedString).add(s);

        }

        for (String s : map.keySet()) {
            ans.add(map.get(s));
        }

        return ans;

    }
}