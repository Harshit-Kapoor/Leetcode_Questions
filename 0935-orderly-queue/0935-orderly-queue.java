class Solution {
    public String orderlyQueue(String s, int k) {

        String result = "";

        if (k > 1) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            result = new String(ch);
            return result;
        } 

        int n = s.length();
        result = s;

        for (int i = 1; i <= n-1; i++) {
            String temp = s.substring(i) + s.substring(0, i);
            result = temp.compareTo(result) < 0 ? temp : result;            
        }

        return result;

    }
}