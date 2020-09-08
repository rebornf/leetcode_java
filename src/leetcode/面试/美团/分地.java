package leetcode.面试.美团; /**
 * Created with IntelliJ IDEA By fty on 2020/9/6
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/9/6 11:08
 * @Version V1.0
 **/
public class 分地 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt() ;
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[] A = new int[p];
        int[] B = new int[q] ;
        for (int i = 0; i < p; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i <q; i++) {
            B[i] = sc.nextInt();
        }
        int[] arr = changs(A,B,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"");
        }
    }

    public static int[] changs(int[] A ,int[] B,int n){
        int count = 0 ;
        int[] nums = new int[n+1];
        Arrays.fill(nums,1);
        for (int i = 0; i < A.length; i++) {
            nums[A[i]] = 0;
        }
        for (int i = 0; i < B.length; i++) {
            if (nums[B[i]]==0){
                count++ ;
            }
        }
        return  new int[]{A.length-count,B.length-count,count};
    }
}
