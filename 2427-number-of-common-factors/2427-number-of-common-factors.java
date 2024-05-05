class Solution {
    public int commonFactors(int a, int b) {
        
        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        ArrayList<Integer> lst2 = new ArrayList<Integer>();
        
        for(int i=1; i<=a; i++) {
            if(a % i == 0) {
                lst1.add(i);
            }
        }
        
       for(int i=1; i<=b; i++) {
            if(b % i == 0) {
                lst2.add(i);
            }
        }
        
        int count = 0;
        
        for(int i=0; i<lst1.size(); i++) {
            if(lst2.contains(lst1.get(i))) {
                count++;
            }
        }
        
        return count;
        
    }
}