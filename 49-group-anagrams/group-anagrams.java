class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for(String s : strs)
        {
            int[] count = new int[26];
            for(char c : s.toCharArray())
            {
                count[c - 'a'] ++;
            }
            StringBuilder key = new StringBuilder();
            for(int num : count)
            {
                key.append(num).append('#');
            }
            String k = key.toString();
            if(! groups.containsKey(k))
            {
                groups.put(k, new ArrayList<>());
            }
            groups.get(k).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}