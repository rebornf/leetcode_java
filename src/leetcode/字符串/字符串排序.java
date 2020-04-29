package leetcode.字符串;


import java.util.*;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/25 13:04
 * @Version V1.0
 **/
public class 字符串排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
        }
        Arrays.sort(array);
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + "");
        }
    }
}

