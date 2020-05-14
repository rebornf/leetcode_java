package leetcode.动态规划.dp数组;

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/11 21:59
 * @Version V1.0
 **/
public class 不同路径62 {

    private static int UniquePaths;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int res = UniquePaths(m, n);
        System.out.println(res);


    }

    public static int UniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }


}
