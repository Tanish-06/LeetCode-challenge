class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int currSum=0;
       int minLength=Integer.MAX_VALUE;
       int low = 0;
       int high = 0;
       for(high = 0;high<nums.length;high++){
        currSum = currSum+nums[high];
        while(currSum>=target){
            int minLengthWindow = high-low+1;
             minLength = Math.min( minLength,minLengthWindow);
             currSum = currSum-nums[low];
             low++;
        }
       }
          return minLength==Integer.MAX_VALUE ? 0:minLength;  
        
    }
}