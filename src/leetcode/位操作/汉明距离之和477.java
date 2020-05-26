package leetcode.位操作;

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/20 11:18
 * @Version V1.0
 **/
public class 汉明距离之和477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {4, 16, 2};
        System.out.println(totalhanming(nums));
    }


    //暴力法超时
    public static int totalhanming(int[] nums) {
        int len = nums.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                ans = ans + hanMing(nums[i], nums[j]);
            }
        }
        return ans;
    }

    public static int hanMing(int x, int y) {
        int res = 0;
        int haming = x ^ y;
        while (haming != 0) {
            res++;
            haming = haming & (haming - 1);

        }
        return res;
    }


    public static int totalHanming(int[] nums) {
        int countOne = 0;
        int countZero = 0;
        int result = 0;
        if (nums.length == 1) {
            return 0;
        }
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & 1) == 0) {
                    countZero++;
                } else {
                    countOne++;
                }
                nums[j] = nums[j] >> 1;
            }
            result = result + (countOne * countZero);
            countOne = 0;
            countZero = 0;
        }
        return result;
    }
}
