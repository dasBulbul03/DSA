class Solution {
    public int myAtoi(String s) {
        int i = 0; 
        int n = s.length();
        while( i< n && s.charAt(i) == ' '){
            i++;
        }
        // step 2 check if string is empty now 
        if (i >= n) return 0;
        // step 3 check for sign 
        int sign =1;
        if(s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1: 1;
            i++;
        }
        // step 4 read digits and convert  to number 
        int num = 0;
        while( i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            // step 5 check for overflow/ underflow before multiplying 
            if(num > (Integer.MAX_VALUE - digit) / 10) {
                return(sign ==1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            }
            num= num * 10 + digit;
            i++;
        }
        // step 6 Return the number with correct sign
        return num *sign;
        
    }
}