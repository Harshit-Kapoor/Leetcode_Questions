class Solution {
    public int mostWordsFound(String[] sentence) {
        
        ArrayList<Integer> lst = new ArrayList<Integer>();
        
        for(int i=0; i<sentence.length; i++) {
            
            String[] res = sentence[i].split(" ");
            
            lst.add(res.length);
                                    
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<lst.size(); i++) {
            
            max = Math.max(max, lst.get(i));
            
        }
        
        return max;        
        
    }
}