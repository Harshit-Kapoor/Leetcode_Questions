class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        HashMap<Integer, Integer> fhm = new HashMap<Integer, Integer>();
        
        for(int x : nums) {
            fhm.put(x, fhm.getOrDefault(x, 0) + 1);
        }
        
        int maxValue = Integer.MIN_VALUE;
        
        for(int x : fhm.keySet()) {
            maxValue = Math.max(maxValue, fhm.get(x));
        }
        
        int ans = 0;
        
       for(int x : fhm.keySet()) {
            if(fhm.get(x) == maxValue) {
                ans += fhm.get(x);
            }
       }
        
        return ans;
        
    }
}