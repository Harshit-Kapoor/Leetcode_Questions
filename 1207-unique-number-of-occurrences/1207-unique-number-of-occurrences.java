class Solution {
    public boolean uniqueOccurrences(int[] arr) {
     
        HashMap<Integer, Integer> fhm = new HashMap<Integer, Integer>();
        
        for(int i=0; i<arr.length; i++) {
            
            fhm.put(arr[i], fhm.getOrDefault(arr[i], 0) + 1);
            
        }
        
        
        ArrayList<Integer> lst = new ArrayList<Integer>();
        
        for(Integer k : fhm.keySet()) {
            
            if(lst.contains(fhm.get(k))) {
                return false;
            } else {
                lst.add(fhm.get(k));
            }
            
        }
        
        return true;
        
    }
}