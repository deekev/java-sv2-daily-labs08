package day01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {

    @Test
    void testCreateWithList() {
        List<Integer> testList = Arrays.asList(9, 35, -17, 28, 26);
        NumberSequence numberSequence = new NumberSequence(testList);

        assertEquals(5, numberSequence.getNumbers().size());
        assertEquals(-17, numberSequence.getNumbers().get(2));
        assertEquals(28, numberSequence.getNumbers().get(3));
    }

    @Test
    void testCreateWithRandoms() {
        NumberSequence numberSequence = new NumberSequence(6, 1,50);

        assertEquals(6, numberSequence.getNumbers().size());
        assertTrue(numberSequence.getNumbers().get(0) != numberSequence.getNumbers().get(3));
        assertTrue(numberSequence.getNumbers().get(2) != numberSequence.getNumbers().get(4));
        assertTrue(numberSequence.getNumbers().get(0) != numberSequence.getNumbers().get(5));
        assertTrue(numberSequence.getNumbers().get(0) >= 1 && numberSequence.getNumbers().get(0) <= 50);
        assertTrue(numberSequence.getNumbers().get(4) >= 1 && numberSequence.getNumbers().get(4) <= 50);
        assertFalse(numberSequence.getNumbers().get(3) < 1 || numberSequence.getNumbers().get(3) > 50);
    }

    @Test
    void testCloseToAverage() {
        List<Integer> testList = Arrays.asList(15, 10, 20, -5, 12, -10, 15);
        NumberSequence numberSequence = new NumberSequence(testList);

        List<Integer> result = numberSequence.closeToAverage(6);

        assertEquals(2, result.size());
        assertEquals(10, result.get(0));
        assertEquals(12, result.get(1));
    }
}