class Solution {
    public int lengthOfLastWord(String s) {
        String ss = s.trim();
        int count = 0;
        for(int i = ss.length()-1;i>=0;i--){
            if(ss.charAt(i)!=' '){
                count++;
            }else{
               break;
            }
        }
        return count;
    }
}