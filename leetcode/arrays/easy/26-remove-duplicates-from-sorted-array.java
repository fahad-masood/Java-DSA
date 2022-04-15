class Solution {
    public int removeDuplicates(int[] nums) {
        // Compare the first and second index
        // if they are not equal, add the number to array
        if(nums.length == 0)
            return 0;
        
        int j = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                nums[j] = nums[i+1];
                j++;
            }
        }
        return j;
    }
}
