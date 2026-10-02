import java.util.HashMap;

class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            // Check num - k ki kitni frequency abhi tak store hui hai
            if (map.containsKey(num - k)) {
                count += map.get(num - k);
            }
            
            // Check num + k ki kitni frequency abhi tak store hui hai
            if (map.containsKey(num + k)) {
                count += map.get(num + k);
            }

            // Current number ki frequency update karo
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}