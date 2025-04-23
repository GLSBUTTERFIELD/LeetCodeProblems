class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1; //start left pointer at 1
        int right = getMax(piles); //start right pointer at right-most index (use helper function)
        
        while (left < right){
            int mid = left + (right - left) / 2;
//can koko eat all the bananas in h hours or less at speed mid?
            if (canEatInTime(piles, mid, h)){ //if yes, speed is fast enough (or could even be too fast)
                right = mid;  //move right pointer to mid/first half
            }
            else { //otherwise, speed is not fast enough
                left = mid + 1; //discard mid and move left pointer to second half
            }
        }
        return left; //left is slowest number of bananas per hour koko can eat 
    }

//helper function to find k
    private boolean canEatInTime (int [] piles, int k, int h){
        int hours = 0;
        //iterate over each int in piles array
        for (int num : piles) { 
          hours = hours + (num + k - 1) / k; //hours = hours + (piles[i] + speed - 1) /speed
        }

        return hours <= h; //if hours <= h, koko can eat the bananas going k speed for h hours
    }
//helper function to find maximum number in int array
    private int getMax (int[] piles){
        int max = 0; //start max at 0
        for (int num : piles) { //iterate over piles array
            if (num > max){ //check if piles[i] > max
                max = num; //if yes, reassign max to current number;
            }
        }
        return max; //return biggest number in array
    }

}