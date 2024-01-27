package main.test;

import main.java.basics.Strings;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringsTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(Strings.isPalindrome("level"));
        assertTrue(Strings.isPalindrome("radar"));
        assertFalse(Strings.isPalindrome("palindrome"));
    }
}
