class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder repeated = new StringBuilder();
        int count = 0;
        while (repeated.length() < b.length() + a.length()){
            repeated.append(a);
            count++;
            if (repeated.toString().contains(b)){
                return count;
            }
        }
        return -1;
    }
}