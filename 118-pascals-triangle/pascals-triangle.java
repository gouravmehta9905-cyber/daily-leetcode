class Solution {
    // isse har ek baar me 1 row generate hoga or usko  ek temporary ist me add karege
    public List<Integer> generateRow(int n) {
        List<Integer> temp = new ArrayList<>();
        for (int r = 0; r <= n; r++) {
            int value = nCr(n, r);
            temp.add(value);
        }
        return temp;
    }

    // ncr calculate karege and generate karege everyrow
    public int nCr(int n, int r) {
        int result = 1;

        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }

        return result;
    }
    // sare temporary list  ko add karege in a final list and return karege
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = generateRow(i);
            ans.add(temp);
        }
        return ans;
    }
}