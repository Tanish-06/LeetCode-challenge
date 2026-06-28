class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num : count.keySet()) {
            int freq = count.get(num);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }

        int[] res = new int[k];
        int idx = 0;

        for (int freq = buckets.length - 1; freq >= 0; freq--) {
            if (buckets[freq] == null) continue;

            for (int num : buckets[freq]) {
                res[idx++] = num;
                if (idx == k) {
                    return res;
                }
            }
        }

        return res;
    }
}