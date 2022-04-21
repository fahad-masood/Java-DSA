class Solution {
    public void sortColors(int[] nums) {
        // start keeps track of all the 0s
        // end keeps track of all the 2s
        // Do not increase the index if nums[index]==2 
        // as we don't know the number we are swapping
        
        
        if(nums.length == 0 || nums.length == 1) return;
        
        int start = 0;
        int end = nums.length - 1;
        int index = 0;
        
        while(start < end && index <= end){
            if(nums[index] == 0){
                nums[index] = nums[start];
                nums[start] = 0;
                index++;
                start++;
            }
            else if(nums[index] == 2){
                nums[index] = nums[end];
                nums[end] = 2;
                end --;
            }
            else{
                index++;
            }
        }
    }
}