import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class First_Unique_Chracter_In_A_String {

    @Test
    public void test() {

        String s = "aabb";
        int output = -1;

        assertEquals(firstUniqChar(s), output);
    }

    public int firstUniqChar(String s) {

        int result = -1;
        Set<String> alreadyCheckedSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(i, i + 1);
            if (!alreadyCheckedSet.contains(temp) &&
                    s.indexOf(temp, i + 1) == -1) {
                result = i;
                break;
            }
            alreadyCheckedSet.add(temp);
        }

        return result;
    }
}
