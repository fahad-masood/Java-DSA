// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Cycle sort
        
        List<Integer> findDisappearedNumbers = new ArrayList<Integer>();
        
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            
            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                // if nums[i] == nums[correctIndex], increment i
                i++;
            }
        }
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                findDisappearedNumbers.add(j+1);
            }
        }
        return findDisappearedNumbers;
    }
}