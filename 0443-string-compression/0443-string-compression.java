class Solution {

    public static int compress(char[] chars) {

        int currIndex = 0;
        int index = 0;

        while (currIndex < chars.length){

            char currChar = chars[currIndex];
            int count = 0;

            // to find duplicates
            while (currIndex < chars.length && currChar == chars[currIndex]) {
                count++;
                currIndex++;
            }

            // now do the assigning part
            chars[index++] = currChar;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            } 

        }
     
        return index;

    }
    
}