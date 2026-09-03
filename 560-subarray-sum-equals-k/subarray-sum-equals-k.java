import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int preSum = 0;
        int cnt = 0;
        //humlog to empty prefix daalna hoga  nhi toh ek count miss hojayega 
        map.put(0, 1);
        for (int x : nums) {
            preSum += x;
            int need = preSum - k;
            if (map.containsKey(need)) {
                cnt += map.get(need);
            }
            // we have to store current prefix sum 
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }

        return cnt;
    }
}