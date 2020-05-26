package leetcode.动态规划; /**
 * Created with IntelliJ IDEA By fty on 2020/5/26
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author fty
 * @Description 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
 * 影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * nums =[3,1,2,4]
 * @Date 2020/5/26 8:58
 * @Version V1.0
 **/
public class 打家劫舍198 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] nums = str.split(",");
        int[] num = new int[nums.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(nums[i]);
        }
        System.out.println(rob(num));

    }

    public static int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }
        int[] dp = new int[len + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int index = 2; index < len; index++) {
            dp[index] = Math.max(dp[index - 2] + nums[index - 1], dp[index - 1]);
        }
        return dp[len];
    }


}
