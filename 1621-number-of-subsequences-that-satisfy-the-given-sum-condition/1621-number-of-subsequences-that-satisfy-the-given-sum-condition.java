class Solution {
public static int numSubseq(int[] arr, int target) {
        Arrays.sort(arr);
        int mod = (int) 1e9 + 7;
        int l = 0, r = arr.length - 1;
        int result = 0;
        int[] power = new int[arr.length]; // Precompute powers of 2

        // Precompute powers of 2 up to arr.length using modular exponentiation
        power[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }

        while (l <= r) {
            if (arr[l] + arr[r] <= target) {
                result = (result + power[r - l]) % mod; // Use precomputed power
                l++;
            } else {
                r--;
            }
        }

        return result;
    }
}


