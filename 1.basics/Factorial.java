import java.util.Scanner;

public class Factorial {
    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        if (n == 0) {
            System.out.println("Factorial of 0 is 1");
        }
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    public static void main(String[] args) {
        factorial();
    }
}
