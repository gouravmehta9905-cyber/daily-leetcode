class Solution {
        public void reverse(int[] arr , int start, int end){
            while(start<end){
                int temp =arr[start];
                arr[start] = arr[end];
                arr[end] =temp;
                start++;
                end--;
            }
        }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums , 0 , n-1);
        reverse(nums , 0, k-1);
        reverse(nums , k , n-1);




/*
        int[] newArr = new int[n];
        for (int i = 0; i < k; i++) {
            newArr[i] = nums[n - k + i];
        }
        for (int i = 0; i < n - k; i++) {
            newArr[k + i] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = newArr[i];
        }
 */       
    }
}
