package leetcode.面试.美团; /**
 * Created with IntelliJ IDEA By fty on 2020/9/6
 */

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/9/6 11:52
 * @Version V1.0
 **/
public class YU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(how(nums));

    }

    public static int how (int[] a){
        int n  =  a.length ;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res^a[i];
        }
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <i ; j++) {
                res = res ^ (i%j);
            }
            if ((n-i)%2 != 0){
                res  = res ^ i;
            }

        }

       return res ;
    }
}
