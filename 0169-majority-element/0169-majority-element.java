class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int ans = 0,freq = 0;
        for(int num : nums){
            if(freq==0){
                ans = num;
            }
            if(ans==num){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ans;
    }
}