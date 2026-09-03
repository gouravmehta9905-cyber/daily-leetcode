class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int[] positive = new int[n / 2];
        int[] negative = new int[n / 2];
        
        int p = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {

            if (nums[i] >= 0) {
                positive[p] = nums[i];
                p++;
            } else {
                negative[neg] = nums[i];
                neg++;
            }
        }
        int index = 0;
        for (int i = 0; i < n / 2; i++) {
            nums[index] = positive[i];
            index++;

            nums[index] = negative[i];
            index++;
        }

        return nums;
    }
}