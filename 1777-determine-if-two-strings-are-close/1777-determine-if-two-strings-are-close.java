class Solution {
    public boolean closeStrings(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        if (n != m) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i=0; i<n; i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);            
            int index1 = c1 - 'a';
            int index2 = c2 - 'a';            
            arr1[index1] += 1;
            arr2[index2] += 1;           
        }

        // point1 = if char is present in word1 should be present in word2
        for (int i = 0; i < 26; i++) {
            if (arr1[i] > 0 && arr2[i] > 0) continue;
            if (arr1[i] == 0 && arr2[i] == 0) continue;            
            return false;
        }

        
        // point2 = just match freq
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
                
    }
}