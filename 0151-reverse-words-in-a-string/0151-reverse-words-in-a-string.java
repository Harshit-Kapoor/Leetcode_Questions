class Solution {
    public String reverseWords(String s) {

        s = s.trim();    

        String[] arr = s.split("\\s+");

        int i = 0;
        int j = arr.length - 1;        
        
        while (i < j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        StringBuffer ans = new StringBuffer();

        for (String st : arr) {
            ans.append(st).append(" ");
        }

        return ans.toString().trim();

    }
}