import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int n2 = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            n2 = n2 * 10 + remainder;
            temp /= 10;
        }
        if (n2 == n)
            System.out.println("palindrome number");
        else
            System.out.println("not Palindrome number");
    }
}
