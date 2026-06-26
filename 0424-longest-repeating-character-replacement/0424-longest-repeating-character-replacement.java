class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        int freqMax = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            freqMax = Math.max(freqMax,map.get(s.charAt(j)));
            while((j-i+1)-freqMax >k){
               char left = s.charAt(i);
               map.put(left,map.get(left)-1);
  
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}