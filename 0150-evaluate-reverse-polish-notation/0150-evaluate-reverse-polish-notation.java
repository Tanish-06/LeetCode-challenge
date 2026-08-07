class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<tokens.length;i++){
            String ch = tokens[i];
            int num = 0;
            if (ch.equals("+") || ch.equals("-") ||
                ch.equals("*") || ch.equals("/")){
                int a = st.pop();
                int b = st.pop();
                if(ch.equals("+")){
                     num = b+a;
                } 
                 else if( ch.equals("-")){
                     num = b-a;
                } 
                  else if(ch.equals("*")){
                     num = b*a;
                } 
                  else if(ch.equals("/")){
                     num = b/a;
                } 
                st.push(num);
                }
            
            else{
                 num = Integer.parseInt(ch);
                st.push(num);
            }
        }
        return st.peek();
    }
}