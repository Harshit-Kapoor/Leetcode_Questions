class Solution {
    
    public int majorityElement(int[] nums) {
        
// Approach for Moore's algorithm
// Initialize two variables: count and candidate. Set count to 0 and candidate to an arbitrary value that is 0 in       this case.
// Iterate through the array nums:
// a. If count is 0, assign the current element as the new candidate and increment count by 1.
// b. If the current element is the same as the candidate, increment count by 1.
// c. If the current element is different from the candidate, decrement count by 1.
// After the iteration, the candidate variable will hold the majority element.
        
        int n = nums.length;
        int element = nums[0];
        int freq = 1;
        for (int i = 1; i < n; i++) {
            if (freq == 0) {
                element = nums[i];
                freq = 1;
            } else if (nums[i] == element) {
                freq++;
            } else {
                freq = freq - 1;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == element) {
                count++;

            }
        }

        int result = 0;
        if (count > n / 2) {
            result = element;
        }

        return result;        
    }
    
    public int majorityElement1(int[] nums) {
        
        HashMap<Integer, Integer> map= new HashMap<>();
        
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        for (int key : map.keySet()) {
            if (map.get(key) > (nums.length / 2)) {
                return key;
            }
        }
        
        return nums[0];
        
    }
}