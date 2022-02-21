package Easy;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("ALL")
public class Roman_to_Integer {

    @Test
    public void test() {

        String s = "MCMXCIV";
        int output = 1994;

        assertEquals(output, romanToInt(s));
    }

    public int romanToInt(String s) {

        Map<String, Integer> symbolAndValueMap = new HashMap<>();
        symbolAndValueMap.put("I", 1);
        symbolAndValueMap.put("V", 5);
        symbolAndValueMap.put("X", 10);
        symbolAndValueMap.put("L", 50);
        symbolAndValueMap.put("C", 100);
        symbolAndValueMap.put("D", 500);
        symbolAndValueMap.put("M", 1000);

        int length = s.length();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            String cur = s.substring(i, i + 1);
            if ("I".equals(cur) && isValid(i, length)) {
                String next = s.substring(i + 1, i + 2);
                if ("V".equals(next)) {
                    result += 4;
                    i++;
                    continue;
                } else if ("X".equals(next)) {
                    result += 9;
                    i++;
                    continue;
                }
            } else if ("X".equals(cur) && isValid(i, length)) {
                String next = s.substring(i + 1, i + 2);
                if ("L".equals(next)) {
                    result += 40;
                    i++;
                    continue;
                } else if ("C".equals(next)) {
                    result += 90;
                    i++;
                    continue;
                }
            } else if ("C".equals(cur) && isValid(i, length)) {
                String next = s.substring(i + 1, i + 2);
                if ("D".equals(next)) {
                    result += 400;
                    i++;
                    continue;
                } else if ("M".equals(next)) {
                    result += 900;
                    i++;
                    continue;
                }
            }

            result += symbolAndValueMap.get(cur);
        }

        return result;
    }

    private boolean isValid(int index, int length) {
        return index + 1 < length;
    }
}
