class Solution {
    public int calculate(String s) {

        int n = s.length();
        Stack<Integer> st = new Stack<>();

        int result = 0;
        int number = 0;
        int sign = 1;

        for (int i=0; i<n; i++) {
            
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

                number = (number * 10) + (s.charAt(i) - '0');


            } else if (s.charAt(i) == '+') {

                result = result + (number * sign);
                number = 0;
                sign = 1;

            } else if (s.charAt(i) == '-') {

                result = result + (number * sign);
                number = 0;
                sign = -1;                

            } else if (s.charAt(i) == '(') {

                st.push(result);
                st.push(sign);
                result = 0;
                number = 0;
                sign = 1;

            } else if (s.charAt(i) == ')') {

                result = result + (number * sign);
                number = 0;

                int stackSign = st.pop();
                int lastResult = st.pop();

                result *= stackSign;
                result += lastResult; 

            }

        }
        
        result += (number * sign);
        return result;

    }
}