package letcode;

public class DivideTwoIntegers {
    // LeetCode 29: Divide Two Integers
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        long dvd = Math.abs((long) dividend), dvs = Math.abs((long) divisor);
        int res = 0;
        while (dvd >= dvs) {
            long temp = dvs, multiple = 1;
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            res += multiple;
        }
        return (dividend > 0) == (divisor > 0) ? res : -res;
    }
}
