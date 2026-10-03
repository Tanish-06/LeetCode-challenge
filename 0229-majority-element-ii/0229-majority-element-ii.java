class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        ArrayList<Integer> list  =  new ArrayList<>();
        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : map.keySet()){
            if(map.get(num)>n/3){
                list.add(num);
               map.put(num,map.get(num)-1);
            }
        }
        return list;
    }
}