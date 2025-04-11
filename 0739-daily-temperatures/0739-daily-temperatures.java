class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> st = new Stack<>();

        int[] res = new int[temperatures.length];        

        for (int i=temperatures.length - 1; i>=0; i--) {
            
            int num = temperatures[i];

            if (st.isEmpty()) {
                st.push(i);
                res[i] = 0;
                continue;
            }

            if (!st.isEmpty() && temperatures[st.peek()] > num) {
                res[i] = st.peek() - i;
                st.push(i);
                continue;
            }

            while (!st.isEmpty() && temperatures[st.peek()] <= num) {
                st.pop();
            }


            if (st.isEmpty()) {
                res[i] = 0;
            } else {
                res[i] = st.peek() - i;
            }

            st.push(i);
        
        }

        return res;
    }


    //     int[] res = new int[temperatures.length];

    //     for (int i=0; i<temperatures.length; i++) {

    //         int number = temperatures[i];
    //         boolean numberFound = false;
    //         boolean numberAssigned = false;

    //         for (int j=0; j<temperatures.length; j++) {

    //             if (temperatures[j] == number) {
    //                 numberFound = true;
    //             }

    //             if (numberFound && j > i && temperatures[j] > temperatures[i]) {
    //                 res[i] = j - i;
    //                 numberAssigned = true;
    //                 break;
    //             }

    //         }

    //         if (!numberAssigned) {
    //             res[i] = 0;
    //         }
    //     }

    //     return res;
        
    // }
}