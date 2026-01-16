package challenges.leetcode.easy;

public class _168ExcelSheetColumnTittle {
    private static String convertToTittle(int columnNumber) {
        int base = 26;
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % base; // Actual letter to use
            result.append((char) ('A' + remainder));
            columnNumber /= base; // Next position of the result
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        int columnNumber = 701;
        System.out.println(convertToTittle(columnNumber));
    }
}
