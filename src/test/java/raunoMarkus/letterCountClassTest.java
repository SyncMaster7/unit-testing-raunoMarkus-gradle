package raunoMarkus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class letterCountClassTest {

    @Test
    void letterCount() {

        Object resultValue[] = [0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0];
        letterCountClass lcc = new letterCountClass();
        assertEquals(resultValue, letterCountClass.letterCount("hello"));
    }
}