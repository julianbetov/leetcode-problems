package challenges.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class _217ContainsDuplicate {
    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1})); // true;
    }
}
