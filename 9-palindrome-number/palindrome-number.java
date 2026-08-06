class Solution {
    public boolean isPalindrome(int x) {

        int n=x,rev=0;

        if(x<0) return false;

        while(n!=0){
            rev=rev*10+(n%10);
            n=n/10;
        }

        if(rev==x) return true;
        return false;
        
    }
}