class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<nums2.length;i++){
            int current = nums2[i];
               while(!st.isEmpty() && current>st.peek()){
                int previous = st.pop();
                map.put(previous,current);
        }
        st.push(current);
        
        }
     while(!st.isEmpty()){
            map.put(st.pop(),-1);
        }
         int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}