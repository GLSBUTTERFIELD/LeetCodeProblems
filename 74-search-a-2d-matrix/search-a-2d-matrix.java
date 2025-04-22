class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m = matrix.length;
       int n = matrix[0].length;
       int left = 0;
       int right = m * n - 1;
       
       while (left <= right){
        int mid = left + (right - left) / 2;
        int row = mid / n;
        int column = mid % n;
        int midVal = matrix[row][column];

        if (target > midVal) {
            left = mid + 1;
        }
        else if (target < midVal){
            right = mid - 1;
        }
        else {
            return true;
        }
       }
        return false;
    }
}