class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        int freq = 0;
       
        for(int num : nums){
            if(map.get(num)>freq){
                freq = map.get(num);   
            }
        }
        int ans = 0;
        for(int num : map.keySet()){
           if(map.get(num)==freq){
            ans = ans +freq;
           }
        }
        return ans;
    }
}