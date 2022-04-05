class Solution {
    public int findNumbers(int[] nums) {
        int findNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            while (nums[i] >= 10) {
                nums[i] = nums[i] / 10;
                count++;
            }
            if (count % 2 == 0) {
                findNumbers++;
            }
        }
        return findNumbers;
    }
}