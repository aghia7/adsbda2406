package utils;

public class Calculation {
    public static long fib(int n) {
        // base case
        if (n <= 1) {
            return n;
        }

        return fib(n - 2) + fib(n - 1);
    }

    public static long fibLinear(int n) {
        long a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            long temp = b;
            b = a + b;
            a = temp;
        }

        return a;
    }

    public static int multiply(int a, int b) {
        int s = 0;

        for (int i = 0; i < b; i++) {
            s += a;
        }

        return s;
    }

    public static int multiplyRecursive(int a, int b) {
        return multiplyRecursive(a, b, 0);
    }

    private static int multiplyRecursive(int a, int b, int i) {
        if (i >= b) {
            return 0;
        }

        return a + multiplyRecursive(a, b, i + 1);
    }
}
