class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // sort the map based on values

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a, b) -> {
            if (a.getValue() == (b.getValue())) {
                return a.getKey().compareTo(b.getKey());
            }
            return b.getValue() - a.getValue();
        });

        HashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> e : list) {
            sortedMap.put(e.getKey(), e.getValue());
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(list.get(i).getKey());
        }

        return result;

    }
}