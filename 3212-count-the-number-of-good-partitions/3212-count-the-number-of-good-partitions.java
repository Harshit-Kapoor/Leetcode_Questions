class Solution {
     public int numberOfGoodPartitions(int[] A) {
        
        int res = 1, n = A.length, mod = 1000000007;
        Map<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            last.put(A[i], i);
        }
         
        for (int i = 0, j = 0; i < n; ++i) {
            res = i > j ? (res * 2) % mod : res;
            j = Math.max(j, last.get(A[i]));   // jha tak j jaa skta hai what tak lee jana hai get.A[i] se j could be reduced
        }

        return res;
    }
}