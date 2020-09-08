package leetcode.面试.美团; /**
 * Created with IntelliJ IDEA By fty on 2020/9/6
 */

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/9/6 10:09
 * @Version V1.0
 **/
public class 修改大小写 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x = change(str);
        System.out.println(x);


    }

    public static int change(String str) {
        int cntU = 0;
        int cntL = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                cntU ++ ;
            }
            if (str.charAt(i) >= 'A' && str.charAt(i) <='Z' ){
                cntL++ ;
            }
        }

        if (Math.abs(cntL-cntU) < 2){
            return 0 ;
        }else {
            return Math.abs(cntL - cntU)/2 ;
        }

    }
}
