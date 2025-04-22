class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] results = new int[nums.length]; //int array to store results

        for (int i = 0; i < nums.length; i++){ //loop iterating over each num and squaring it
            results[i] = nums[i] * nums[i]; //add each square to results array
        }
        Arrays.sort(results);
        return results;
    }
}