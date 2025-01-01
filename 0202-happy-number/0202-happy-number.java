class Solution {

    public static int sumOfSquares(int num) {

        int sum = 0;

        while (num > 0) {
            sum += Math.pow(num % 10, 2);
            num /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        // Use a set to detect cycles
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquares(n);
        }

        return n == 1;
    }
}
