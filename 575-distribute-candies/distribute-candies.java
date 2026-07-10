class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> set =new HashSet<>();
        for(int i =0;i<n;i++){
            set.add(candyType[i]);
        }
        int x =set.size();
        return Math.min(x,n/2);
        

    }
}