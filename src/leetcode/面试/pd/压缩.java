package leetcode.面试.pd; /**
 * Created with IntelliJ IDEA By fty on 2020/6/2
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;

/**
 * @Author fty
 * @Description T
 * @Date 2020/6/2 20:37
 * @Version V1.0
 **/
public class 压缩 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] num = new int[N][2];
        for (int i = 0; i < N; i++) {
            num[i][0] = in.nextInt();
            num[i][1] = in.nextInt();
        }
        helper(num, N);
    }

    public static void helper(int[][] num, int N) {
        Arrays.sort(num, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                int temp1 = a[0] - a[1];
                int temp2 = b[0] - b[1];
                return temp2 - temp1;
            }
        });

        long res = 0;
        for (int i = 0; i < N - 1; i++) {
            res += num[i][1];
        }
        System.out.println(res + num[N - 1][0]);
    }

}

