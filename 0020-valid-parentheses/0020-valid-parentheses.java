class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.size() == 0) {
                    return false;
                }

                if (ch == ')' && st.peek() == '(' ||
                        ch == '}' && st.peek() == '{' ||
                        ch == ']' && st.peek() == '[') {
                    st.pop();
                } else
                    return false;
            }
        }
        if (st.size() > 0)
            return false;
        else
            return true;
    }
}