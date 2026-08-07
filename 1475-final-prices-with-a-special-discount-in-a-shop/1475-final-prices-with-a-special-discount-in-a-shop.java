class Solution {
    public int[] finalPrices(int[] prices) {

        Stack<Integer> st = new Stack<>();
        int[] arr = prices.clone();

        for(int i = 0 ;i<prices.length;i++){
            int current = prices[i];
            while(!st.isEmpty() && current<=prices[st.peek()]){
                int prev = st.pop();
               arr[prev] = prices[prev] - current;
            }
            st.push(i);
        }
        return arr;
    }
}