class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {

        // We will store index in deque not values
        Deque<Integer> dq = new ArrayDeque<>();

        int n = nums.length;

        // result size will be n - k + 1 since only n - k + 1 window can be created
        int[] result = new int[n - k + 1];
        int resultPointer = 0;

        // we are create monotonic deque which will store indexes for values in decreasing order

        // 4 steps honge mostly 

        // step 1 = remove from dequeFront if element is out of window
        // step 2 = remove from dequeBack if incoming element is greater then element fetched from last of deque 
        // step 3 = add current Element to back of back
        // step 4 = store in result array only if i >= k - 1 ie when i becomes 2 for k = 3 from then we start storing 

        for (int i=0; i<n; i++) {

            // step 1 = remove from dequeFront if element is out of window

            // hum check krenge if dq ke first element ka index has gone out of window if its < than i - k +1

            // i-k+1 is my valid window starting point, usse kam ke koi bhi index nikal do
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }

            // step 2 = remove from dequeBack if incoming element is greater then element fetched from index in last of deque 
            while (!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
                dq.pollLast();
            }

            dq.addLast(i);

            if (i >= k - 1) {
                result[resultPointer++] = nums[dq.peekFirst()];
            }

        }

         return result;

    }
}