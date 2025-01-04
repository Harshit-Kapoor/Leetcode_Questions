class Solution {

public static void moveZeroes(int[] nums) {

        // Start with the first position
        int insertPosition = 0;

        for (int i = 0; i < nums.length; i++) {
            // FIll all non-zero numbers
            if (nums[i] != 0) {
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }

        while (insertPosition < nums.length) {
            nums[insertPosition++] = 0;
        }

        System.out.println(Arrays.toString(nums));

    }

/*    public void moveZeroes(int[] nums) {

        List<Integer> lOfZeros = new ArrayList<Integer>();
        List<Integer> lOfNonZeros = new ArrayList<Integer>();

        for (int v : nums) {
            if (v == 0) {
                lOfZeros.add(v);
            } else {
                lOfNonZeros.add(v);
            }
        }

        int pointer = 0;

        for (int i = 0; i < lOfNonZeros.size(); i++) {
            nums[pointer] = lOfNonZeros.get(i);
            pointer++;
        }

        for (int i = 0; i < lOfZeros.size(); i++) {
            nums[pointer] = lOfZeros.get(i);
            pointer++;
        }
        
    }

    */
}