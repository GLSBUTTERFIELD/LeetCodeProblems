class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int result = 0;
        while (x != 0){
            int digit = x % 10;
            x = x/10;

            if (result > Integer.MAX_VALUE/10) {
                return false;
            }
            result = result * 10 + digit;
        }
        return original == result;
    }
}