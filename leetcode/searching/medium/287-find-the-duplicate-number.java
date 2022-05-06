// https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        // Perceive the indices as the values.
        // Then count the number of values lesser than the mid
        // if the count is lesser than mid, we assume the duplicate number should be on the higher side of the number scale.
        // so we make low = mid + 1
        // else we assume the duplicate number should be on the lower end of the number scale.
        // so we make high = mid - 1
        int low = 1, high = nums.length - 1;
        while (low <= high) {
            int mid = (int) (low + (high - low) * 0.5);
            int cnt = 0;
            for (int a : nums) {
                if (a <= mid) ++cnt;
            }
            if (cnt <= mid) low = mid + 1;
            else high = mid - 1;
        }
        return low;
        
    }
}