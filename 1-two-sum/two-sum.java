class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<>(); 
       for(int i=0; i<nums.length;i++){
        map.put(nums[i],i);
       }
       for(int i =0;i<nums.length;i++){
        int first = nums[i];
        int second = target- first;;
        if(map.containsKey(second) && map.get(second)!=i){
            return new int[]{i,map.get(second)};
        }
       }
       return new int[]{};
    }
}