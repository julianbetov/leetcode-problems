package challenges.leetcode.easy;

public class _58LengthOfLastWord {
    private static int lengthOfLastWord(String s) {
        int length = 0;
        s = s.strip();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                break;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String word = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(word));
    }
}
