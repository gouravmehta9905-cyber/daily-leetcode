class Solution {
    public int findGCD(int[] nums) {
        int small = nums[0];
        int lar = nums[0];
        for(int i = 1; i < nums.length; i++){
            small = Math.min(small , nums[i]);
            lar = Math.max(lar , nums[i]);
        }
        while(small != 0){
            int temp = small;
            small = lar % small;
            lar = temp;
        }
        return Math.abs(lar);
    }
}