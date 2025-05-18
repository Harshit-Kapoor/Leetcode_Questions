class Solution {
    public int maxProfit(int[] prices) {

        int maxDiff = Integer.MIN_VALUE;
        int minTillNow = Integer.MAX_VALUE;

        for (int i=0; i<prices.length; i++) {

            minTillNow = Math.min(minTillNow, prices[i]);

            maxDiff = Math.max(maxDiff, prices[i] - minTillNow);

        }

        return maxDiff;

    }
}