package leetcode.动态规划.dp数组; /**
 * Created with IntelliJ IDEA By fty on 2020/5/26
 */

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/26 10:48
 * @Version V1.0
 **/
public class 打家劫舍II213 {
    public static void main(String[] args) {
//        System.out.println("请输入几个数并用逗号隔开：");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        String[] arr = str.split(",");
//        int[] b = new int[arr.length];
//        for (int j = 0; j < b.length; j++) {
//            b[j] = Integer.parseInt(arr[j]);
//            System.out.print(b[j] + " ");
//        }
        Scanner sc = new Scanner(System.in);
        String[] nums;
        nums = sc.nextLine().split(",");
        int[] num = new int[nums.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(nums[i]);
        }
        System.out.println(rob2(num));

    }

    private static int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        dp1[0] = 0;
        dp2[0] = 0;
        dp1[1] = nums[0];//从第一个屋子开始偷，最后一个不偷
        dp2[1] = nums[1];//从第二个开始偷，最后一偷
        for (int index = 2; index < nums.length; index++) {
            dp1[index] = Math.max((nums[index - 1] + dp1[index - 2]), dp1[index - 1]);
            dp2[index] = Math.max((nums[index] + dp2[index - 2]), dp2[index - 1]);
        }
        return Math.max(dp1[nums.length - 1], dp2[nums.length - 1]);
    }

    public static int rob2(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(myRob(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                myRob(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    public static int myRob(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return 0;
        int[] dp = new int[len + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        return dp[len];
    }
}