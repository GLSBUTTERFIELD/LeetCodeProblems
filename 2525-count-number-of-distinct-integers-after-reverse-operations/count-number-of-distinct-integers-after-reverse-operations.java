class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
    //instantiate new Integer HashSet since Sets do not allow duplicates
        for (int num : nums){ //iterate over nums array using advanced for (for each) loop
            uniqueNums.add(num); //add num to uniqueNums set; if it already exists, Sets will skip adding
            uniqueNums.add(reverseNum(num)); //call helper function reverseNum on num and add to uniqueNums set
            }
            
    return uniqueNums.size(); //return size of 
    }
            
    private int reverseNum(int num){
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            reversedNum = reversedNum * 10 + digit;
        }
        return reversedNum;
    }
}