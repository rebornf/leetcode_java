package leetcode.二叉树;

import java.util.Scanner;

/**
 * @Author fty
 * @Description 两种方法，一个是卡特兰公式，另一个是动态规划，往后推导也是卡特兰公式
 * @Date 2020/4/30 10:15
 * @Version V1.0
 **/
public class 不同的二叉搜索树200 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numTrees(n));

    }


    //方法1  ，采用卡特兰公式
    public static int numTrees(int n) {
        long c = 1;
        for (int i = 0; i < n; i++) {
            c = c * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) c;
    }

    //采用动态规划
    public int numsTrees2(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }


}
