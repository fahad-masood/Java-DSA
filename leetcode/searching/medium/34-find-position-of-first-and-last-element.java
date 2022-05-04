// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
//          Brute Force Approach (Complexity: n)
//          int[] searchRange = {-1,-1};
        
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] == target){
//                 searchRange[0] = i;
//                 break;
//             }
//         }
        
//         for(int i=nums.length-1; i>searchRange[0]; i--){
//             if(nums[i] == target){
//                 searchRange[1] = i;
//                 break;
//             }
//         }
        
//         return searchRange;
        
        
        // Using Binary Search (Run it twice) 
        // First : find the first index of target
        // Second : find the last index of target
        
        int[] ans = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
        
    }
    
    int search(int[] nums, int target, boolean findFirstIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                
                if(findFirstIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}