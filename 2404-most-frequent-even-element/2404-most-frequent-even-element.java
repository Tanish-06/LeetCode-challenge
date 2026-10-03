class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new  HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxFreq = 0, answer=-1;
        for(int num : map.keySet()){
        
            if (num % 2 == 0) {

                int freq = map.get(num);

                if (freq > maxFreq) {
                    maxFreq = freq;
                    answer = num;
                }

                else if (freq == maxFreq && num < answer) {
                    answer = num;
                }
            }
        }
        return answer;
    }
}