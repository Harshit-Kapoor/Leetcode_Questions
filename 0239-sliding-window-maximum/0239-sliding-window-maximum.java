class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int j=0,i=0,maxsum=Integer.MIN_VALUE,arrayIndex=0;
        int[] x=new int[nums.length-k+1];
        List<Integer> f=new ArrayList<>();
        
        
        while(j<nums.length){
            
            while(f.size()!=0 && f.get(f.size()-1)<nums[j]){
                f.remove(f.size()-1);
            }
            f.add(nums[j]);
            
            
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                x[arrayIndex]=f.get(0);
                arrayIndex++;
                if(nums[i]==f.get(0))f.remove(0);
                i++;
                j++;
                
            }
        }
        return x;
        
    }
}
