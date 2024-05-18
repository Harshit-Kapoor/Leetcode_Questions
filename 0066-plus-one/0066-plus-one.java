class Solution {
    public int[] plusOne(int[] digits) {

/*        
        int n = digits.length - 1;
        int i = 0;
        int number = 0;

        while (n >= 0) {
            number += (int) (digits[i] * Math.pow(10, n));
            i++;
            n--;
        }

        number = number + 1;

        System.out.println(number);

        int temp = number;
        int temp1 = number;

        int len = 0;

        while (temp1 > 0) {
            temp1 = temp1 / 10;
            len++;
        }

        int[] arr = new int[len];

        int index = len - 1;

        while (temp > 0) {
            int rem = temp % 10;
            temp = temp / 10;
            arr[index] = rem;
            index--;
        }

        return arr;

*/        
        int n = digits.length;

        // Traverse the array from the end to the beginning
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and continue to the next digit
            digits[i] = 0;
        }

        // If we have reached this point, it means all digits were 9
        // Hence, we need to create a new array with an extra digit at the beginning
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // The rest of the array is already initialized to 0

        return newDigits;

    }
}