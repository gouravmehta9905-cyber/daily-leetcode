class Solution {
    public int[][] merge(int[][] intervals) {
        /* Jb hm sort akrte hai to wo 1st element k according sort hota hai, lekin agar at any moment 1st element is same then It will sort according to 2nd element. */
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            // pehle khali hoga toh pehla element ghus jayega merge me 
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(merged.size() - 1)[1] =
                    Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}