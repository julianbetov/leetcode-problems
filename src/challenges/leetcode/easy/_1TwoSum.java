package challenges.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) return new int[]{numMap.get(complement), i};
            numMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }
}
