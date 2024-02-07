package leetcode;

public class Trappingrainwater {
    public int trap(int[] height) {
        int[] min_height = new int[height.length];
        int[] max_height = new int[height.length];
        int[] mid = new int[height.length];
        int currwater = 0;
        int maxwater = 0;
        if (height.length < 3) {
            return 0;
        }
        for (int i = 1; i < height.length; i++) {
            min_height[0] = height[0];
            if (min_height[i - 1] > height[i]) {
                min_height[i] = min_height[i - 1];
            } else {
                min_height[i] = height[i];
            }
        }
        for (int j = height.length - 2; j >= 0; j--) {
            max_height[height.length - 1] = height[height.length - 1];
            if (max_height[j + 1] > height[j]) {
                max_height[j] = max_height[j + 1];
            } else {
                max_height[j] = height[j];
            }
        }
        for (int k = 0; k < height.length; k++) {
            if (max_height[k] > min_height[k]) {
                mid[k] = min_height[k];
            } else {
                mid[k] = max_height[k];
            }
        }
        for (int l = 0; l < height.length; l++) {
            currwater = mid[l] - height[l];
            if (currwater > 0) {
                maxwater += currwater;
            }
            currwater = 0;
        }
        return maxwater;
    }
}
