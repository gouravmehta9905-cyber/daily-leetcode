class Solution {
    public boolean canFinish(int[] piles, int k, long h) {
        long hours = 0;
        for (int p : piles) {
            hours += (p + k - 1) / k;
            if (hours > h) {
                return false;
            }
        }
        return hours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        if (h < n) {
            return -1;
        }
        int lo = 1;
        int hi = 0;
        for (int p : piles) {
            hi = Math.max(hi, p);
        }
        int ans = hi;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (canFinish(piles, mid, h)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}