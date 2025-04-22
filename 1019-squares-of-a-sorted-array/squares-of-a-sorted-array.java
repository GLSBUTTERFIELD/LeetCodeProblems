class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] results = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n -1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare){
                results[pos] = leftSquare;
                left++;
            }
            else {
                results[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        return results;
    }
}