class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        // u have to find the first break point where the element decreases.
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        //if u dont find any index that means u r on last permutation so u have to return the next so reverse the entire array 
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        // find the element just greater than the elemnt  find at the break point and  swap it .
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }
        //reverse the part after index that is left till end because we want the next permutation
        reverse(nums, index + 1, n - 1);
    }

    // Swap two elements
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse array from start to end
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}