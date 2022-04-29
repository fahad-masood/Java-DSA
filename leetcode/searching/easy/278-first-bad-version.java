public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // to avoid overflow incase (left+right)>2147483647
            if (isBadVersion(mid)) {
                ans = mid; // record mid as current answer
                end = mid - 1; // try to find smaller version in the left side
            } else {
                start = mid + 1; // try to find in the right side
            }
        }
        return ans;
    }
}