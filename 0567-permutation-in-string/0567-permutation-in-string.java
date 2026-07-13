class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Frequency of s1 and first window of s2
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (java.util.Arrays.equals(count1, count2)) {
            return true;
        }

        // Slide the window
        for (int i = s1.length(); i < s2.length(); i++) {

            // Add new character
            count2[s2.charAt(i) - 'a']++;

            // Remove old character
            count2[s2.charAt(i - s1.length()) - 'a']--;

            // Compare frequencies
            if (java.util.Arrays.equals(count1, count2)) {
                return true;
            }
        }

        return false;
    }
}