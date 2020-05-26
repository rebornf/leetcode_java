package leetcode.面试.阅文;

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/19 19:03
 * @Version V1.0
 **/
public class 二进制 {

    public static int helper(int i) {
        char[] c = Integer.toBinaryString(i).toCharArray();
        int res = 0;
        for (int j = 0; j < c.length; j++) {
            if (c[j] == '1') ;
            {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(helper(i));
    }

    public static int helper2(int num) {
        int res = 0;
        while (num != 0) {
            res++;
            num = num & (num - 1);
        }
        return res;
    }
}
