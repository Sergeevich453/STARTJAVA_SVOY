package test.hw.gptrepetitor;

import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(final int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nВведите число f: ");
        int f = scanner.nextInt();
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= f; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
