package challenges.leetcode.easy;

public class _9PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverse = 0;
        int xCopy = x;
        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }
        return xCopy == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
}
