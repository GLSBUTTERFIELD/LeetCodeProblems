class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) { // want to check surrounding nums
                int start = mid;
                int end = mid;
                while (start > 0 && nums[start - 1] == target){
                    start--;
                }
                while (end < nums.length - 1 && nums[end + 1] == target) {
                    end++;
                }
                result[0] = start;
                result[1] = end;
                return result;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return result;
    }
}