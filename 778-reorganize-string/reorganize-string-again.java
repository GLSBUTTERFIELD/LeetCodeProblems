class Solution {
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        int maxFreq = 0;
        char maxChar = 'a';

        for (char c : s.toCharArray()){
            freq[c -'a']++;
            if (freq[c - 'a'] > maxFreq){
                maxFreq = freq[c - 'a'];
                maxChar = c;
            }
        }

        if (maxFreq > (s.length() +1)/2) {
            return "";
        }

        char[] result = new char[s.length()];
        int index = 0;

        while (freq[maxChar - 'a'] > 0){
            result[index] = maxChar;
            index += 2;
            freq[maxChar - 'a']--;
        }

        for (char c = 'a'; c <= 'z'; c++){
            while (freq[c - 'a'] > 0){
                if (index >= s.length()){
                    index = 1;
                }
                result[index] = c;
                index += 2;
                freq[c - 'a']--;
            }
        }
        return new String(result);

    }
}
