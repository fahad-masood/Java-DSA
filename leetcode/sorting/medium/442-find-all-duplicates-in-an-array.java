// https://leetcode.com/problems/find-all-duplicates-in-an-array/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
            // Cycle sort      
        int i = 0;
        
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex])
            {
                // swap
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];                    
                nums[i] = temp;
            } 
            else
            {
                i++;            
            }
        }
        
        List<Integer> findDuplicates = new ArrayList<Integer>();
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                findDuplicates.add(nums[j]);
            }
        }
        return findDuplicates;
    }
}