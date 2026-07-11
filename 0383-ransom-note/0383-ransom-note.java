class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : ransomNote.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (char ch : magazine.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
        }
        for (char ch : map1.keySet()) {
            if (map2.getOrDefault(ch, 0) < map1.get(ch)) {
                return false;
            }
        }

        return true;
    }
}