package leetcode.动态规划.dp数组;


import java.util.Scanner;

/**
 * @Author fty
 * @Description 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * @Version V1.0
 **/
public class 最大子序和53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }

    //动态规划
    public static int maxSubArray(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] = nums[i - 1] + nums[i];
            } else {
                nums[i] = nums[i];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    //动态规划优化
    public static int maxSubAraray2(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum = sum + num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
