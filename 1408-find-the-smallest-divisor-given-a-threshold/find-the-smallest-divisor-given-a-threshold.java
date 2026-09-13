class Solution {
    public int sum( int nums[] , int mid){
        int sum = 0;
        for(int i : nums){
            sum += (i + mid -1)/mid; 
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if(n > threshold) return -1;
        int maxi = 0;
        for(int i = 0 ; i< nums.length;i++){
           maxi =  Math.max(maxi,nums[i]);
        }
        int low = 1;
        int high = maxi;
        int ans = high;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(sum(nums , mid) <= threshold){
                ans = mid;
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
}