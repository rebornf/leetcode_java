package leetcode.双指针; /**
 * Created with IntelliJ IDEA By fty on 2020/5/30
 */

import sun.plugin2.ipc.windows.WindowsIPCFactory;

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/30 20:58
 * @Version V1.0
 **/
public class 接雨水 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums;
        nums = sc.nextLine().split(",");
        int[] num = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = Integer.parseInt(nums[i]);
        }
        System.out.println(trap(num));
    }

    public static int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int leftmax = 0;
        int rightmax = 0;
        int res = 0;
        while (l <= r) {
            if (leftmax < rightmax) {
                if (height[l] < leftmax) {
                    res = res + (leftmax - height[l]);
                } else leftmax = height[l];
                l++;
            } else {
                if (height[r] < rightmax) {
                    res = res + (rightmax - height[r]);
                } else {
                    rightmax = height[r];
                }
                r--;
            }
        }
        return res;
    }
}
