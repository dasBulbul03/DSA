class Solution {
    public boolean isPalindrome(int x) {
        
        // step1 Negetive numbers are never palindrome 
        if(x < 0) return false;

        int original = x;
        int rev =0;
        while(x !=0){
            int ld = x % 10 ;// get the last digit 
            x= x/10; // remove the lastdigit
            rev= rev*10+ ld ; // it will build the number
        }
        // step 3 compare reversed number with original
        return rev == original;
    }
}