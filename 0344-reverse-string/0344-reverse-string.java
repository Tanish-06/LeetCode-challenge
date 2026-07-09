class Solution {
    public void reverseString(char[] s) {
        char[] arr = new char[s.length];
        int idx = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            arr[idx] = s[i];
            idx++;
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = arr[i];
        }
        return;
    }
}