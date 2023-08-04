import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkPrime(n);
    }

    private static void checkPrime(int n) {
        int count = 0;

        if (n < 2) {
            System.out.println("The given is number " + n + " is not prime");
            System.exit(0);
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count += 1;
        }

        if (count > 2)
            System.out.println(n + " is not prime");

        else
            System.out.println(n + " is prime");
    }
}