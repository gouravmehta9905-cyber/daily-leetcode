import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Long, Long> map = new HashMap<>();
        long preSum = 0;
        long cnt = 0;
        //humlog to empty prefix daalna hoga  nhi toh ek count miss hojayega 
        map.put(0L, 1L);
        for (int x : nums) {
            preSum += x;
            long need = preSum - k;
            if (map.containsKey(need)) {
                cnt += map.get(need);
            }
            // we have to store current prefix sum 
            map.put(preSum, map.getOrDefault(preSum, 0L) + 1);
        }

        return (int) cnt;
    }
}