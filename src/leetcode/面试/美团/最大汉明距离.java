package leetcode.面试.美团;

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/12 10:25
 * @Version V1.0
 **/
public class 最大汉明距离 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                res = Math.max(res, hanMingDistance(arr[i], arr[j]));
            }
        }
        System.out.println(res);
    }

    public static int hanMingDistance(int x, int y) {
        int hanming = x ^ y;
        int cnt = 0;
        while (hanming > 0) {
            hanming = hanming & (hanming - 1);
            cnt++;
        }
        return cnt;
    }
}
