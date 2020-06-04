package leetcode.面试.pd; /**
 * Created with IntelliJ IDEA By fty on 2020/6/2
 */


import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/2 19:13
 * @Version V1.0
 **/
public class 积木堆积 {
    static long mod = 1000000007;
    static long ans = 0;
    static int c = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tp = 0;
        for (int i = 1; i <= 100000; i++) {
            if (tp + i <= a + b) {
                tp += i;
            } else {
                c = i;
                break;
            }
        }
        dfs(a, b, 1);
        System.out.println(ans);
    }

    public static void dfs(int a, int b, int k) {
        if (k == c) {
            ans++;
            if (ans == ans % mod) ans = 0;
            return;
        }
        if (a - k >= 0)
            dfs(a - k, b, k + 1);
        if (b - k >= 0)
            dfs(a, b - k, k + 1);
    }
}



