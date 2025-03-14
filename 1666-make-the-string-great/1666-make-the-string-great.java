class Solution {

public static String makeGood(String s) {

        StringBuffer sb = new StringBuffer();
        sb.append(s.charAt(0));

        for (int i=1; i<s.length(); i++) {

            if (sb.length() > 0 && ((s.charAt(i) == sb.charAt(sb.length() - 1) - 32) || (s.charAt(i) == sb.charAt(sb.length() - 1) + 32))) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }

        }

        return sb.toString();

    }

    public String makeGood1(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && (ch==st.peek()+32 || st.peek()==ch+32)){
                st.pop();
            }
            else{
                st.push(ch);
            }
          }
          StringBuilder sb=new StringBuilder();
          while(!st.isEmpty()){
              sb.append(st.pop());
          }
          return sb.reverse().toString();
    }
}