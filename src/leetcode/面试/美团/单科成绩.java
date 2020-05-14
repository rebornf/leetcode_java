package leetcode.面试.美团;

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/12 11:08
 * @Version V1.0
 **/
public class 单科成绩 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] res = new int[n];
        for (int i = 0; i < m; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j][i] >= max) {
                    max = arr[j][i];
                }
            }

            for (int j = 0; j < n; j++) {
                if (max == arr[j][i]) {
                    res[j] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (res[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
