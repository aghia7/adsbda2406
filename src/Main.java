import java.util.Scanner;

public class Main {

    // 1 1 2 3 5 8 13 21 ...

    public static long fib(int n) {
        // base case
        if (n <= 1) {
            return 1;
        }

        return fib(n - 2) + fib(n - 1);
    }

    public static long fibLinear(int n) {
        long a = 1, b = 1;

        for (int i = 0; i < n - 1; i++) {
            long temp = b;
            b = a + b;
            a = temp;
        }

        return b;
    }

    public static int multiply(int a, int b) {
        int s = 0;

        for (int i = 0; i < b; i++) {
            s += a;
        }

        return s;
    }

    public static int multiplyRecursive(int a, int b) {
        if (b <= 0) {
            return 0;
        }

        return a + multiplyRecursive(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(multiplyRecursive(a, b));
    }
}
