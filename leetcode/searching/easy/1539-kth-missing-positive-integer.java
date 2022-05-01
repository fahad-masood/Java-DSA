class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - (mid + 1) >= k) end = mid;  //missed more or equal than k numbers, left side;
            else start = mid + 1;   // missed less than k numbers, must be in the right side;
        }
        return start + k;
    }
}