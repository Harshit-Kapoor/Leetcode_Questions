class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        char[] ch = s.toCharArray();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        String ans = "";

        for (Map.Entry<Character, Integer> entry : list) {

            for (int i=0; i<entry.getValue(); i++) {

                ans += entry.getKey();

            } 

        }

        return ans;

    }
}