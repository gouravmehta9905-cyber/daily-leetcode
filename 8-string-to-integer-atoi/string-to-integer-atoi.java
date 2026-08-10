class Solution {
    public int myAtoi(String s) {
        int num = 0;
        int sign = 1;

        int pointer = 0;

        if (s.length() == 0) {
            return 0;
        }
        while (pointer < s.length() && s.charAt(pointer) == ' ') {
            pointer++;
        }

        if (pointer == s.length()) {
            return 0;
        }

        if (s.charAt(pointer) == '-') {
            sign = -1;
            pointer++;
        } else if (s.charAt(pointer) == '+') {
            sign = 1;
            pointer++;
        }

        while (pointer != s.length() && Character.isDigit(s.charAt(pointer))) {
            int digit = s.charAt(pointer) - '0';
            if ((num > Integer.MAX_VALUE / 10) || (num == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            pointer++;

        }

        return num * sign;
    }
}