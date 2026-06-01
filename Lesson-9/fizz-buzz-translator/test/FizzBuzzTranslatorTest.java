import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslatorTest {

    @Test
    void testTranslate0() {
        assertEquals("Fizz", FizzBuzzTranslator.translate(6));
    }


    @Test
    void testTranslate1() {
        assertEquals("Buzz", FizzBuzzTranslator.translate(10));
    }

    @Test
    void testTranslate2() {
        assertEquals("FizzBuzz", FizzBuzzTranslator.translate(15));
    }

    @Test
    void testTranslate3() {
        assertEquals("Fizz", FizzBuzzTranslator.translate(13));
    }

    @Test
    void testTranslate4() {
        assertEquals("Buzz", FizzBuzzTranslator.translate(52));
    }

    @Test
    void testTranslate5() {
        assertEquals("hai", FizzBuzzTranslator.translate(2));
    }

    @Test
    void testTranslate6() {
        assertEquals("hai sau", FizzBuzzTranslator.translate(26));
    }
}