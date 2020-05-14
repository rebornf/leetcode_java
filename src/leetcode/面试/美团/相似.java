package leetcode.面试.美团;

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/12 10:13
 * @Version V1.0
 **/
public class 相似 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            res[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] & nums[j]) == 0) {
                    res[i] = 1;
                    res[j] = 1;
                }
            }
        }

        String resStr = "";
        for (int i = 0; i < n; i++) {
            resStr += res[i] + "";
        }
        System.out.println(resStr.trim());


    }

    public static String binaryDeciml(int n) {
        String str = "";
        while (n != 0) {
            str = n % 2 + str;
            n = n / 2;
        }
        return str;
    }


}
