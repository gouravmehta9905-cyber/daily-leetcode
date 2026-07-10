class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zero_cnt =  0; 
        int ones_cnt = 0;
        int two_cnt = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0) zero_cnt++;
            else if(nums[i] == 1) ones_cnt++;
            else two_cnt++;
        }
        for(int i = 0; i < zero_cnt; i++){
            nums[i] = 0;
        }
        for(int i = zero_cnt; i < ones_cnt + zero_cnt; i++){
            nums[i] = 1;
        }
        for(int i = ones_cnt + zero_cnt; i < two_cnt + ones_cnt + zero_cnt; i++){
            nums[i] = 2;
        }
    }
}