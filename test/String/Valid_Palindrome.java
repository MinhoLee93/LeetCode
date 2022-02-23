package String;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("ALL")
public class Valid_Palindrome {

    @Test
    public void test() {

        String input = " ";
        boolean output = true;

        assertEquals(isPalindrome(input), output);
    }

    public boolean isPalindrome(String s) {

        StringBuilder alphaNumeric = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (Character.isLetterOrDigit(temp)) {
                alphaNumeric.append(temp);
            }
        }

        String converted = alphaNumeric.toString().toLowerCase();
        if (converted.length() == 0) return true;

        int lastIndex = converted.length() - 1;
        int midIndex = lastIndex / 2;

        for (int i = 0; i <= midIndex; i++) {
            if (converted.charAt(i) != converted.charAt(lastIndex - i)) {
                return false;
            }
        }

        return true;
    }
}