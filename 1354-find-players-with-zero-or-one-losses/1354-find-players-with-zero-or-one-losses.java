class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        Set<Integer> allPlayers = new HashSet<>();

        for (int[] arr : matches) {
            allPlayers.add(arr[0]);
            allPlayers.add(arr[1]);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] arr : matches) {
            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
        }

        ArrayList<Integer> lostOnce = new ArrayList<>();

        for (int k : map.keySet()) {
            if (map.get(k) == 1) {
                lostOnce.add(k);
            }
        }

        ArrayList<Integer> neverLost = new ArrayList<>();

        // ✅ Replaced ArrayList with HashSet for faster contains() check
        HashSet<Integer> lost = new HashSet<>();

        for (int k : map.keySet()) {
            lost.add(k);
        }

        for (int e : allPlayers) {
            if (!lost.contains(e)) {
                neverLost.add(e);
            }
        }

        Collections.sort(neverLost);
        Collections.sort(lostOnce);

        List<List<Integer>> ans = new ArrayList<>();

        ans.add(neverLost);
        ans.add(lostOnce);

        return ans;
    }
}
