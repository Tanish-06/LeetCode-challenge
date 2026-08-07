class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int prevIdx = st.pop();
                ans[prevIdx] = i-prevIdx;
            }
            st.push(i);
        }
        return ans;
    }
}