public class PalindromeNumber {
    public static boolean isPalindrome(int pali) {
        int palindromeNum = pali;
        int reverse = 0;

        while (pali != 0) {
            int lastDigit = pali % 10;  // last digit of every number
            reverse = reverse * 10 + lastDigit;
            pali = pali / 10;  // 
        }

        if (reverse == palindromeNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println("Is " + n + " palindrome? " + isPalindrome(n));
    }
}
