class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sumOfDigit = 0;
        int productOfDigit = 1;
        while(temp > 0){
            int digit  = temp % 10;
            sumOfDigit += digit;
            productOfDigit *= digit;
            temp /= 10;
        }
        int sum = sumOfDigit + productOfDigit;
        return n % sum == 0;
        
    }
}