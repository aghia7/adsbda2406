import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // 1 1 2 3 5 8
    public static int fib(int n) { // Readability is high
        if (n <= 1) {
            return 1;
        }

        return fib(n - 2) + fib(n - 1);
    }

    public static int fibLinear(int n) {
        int x = 1, y = 1; //

        for (int i = 0; i < n; i++) {
            int temp = y;
            y = x + y;

            x = temp;
        }

        return x;
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

    private static int multiplyRecursive(int a, int b, int k) {
        if (k >= b) {
            return 0;
        }

        return a + multiplyRecursive(a, b, k + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int res = multiplyRecursive(x, y);

        System.out.println(res);
    }
}
