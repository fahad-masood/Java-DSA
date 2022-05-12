// https://leetcode.com/problems/missing-number/

class Solution {
    public int missingNumber(int[] nums) {
        // Cycle sort
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }
        
        for(int j = 0; j < nums.length; j++){
            if (nums[j] != j){
                return j;
            }
        }
        return nums.length;
        
    }
}