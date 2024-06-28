class Solution {
    public static int countGoodSubstrings(String s) {

        int ans = 0;
        int n = s.length();
        int k = 3;
        int i = 0;
        int j = 0;
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        while (j < n) {

            map.put(ch[j], map.getOrDefault(ch[j], 0) + 1);

            if (j - i + 1 < k) {
                j++;
            }

            else if (j - i + 1 == k) {
                if (map.size() == k) {
                    ans++;
                }

                map.put(ch[i], map.get(ch[i]) - 1);
                if (map.get(ch[i]) == 0) {
                    map.remove(ch[i]);
                }
                i++;
                j++;
            }
        }

        return ans;
    }
}