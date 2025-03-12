class Solution {
    public String reverseWords(String s) {
        
        String[] arr = s.trim().split("\\s+");
        
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        String ans = "";
        
        for (int i=0; i<arr.length - 1; i++) {
            ans += arr[i] + " ";
        }
        
        ans += arr[arr.length - 1];
        
        return ans;
        
    }
}