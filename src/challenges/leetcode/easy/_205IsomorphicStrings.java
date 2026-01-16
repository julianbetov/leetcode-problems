package challenges.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class _205IsomorphicStrings {
//    private static boolean isIsomorphic(String s, String t) {
//        Map<Character, Character> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char ch1 = s.charAt(i);
//            char ch2 = t.charAt(i);
//            if (map.containsKey(ch1)) {
//                if (!(map.get(ch1) == ch2))
//                    return false;
//            } else {
//                if (map.containsValue(ch2))
//                    return false;
//                map.put(ch1, ch2);
//            }
//        }
//        return true;
//    }

    private static boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (!sMap.containsKey(sChar[i])) sMap.put(sChar[i], i);
            if (!tMap.containsKey(tChar[i])) tMap.put(tChar[i], i);

            if (!sMap.get(sChar[i]).equals(tMap.get(tChar[i]))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "far"));
    }
}
