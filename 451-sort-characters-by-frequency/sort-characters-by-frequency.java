class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for(char c : map.keySet()){
            pq.add(c);
        }
        String ans = "";
        while(!pq.isEmpty()){
            char c = pq.poll();
            for(int i = 0; i < map.get(c); i++){
                ans += c;
            }
        }
        return ans;
    }
}