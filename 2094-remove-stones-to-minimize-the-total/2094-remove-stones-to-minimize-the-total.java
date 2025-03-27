class Solution {
    public int minStoneSum(int[] piles, int k) {

        // creating max heap

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        int totalSum = 0;

        for (int e : piles) {
            pq.add(e);
            totalSum += e;
        }

        while (k > 0 && !pq.isEmpty()) {
            int highestNum = pq.poll();  // Get the largest pile
            int removedStones = highestNum / 2;  // Stones removed
            totalSum -= removedStones;  // Update total sum
            pq.add(highestNum - removedStones);  // Push remaining pile back
            k--;
        }

        return totalSum;
        
    }
}