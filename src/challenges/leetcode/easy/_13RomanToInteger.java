package challenges.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class _13RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int answer = 0;
        int previous = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = map.get(s.charAt(i));
            if (current < previous) {
                answer -= current;
            } else {
                answer += current;
            }
            previous = current;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
