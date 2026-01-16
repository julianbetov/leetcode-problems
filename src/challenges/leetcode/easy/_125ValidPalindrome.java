package challenges.leetcode.easy;

public class _125ValidPalindrome {

    /*private static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equals(reverse);
    }*/

    private static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch) || Character.isDigit(ch)) str.append(Character.toLowerCase(ch));
        }

        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String phrase = "";
        System.out.println(isPalindrome(phrase));
    }
}
