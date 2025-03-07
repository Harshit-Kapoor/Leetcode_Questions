class Solution {

    public static int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while (i < chars.length){

            char curr_char = chars[i];
            int count = 0;

            // to find duplicates
            while (i < chars.length && curr_char == chars[i]) {
                count++;
                i++;
            }

            // now do the assigning part
            chars[index] = curr_char;
            index++;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }

        }

        return index;

    }
    
}