class Solution {
    public int strStr(String haystack, String needle) {
        int result = -1;
        if (haystack.contains(needle)){
            result = haystack.indexOf(needle);
        }
        return result;
    }
}