class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        long[] prefix = new long[arr.length];
        
        for(int z=0; z<arr.length; z++) {
            prefix[z] = (z == 0) ? arr[z] : prefix[z-1] + arr[z];
        }
        
        int i = 0;
        int j = 0;
        long n = arr.length;
        long max = 0;

        while (j < n) {
            
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            
            if (j-i+1 < k) {
                j++;
            }
            
            else if (j-i+1 == k) {
                if(map.size()==k) {
                if (i == 0) {
                        max = Math.max(max, prefix[j]);                    
                    } else {
                        max = Math.max(max, prefix[j] - prefix[i-1]);
                    }

                }
                
                map.put(arr[i], map.getOrDefault(arr[i], 0) - 1);
                
                if(map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                
                i++;
                j++;
            }
            
        }
        
        return max;
    }
}

// class Solution {
//     public long maximumSubarraySum(int[] arr, int k) {

//         int i = 0;
//         int j = 0;
//         int n = arr.length;
//         int sum = 0;
//         long max = 0;

//         HashMap<Integer, Integer> map = new HashMap<>();

//         while (j < n) {

//             map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
//             sum += arr[j];

//             if (j - i + 1 < k) {
//                 j++;
//             } else if (j - i + 1 == k) {

//                 if (map.size() == k) {
//                     max = Math.max(sum, max);
//                 }

//                 sum -= arr[i];
//                 if (map.containsKey(arr[i]) == true) {
//                     int count = map.get(arr[i]);
//                     if (count == 1) {
//                         map.remove(arr[i]);
//                     } else {
//                         map.put(arr[i], map.get(arr[i]) - 1);
//                     }
//                 }

//                 i++;
//                 j++;

//             }

//         }

//         return max;
        

//     }
// }