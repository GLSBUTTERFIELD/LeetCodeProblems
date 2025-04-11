class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for (int i = 1; i <= length /2; i++){
            if (length % i == 0){
                String prefix = s.substring(0, i);
                StringBuilder repeated = new StringBuilder();
                for (int j = 0; j < length/i; j++){
                    repeated.append(prefix);
                }
                if (repeated.toString().equals(s)) {
                    return true;
                }
            }
        }
            return false;
    }
}