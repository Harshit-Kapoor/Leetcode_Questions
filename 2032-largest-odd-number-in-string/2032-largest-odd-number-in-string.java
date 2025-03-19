class Solution {

    public static String largestOddNumber(String num) {

        int n = num.length();

        for (int i = n - 1; i >= 0 ; i--) {
            if (Integer.parseInt(String.valueOf(num.charAt(i))) % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }


    public static String largestOddNumber1(String num) {

        ArrayList<ArrayList<String>> list = new ArrayList<>();

        for (int i=0; i<num.length(); i++) {
            for (int j = i+1; j <= num.length(); j++) {
                ArrayList<String> l = new ArrayList<>();
                l.add(num.substring(i, j));
                list.add(l);
            }
        }

        double max = Integer.MIN_VALUE;

        for (ArrayList<String> l : list) {
            for (int i = 0; i < l.size(); i++) {
                double val = Double.parseDouble(l.get(i));
                if (val % 2 == 1) {
                    max = Math.max(max, val);
                }
            }
        }

        return (max == Integer.MIN_VALUE) ? "" : String.valueOf((int)max);

    }
}