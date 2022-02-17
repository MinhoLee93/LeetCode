import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("ALL")
public class Reverse_Integer {

    @Test
    public void test() {

        int input = 1534236469;
        int output = 0;
        assertEquals(reverse(input), output);
    }

    public int reverse(int x) {

        boolean minus = false;
        if (x < 0) {
            minus = true;
            x = x * -1;
        }

        long temp = 0;
        while (x > 0) {
            temp = temp * 10 + x % 10;
            x = x / 10;
        }

        if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
            return 0;
        }

        int result = (int) temp;
        return minus ? result * -1 : result;
    }
}