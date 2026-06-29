class Solution {
    public boolean isPalindrome(int x) {
       
         int num = x;
         int digit = 0;
        while(num>0){
           int temp  =  num%10;
            digit = digit*10+temp;
           num=num/10;
        }
        if(digit==x){
            return true;
        }else{
            return false;
        }
    }
}