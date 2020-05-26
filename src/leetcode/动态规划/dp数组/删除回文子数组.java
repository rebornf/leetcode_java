package leetcode.动态规划.dp数组; /**
 * Created with IntelliJ IDEA By fty on 2020/5/25
 */

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/25 10:17
 * @Version V1.0
 **/
public class 删除回文子数组 {
    public static void main(String[] args) {

    }

    public int minimumMoves(int[] arr) {
        int len = arr.length;
        int[][] dp = new int[len][len];

        //如果是单个字符
        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }

        for (int j = 1; j < len; j++) {
            for (int i = j - 1; i >= 0; i--) {
                if (i == j - 1) {
                    //只有两个元素
                    dp[i][j] = arr[i] == arr[j] ? 1 : 2;
                    continue;
                }

                //至少三个元素
                int min = Integer.MAX_VALUE;
                if (arr[i] == arr[j]) {
                    min = dp[i + 1][j - 1];
                }
                for (int k = 1; k < j; k++) {
                    min = Math.min(min, dp[i][k] + dp[k + 1][j]);
                }

                dp[i][j] = min;
            }
        }
        return dp[0][len - 1];
    }
}
