class Solution {

    public static String shiftingLetters(String s, int[][] shifts) {

        int n = s.length();

        int[] differenceArr = new int[n];

        for (int[] shift : shifts) {

            int leftIndex = shift[0];
            int rightIndex = shift[1];
            int direction = shift[2];

            // if direction is 1, we have to move shift char forward, so our x value will be +1,
            // so as per our diff array logic we add x to leftIndex and minus it at r+1 index

            // if direction is 0, we have to move shift char back, so our x value will be -1,
            // so as per our diff array logic we add x to leftIndex ie -1 and minus it at r+1 index ie - of -1

            int x;

            if (direction == 1) {
                x = 1;
            } else {
                x = -1;
            }

            differenceArr[leftIndex] += x;
            if (rightIndex + 1 < n) {
                differenceArr[rightIndex + 1] -= x;
            }

        }

        System.out.println(Arrays.toString(differenceArr));

        // prefix

        for (int i=1; i<differenceArr.length; i++) {
            differenceArr[i] = differenceArr[i - 1] + differenceArr[i];
        }

        System.out.println(Arrays.toString(differenceArr));

        char[] ch = s.toCharArray();

        for (int i=0; i < differenceArr.length; i++) {

            int shift = differenceArr[i] % 26;  // wrap z - a

            if (shift < 0) {
                shift += 26;   // wrap
            }

            ch[i] = (char) ((((ch[i] - 'a') + shift) % 26) + 'a');

        }

        return String.valueOf(ch);

    }    
}