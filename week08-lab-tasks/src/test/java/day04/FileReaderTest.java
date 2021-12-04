package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void testFindSmallestTemperatureSpread() {
        int minSpread = new FileReader().findSmallestTemperatureSpread("weather.dat");

        assertEquals(14, minSpread);
    }

    @Test
    void testFindSmallestDifference() {
        String team = new FileReader().findSmallestDifference("football.dat");

        assertEquals("Aston_Villa", team);
    }
}