package String;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

@SuppressWarnings("ALL")
public class Reverse_String {

    @Test
    public void test() {

        char[] input = String.valueOf("hello").toCharArray();
        char[] output = String.valueOf("olleh").toCharArray();
        reverseString(input);
    }

    public void reverseString(char[] s) {

        int reverseIndex = 0;
        int lastIndex = s.length - 1;
        char temp;

        while (true) {
            System.out.println(s.toString());
            if (reverseIndex == lastIndex) {
                break;
            }
            temp = s[lastIndex];
            for (int i = lastIndex; i > reverseIndex; i--) {
                s[i] = s[i - 1];
            }
            s[reverseIndex] = temp;
            reverseIndex++;
        }
    }

    public void reverseString_2(char[] s) {

        int length = s.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = s[i];
            int j = length - 1 - i;
            s[i] = s[j];
            s[j] = temp;
        }
    }
}