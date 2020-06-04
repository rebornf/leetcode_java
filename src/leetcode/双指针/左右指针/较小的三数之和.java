package leetcode.双指针.左右指针; /**
 * Created with IntelliJ IDEA By fty on 2020/6/1
 */

import com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI;

import javax.print.attribute.standard.PresentationDirection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/1 15:09
 * @Version V1.0
 **/
public class 较小的三数之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums;
        nums = sc.nextLine().split(",");
        String target = sc.nextLine();
        int[] num = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = Integer.parseInt(nums[i]);
        }
        int target1 = Integer.parseInt(target);
        System.out.println(threeSumSmalller1(num, target1));
    }

    public static int threeSumSmalller(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            sum += twoSumSmaller(nums, i + 1, target - nums[i]);
        }
        return sum;
    }

    private static int twoSumSmaller(int[] nums, int start, int target) {
        int left = start;
        int right = nums.length - 1;
        int res = 0;
        while (left < right) {
            if (nums[left] + nums[right] < target) {
                res = res + right - left;
                left++;
            } else {
                right--;
            }
        }
        return res;
    }

    public static int threeSumSmalller1(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        for (int k = 0; k < nums.length - 2; k++) {
            int left = k + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[k] + nums[left] + nums[right] < target) {
                    sum = sum + right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }
        return sum;

    }
}
