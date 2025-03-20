import utils.Calculation;

import java.util.Scanner;

public class Main {

    public static void problem1() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("fib(" + n + ") = " + Calculation.fibLinear(n));
    }

    public static void problem2() {
        int[] arr = new int[]{7,3,67,0,547,978,32434,768,42};

        System.out.println(Calculation.sum(arr));
        System.out.println(Calculation.sumRecursive(arr));
    }



    public static void main(String[] args) {
        problem2();
    }
}
