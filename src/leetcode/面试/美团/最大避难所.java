package leetcode.面试.美团;

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/12 10:51
 * @Version V1.0
 **/
public class 最大避难所 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        int[] signal = new int[m];
        int[] pos = new int[m];
        for (int i = 0; i < m; i++) {
            signal[i] = sc.nextInt();
            pos[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            if (signal[i] == 1) {
                arr[pos[i]] = 1;
            }
            if (signal[i] == 2) {
                int temp = pos[i];
                if (arr[temp] == 0) {
                    System.out.println(temp);
                } else if (temp + 1 <= n && arr[temp + 1] == 0) {
                    System.out.println(temp + 1);
                } else {
                    System.out.println(-1);
                }
            }
        }

    }
}
