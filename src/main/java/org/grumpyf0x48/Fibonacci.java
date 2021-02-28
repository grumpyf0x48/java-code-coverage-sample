package org.grumpyf0x48;

public class Fibonacci {
    private Fibonacci() {
    }

    public static Fibonacci getInstance() {
        return new Fibonacci();
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
