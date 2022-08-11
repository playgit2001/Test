import java.util.Arrays;
//leetcode 第41题
public class Test41 {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (nums[n - 1] <= 0) return 1;
        int i;
        for (i = 0; i < n; i++)
            if (nums[i] > 0)
                break;
        if (nums[i] > 1) return 1;
        for (int j = i + 1; j < n; j++) {
            if (nums[j] == nums[j - 1] || nums[j] == nums[j - 1] + 1) ;
            else return nums[j - 1] + 1;
        }
        return nums[n - 1] + 1;
    }}
