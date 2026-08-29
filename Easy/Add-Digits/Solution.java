class Solution {
    public int addDigits(int num) {

        int result = num;

        while(result >= 10) {
            num = result;
            int sum = 0;
            while(num != 0) {
                int a = num % 10;
                sum += a;
                num /= 10;
            }

            result = sum;
        }

        return result;
    }
}
