import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void isInFibonacci() {
        assertTrue(Fibonacci.isInFibonacci(0, 0, 1));
        assertTrue(Fibonacci.isInFibonacci(1, 0, 1));
        assertTrue(Fibonacci.isInFibonacci(5, 0, 1));
        assertTrue(Fibonacci.isInFibonacci(13, 0, 1));
        assertFalse(Fibonacci.isInFibonacci(4, 0, 1));
        assertFalse(Fibonacci.isInFibonacci(6, 0, 1));
        assertFalse(Fibonacci.isInFibonacci(14, 0, 1));
    }

}