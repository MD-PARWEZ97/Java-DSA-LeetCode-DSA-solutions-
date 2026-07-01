package ArrayProgramming;

import java.util.Scanner;

public class PrimeNumberAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2)
            return false;
        else if (n == 2 || n == 3)
            return true;
        else if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
