class Solution {
    public boolean isPalindrome(String s) {
        String dup = "";
        for(char ch : s.toCharArray()){
            if(String.valueOf(ch).matches("[a-zA-Z0-9]")){
                dup += ch;
            }
        }
        dup = dup.toLowerCase();
        String dup1 = "";
        for(int i = dup.length()-1; i >= 0;i--){
            dup1 += dup.charAt(i);
        }
        if (dup.equals(dup1)) return true;   
        else return false;
    }
}