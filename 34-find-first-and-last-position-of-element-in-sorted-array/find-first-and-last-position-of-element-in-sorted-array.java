class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1}; //initialize new int[] with -1, -1 in case nums does not include the target
        int left = 0; //initialize left pointer to index 0
        int right = nums.length - 1; //initialize right pointer to highest index in nums (length - 1)

        while(left <= right){ //while we numbers to search
            int mid = left + (right - left) / 2; //set mid to halfway point between left and right

            if (nums[mid] == target) { //if we've found the target, we want to check surrounding nums
                int start = mid; //initialize third pointer to start (mid)
                int end = mid; //initialize fourth pointer to end (mid)
                while (start > 0 && nums[start - 1] == target){ //while in bounds and the number to the left of start is also the target
                    start--; //decrement starting pointer by one
                }
                while (end < nums.length - 1 && nums[end + 1] == target) { //while in bounds and number to the right of end is also the target
                    end++; //increment end pointer by one
                }
                result[0] = start; //after, copy start and end positions into result array
                result[1] = end;
                return result; //break out of loop and return result
            } 
            else if (nums[mid] < target) { //if our number is less than the target number, we can eliminate the first half
                left = mid + 1; //move left pointer to right of mid
            }
            else { //otherwise, our number is greater than the target number, so we eliminate the second half
                right = mid - 1; //move right pointer to left of mid
            }
        }
        return result; 
    }
}