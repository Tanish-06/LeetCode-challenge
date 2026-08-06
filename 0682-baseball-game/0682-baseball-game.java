class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int n = operations.length;
        for(int i = 0;i<n;i++){
            String ch = operations[i];

            if(ch.equals("C")){
                st.pop();
            }
            else if(ch.equals("D")){
                int last = st.peek()*2;
                st.push(last);
            }
            else if(ch.equals("+")){
                int first = st.pop();
                int second = st.peek();
                st.push(first);
                int sum = first +second;
                st.push(sum);
            }
            else{
                int num = Integer.parseInt(ch);
                st.push(num);
            }
        }
       int sum = 0;
       while(!st.isEmpty()){
            sum = sum + st.pop();
       }
       return sum;
    }
}