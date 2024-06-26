class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        int i=0;
        int j=0;
        int k=10;
        int n = s.length();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        List<String> result = new ArrayList<>();
        
        while(j < n) {
                        
            if (j - i + 1 < k) {
                j++;
            }
            
            else if (j - i + 1 == k) {                
                String sequence = s.substring(i, j+1);    
                map.put(sequence, map.getOrDefault(sequence, 0) + 1);
                i++;
                j++;
            }           
                        
        }
        
        
        for (String seq : map.keySet()) {
            if (map.get(seq) > 1) {
                result.add(seq);
            }
        }
        
        return result;
        
    }
}