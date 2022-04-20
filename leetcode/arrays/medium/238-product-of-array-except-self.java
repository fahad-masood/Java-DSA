class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // Make 2 arrays: temp1 and temp2
        // temp1 has the product of elements to the left starting from 1
        // temp2 has the product of elements to the right with 1 as the ending element
        // now multiply temp1[i] and temp2[i], store in ans[i]
        
        int n = nums.length;
        int [] ans = new int[n];
        int [] temp1 = new int[n];
        int [] temp2 = new int[n];
        temp1[0] = 1;
        temp2[n-1] = 1;
        
        for(int i=1; i<n; i++){
            temp1[i] = nums[i-1] * temp1[i-1];
        }
        
        for(int i=n-2; i>=0; i--){
            temp2[i] = nums[i+1] * temp2[i+1];
        }
        
        for(int i=0; i<n; i++){
            ans[i] = temp1[i] * temp2[i];
        }
        
        return ans;
        
        
    }
}