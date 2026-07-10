class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int windowSize = 0;
        for(int i =0; i < k; i++){
            windowSize += nums[i];
        }
        int maxSum = windowSize;
        for(int i= k; i < n; i++){
            windowSize += nums[i];
            windowSize -= nums[i - k];
            maxSum =Math.max(maxSum,windowSize);
        }
        
        return (double)maxSum/k;
    }
}