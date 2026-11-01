public class PrimeNumbers {
    // using n -1 method
    public static boolean isPrime(int n) {
        // corner case
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // optimized is Prime number using under root n
    public static boolean optIsPrime(int n) {

        // corner case
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (optIsPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println("Primes up to " + n + ":");
        printPrimeInRange(n);
    }
}
