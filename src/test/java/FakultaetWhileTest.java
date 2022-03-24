import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultaetWhileTest {

    @Test
    void calculateFakulty_whenValueTwo_shouldReturnThree() {
        assertEquals(2, FakultaetWhile.calculateFacultyWhile(2));
    }

    @Test
    void calculateFakulty_whenValueOne_shouldReturnOne() {
        assertEquals(1, FakultaetWhile.calculateFacultyWhile(1));
    }

    @Test
    void calculateFakulty_whenValueZero_shouldReturnOne() {
        assertEquals(1, FakultaetWhile.calculateFacultyWhile(0));
    }

}