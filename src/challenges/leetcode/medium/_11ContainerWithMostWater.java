package challenges.leetcode.medium;

public class _11ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxArea = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                maxArea = Math.max(maxArea, (right - left) * height[left]);
                left++;
            } else {
                maxArea = Math.max(maxArea, (right - left) * height[right]);
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
