package leetcode.面试.EA;

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/29 20:24
 * @Version V1.0
 **/
/*
public class 卡特兰数 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int res = jiecheng(2 * n) / (jiecheng(n) * jiecheng(n + 1));
            System.out.println(res);
        }

        public static int jiecheng(int n) {
            int r = 1;
            for (int i = n; i > 0; i--) {
                r *= i;
            }
            return r;
        }
    }

 */

public class 卡特兰数 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CatalanProcess(n));

    }

    private static int CatalanProcess(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] h = new int[n + 1];
        int result = 0;
        h[0] = h[1] = 1;
        for (int i = 2; i <= n; i++) {
            h[i] = 0;
            for (int j = 0; j < i; j++) {
                h[i] += (h[j] * h[i - (j + 1)]);
            }
        }
        result = h[n];
        return result;
    }


    public int numTrees(int n) {

        long C = 1;
        for (int i = 0; i < n; ++i) {
            C = C * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) C;
    }

    public int numTrees2(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;

        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
}








