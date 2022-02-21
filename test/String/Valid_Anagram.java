package String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("ALL")
public class Valid_Anagram {

    @Test
    public void test() {

        String s = "rat";
        String t = "car";
        boolean output = false;

        assertEquals(output, isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] alphabet = new int[26];
        for (Character c : s.toCharArray()) {
            alphabet[c - 'a']++;
        }

        for (Character c : t.toCharArray()) {
            alphabet[c - 'a']--;
            if (alphabet[c - 'a'] < 0) return false;
        }

        for (int i : alphabet) {
            if (i > 0) return false;
        }

        return true;
    }
}