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
        for (int i = 0; i < n / 2; i++) {
            nums[2*i] = positive[i];
            nums[2*i+1] = negative[i];
        }

        return nums;
    }
}