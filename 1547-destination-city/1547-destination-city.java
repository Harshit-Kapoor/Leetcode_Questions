class Solution {
    public static String destCity(List<List<String>> paths) {

        Set<String> notADest = new HashSet<>();
        String ans = "";

        for (List<String> l : paths) {

            notADest.add(l.get(0));

        }

        for (List<String> l : paths) {

            if (notADest.contains(l.get(1)) == false) {
                ans = l.get(1);
                break;
            }

        }

        return ans;

    }
}