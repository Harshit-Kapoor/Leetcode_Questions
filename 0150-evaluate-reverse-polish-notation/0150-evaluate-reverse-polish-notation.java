class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        int result = 0;

        for (int i = 0; i<tokens.length; i++) {

            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/") && tokens[i].matches("-?\\d+")) {
                st.push(Integer.parseInt(tokens[i]));
            }

            else if (tokens[i].charAt(0) == '+') {

                int num1 = st.pop();
                int num2 = st.pop();
                int ans = num2 + num1;
                st.push(ans);

            }

            else if (tokens[i].charAt(0) == '-') {
                int num1 = st.pop();
                int num2 = st.pop();
                int ans = num2 - num1;
                st.push(ans);
            }

            else if (tokens[i].charAt(0) == '*') {
                int num1 = st.pop();
                int num2 = st.pop();
                int ans = num2 * num1;
                st.push(ans);
            }

            else if (tokens[i].charAt(0) == '/') {
                int num1 = st.pop();
                int num2 = st.pop();
                int ans = num2 / num1;
                st.push(ans);
            }

        }

        return st.pop();
        
    }
}