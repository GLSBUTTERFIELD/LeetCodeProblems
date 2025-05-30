class Solution {
    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int total = 0;

        Map<Character, Integer> numeralValues = new HashMap<>();
        numeralValues.put('I', 1);
        numeralValues.put('V', 5);
        numeralValues.put('X', 10);
        numeralValues.put('L', 50);
        numeralValues.put('C', 100);
        numeralValues.put('D', 500);
        numeralValues.put('M', 1000);

        int length = charArray.length -1;
        for (int i = 0; i <= length ; i++) {
            int currentValue = numeralValues.get(charArray[i]);
            int nextValue = (i + 1 < charArray.length) ? numeralValues.get(charArray[i+1]) : 0;

            if (currentValue < nextValue) {
                total -= currentValue;
            }
            else {
                total += currentValue;
            }
        }
        return total;
    }
}