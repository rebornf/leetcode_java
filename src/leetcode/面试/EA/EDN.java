package leetcode.面试.EA;

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/29 20:41
 * @Version V1.0
 **/
public class EDN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] numStr = str.split(",");
        int start = Integer.parseInt(numStr[0]);
        int end = Integer.parseInt(numStr[1]);
        int res = 0;
        for (int i = start; i <= end; i++) {
            if (isZDN2(i)) {
                res++;
            }
        }
        System.out.println(res);
    }

    public static boolean isZDN(int num) {
        String str = Integer.toBinaryString(num);
        int numZero = 0;
        int numOne = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0')
                numZero++;
            else
                numOne++;
        }
        return numZero >= numOne;
    }

    public static boolean isZDN2(int num) {
        String str = Integer.toBinaryString(num);
        int numOne = 0;
        while (num != 0) {
            numOne++;
            num = num & (num - 1);
        }
        return (str.length() - numOne) >= numOne;
    }

    public static boolean isZDN3(int num) {
        String str = Integer.toBinaryString(num);
        int numOne = 0;
        int d = 8;
        while (num != 0) {
            numOne++;
            num = num & (num - 1);
        }
        return (str.length() - numOne) >= numOne;
    }


}


