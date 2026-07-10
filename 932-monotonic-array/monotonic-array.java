class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        int i;
        for(i =1;i<n;i++){
            if(nums[i-1] > nums[i]) break;
        }
        if(i == n) return true;
        int j;
        for(j =1;j<n;j++){
            if(nums[j-1] < nums[j]) break;
        }
        if(j == n) return true;
        return false;
    }
}