package utils;

public class Calculation {
    // 0 1 1 2 3 5 8 13 21 34 55 89 ..
    public static long fib(int n) {
        if (n == 0 || n == 1) { // base case
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

    public static int sum(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }

        return s;
    }

    public static int sumRecursive(int[] arr) {
        return sumRecursive(arr, 0);
    }

    private static int sumRecursive(int[] arr, int i) {
        if (i >= arr.length) {
            return 0;
        }

        return arr[i] + sumRecursive(arr, i + 1);
    }
}
