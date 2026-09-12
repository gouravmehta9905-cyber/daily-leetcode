class Solution {
    public boolean possible(int[] arr, int day, int m, int k) {
        int count = 0;
        int bouquets = 0;
        for (int bloom : arr) {
            if (bloom <= day) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return bouquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long needed = (long) m * k;
        if (needed > bloomDay.length) {
            return -1;
        }
        int low = bloomDay[0];
        int high = bloomDay[0];
        for (int x : bloomDay) {
            low = Math.min(low, x);
            high = Math.max(high, x);
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}