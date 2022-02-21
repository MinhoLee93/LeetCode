package Easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

@SuppressWarnings("ALL")
public class Palindrome_Number {

    @Test
    public void test() {

        int x = 121;
        boolean output = true;

        assertTrue(isPalindrome(x));
    }

    public boolean isPalindrome(int x) {

        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int r = 0;
        while (x > r) {
            int temp = x % 10;
            x = x / 10;
            r = r * 10 + temp;
        }

        if (x == r || r / 10 == x) {
            return true;
        } else {
            return false;
        }
    }
}
