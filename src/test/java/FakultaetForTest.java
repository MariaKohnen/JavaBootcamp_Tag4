import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultaetForTest {

    @Test
    void calculateFakulty_whenValueTwo_shouldReturnThree() {
        assertEquals(2, FakultaetFor.calculateFakulty(2));
    }

    @Test
    void calculateFakulty_whenValueOne_shouldReturnOne() {
        assertEquals(1, FakultaetFor.calculateFakulty(1));
    }

    @Test
    void calculateFakulty_whenValueZero_shouldReturnOne() {
        assertEquals(1, FakultaetFor.calculateFakulty(0));
    }
}