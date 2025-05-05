class Solution {

    public static int[] searchRange(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        int leftMostPosition = -1;
        int rightMostPosition = -1;

        while (left <= right) { 
            int mid = left + ((right - left) / 2);

            if (arr[mid] > target) { 
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] == target) {
                leftMostPosition = mid;
                right = mid - 1;
            }
        }

        left = 0;
        right = arr.length - 1;

        while (left <= right) { 
            int mid = left + ((right - left) / 2);

            if (arr[mid] < target) { 
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] == target) {
                rightMostPosition = mid;
                left = mid + 1;
            }
        }

        return new int[]{leftMostPosition, rightMostPosition}; 
    }

/*    public static int[] searchRange(int[] arr, int target) {

        int startIndex = -1;
        int endIndex = -1;

        for (int i=0; i<arr.length; i++) {

            if (arr[i] == target && startIndex == -1) {
                startIndex = i;
            }

            if (arr[i] == target) {
                endIndex = i;
            }

        }

        return new int[]{startIndex, endIndex};

    } */
}
