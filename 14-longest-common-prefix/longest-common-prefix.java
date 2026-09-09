class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        // Sort the array of strings in lexicographically order for decreasinng the comparison for all string
        Arrays.sort(strs);
        
        String first = strs[0];
        String last = strs[strs.length - 1];

        // Compare characters of the first and last strings
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            // Stop if characters are different
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            // Add matching character to result
            ans.append(first.charAt(i));
        }
        // Return the final common prefix
        return ans.toString();
    }
}