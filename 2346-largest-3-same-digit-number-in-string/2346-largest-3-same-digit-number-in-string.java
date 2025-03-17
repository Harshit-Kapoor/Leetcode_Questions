class Solution {

 public static String largestGoodInteger(String num) {
        String maxGood = "";  // Store the max good integer as a string

        for (int i = 0; i < num.length() - 2; i++) {
            String stringToCheck = num.substring(i, i + 3);

            // Check if all three characters are the same
            if (stringToCheck.charAt(0) == stringToCheck.charAt(1) && 
                stringToCheck.charAt(0) == stringToCheck.charAt(2)) {
                
                // Compare lexicographically since all are 3-digit numbers
                if (stringToCheck.compareTo(maxGood) > 0) {
                    maxGood = stringToCheck;
                }
            }
        }

        return maxGood;
    }


    public static String largestGoodInteger1(String num) {

        int max = Integer.MIN_VALUE;

        for (int i=0; i<num.length() - 2; i++) {

            String stringToCheck = (num.substring(i, i + 3));

            if ((stringToCheck.charAt(0) == stringToCheck.charAt(1)) && (stringToCheck.charAt(0) == stringToCheck.charAt(2))) {

                int val = Integer.valueOf(stringToCheck);
                max = Math.max(max, val);

            }

        }

        return (max == Integer.MIN_VALUE) ? "" : String.valueOf(max);

    }
}