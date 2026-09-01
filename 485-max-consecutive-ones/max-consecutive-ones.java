class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int max = 0;
        for(int x : nums){
            if(x == 1) {
                maxOne++;
                max = Math.max(max,maxOne);
            }else maxOne = 0;
        }
        return max;
    }
}