// https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        // First approach : Binary Search
        
        // Perceive the indices as the values.
        // Then count the number of values lesser than the mid
        // If the if the count is lesser than mid, we assume the duplicate number should be on the higher side of the number scale.
        // so we make low = mid + 1
        // else we assume the duplicate number should be on the lower end of the number scale.
        // so we make high = mid - 1
        // int low = 1, high = nums.length - 1;
        // while (low <= high) {
        //     int mid = (int) (low + (high - low) * 0.5);
        //     int cnt = 0;
        //     for (int a : nums) {
        //         if (a <= mid) ++cnt;
        //     }
        //     if (cnt <= mid) low = mid + 1;
        //     else high = mid - 1;
        // }
        // return low;
        
        // Second approach : Cycle sort
        
//         int i = 0;
//         int findDuplicate = -1;
        
//         while(i < nums.length){
//             int correctIndex = nums[i] - 1;
            
//             if(nums[i] != nums[correctIndex]){
//                 // swap
//                 int temp = nums[correctIndex];
//                 nums[correctIndex] = nums[i];
//                 nums[i] = temp;
//             }
//             else{
//                 i++;
//             }
//         }
        
//         for(int j = 0; j < nums.length; j++){
//             if (nums[j] != j+1){
//                 findDuplicate = nums[j];
//                 break;
//             }
//         }
//         return findDuplicate;
        
        // Third approach : Optimised Cycle sort
        
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i+1){
                int correctIndex = nums[i] - 1;
                
                if (nums[i] != nums[correctIndex]){
                    // swap
                    int temp = nums[correctIndex];
                    nums[correctIndex] = nums[i];
                    nums[i] = temp;
                } else {
                    return nums[i];
                }  
            }
            else {
                i++;
            }
        }
        return -1;
    }
}