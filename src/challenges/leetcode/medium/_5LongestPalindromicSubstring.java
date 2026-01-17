package challenges.leetcode.medium;

public class _5LongestPalindromicSubstring {
    private static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";

        int maxStart = 0;
        int maxLength = 1;

        for (int center = 0; center < s.length(); center++) {
            int len1 = expand(s, center, center);
            int len2 = expand(s, center, center + 1);

            int currentLen = Math.max(len1, len2);

            if (currentLen > maxLength) {
                maxLength = currentLen;
                maxStart = center - (currentLen - 1) / 2;
            }
        }

        return s.substring(maxStart, maxStart + maxLength);
    }

    private static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
