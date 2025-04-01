class Solution {
    public static String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {

            if (!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }

        }

        String initial = "";

        while (!st.isEmpty()) {
            initial += st.pop();
        }

        String ans = "";

        for (int i=initial.length()-1; i>=0; i--) {
            ans += initial.charAt(i);
        }

        return ans;
 
    }
}