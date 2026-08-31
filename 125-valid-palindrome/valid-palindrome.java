class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9' )) {
                str += c;
            }
        }
        String lower = str.toLowerCase();
        int n =lower.length();
        for(int j = 0; j < n; j++){
            if(lower.charAt(j) != lower.charAt(n-j-1)) return false;
        }
        return true ;

    }
}