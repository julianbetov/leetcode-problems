package challenges.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class _3LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;

        // Map to store the most recent index of each character encountered
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        // 'left' is the start of the current window, 'right' is the end (current character index)
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the current character is already in the map and its last position
            // is within the current window (>= left), we must move the 'left' pointer
            // past the previous occurrence to eliminate the duplicate
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                left = map.get(currentChar) + 1;
            }

            // Update the map with the current character's new index
            map.put(currentChar, right);

            // Calculate the length of the current window (right - left + 1)
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }
}
