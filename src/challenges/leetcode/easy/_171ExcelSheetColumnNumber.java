package challenges.leetcode.easy;

public class _171ExcelSheetColumnNumber {
    private static int titleToNumber(String columnTitle) {
        int base = 26;
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;
            result = result * base + value;
        }
        return result;
    }

//    private static int titleToNumber(String columnTitle) {
//        int base = 26;
//        int result = 0;
//        for (int i = 0; i < columnTitle.length(); i++) {
//            int baseResult = columnTitle.charAt(i) - 'A';
//            baseResult++;
//            double pow = Math.pow(base, ((columnTitle.length() - 1) - i));
//            result += (int) (baseResult * pow);
//        }
//        return result;
//    }

    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));
    }
}
