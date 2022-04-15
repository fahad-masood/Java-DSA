class Solution {
    public int minCostToMoveChips(int[] position) {
        // Chips with odd number can go to 1 at 0 cost using i+2,i-2
        // Chips with even number can go to 2 at 0 cost using i+2,i-2
        // lets say we have 3 chips on 1 and 8 chips on 2
        // It is feaseible to move 3 chips currently at position 1 to 2
        // than to move 8 chips from 2 to 1
        // Hence, minimum of odd and even will be the answer

        int even = 0;
        int odd = 0;
        for(int p : position){
            if (p%2==0) even++;
            else odd++;
        }
        return Math.min(odd,even);
    }
}