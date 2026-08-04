class Solution {
    public List<Integer> findMissingElements(int[] nums) {
      int min =nums[0];
      int max =nums[0];
      Set<Integer> sets = new HashSet<>();
      for(int i =0; i<nums.length; i++){
        min  = Math.min(nums[i],min);
        max  = Math.max(nums[i],max);
        sets.add(nums[i]);
      }
      List<Integer> ans = new ArrayList<>();
      for(int i = min + 1 ; i < max; i++){
        if(!sets.contains(i)) ans.add(i);
      }
      return ans;
    }
}