package leetcode.面试.阅文;

import java.util.Scanner;

public class 堆栈实现队列 {

    static String str = "";
    static int k = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        k = sc.nextInt();
        int res = 0;
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                res += f(i, j);
            }
        }
        System.out.println(res);
    }

    public static int f(int l, int r) {
        String tmpStr = str.substring(l, r);
        for (int i = k; i <= tmpStr.length() / 2; i++) {
            String a = tmpStr.substring(0, i);
            int indexB = tmpStr.lastIndexOf(a);
            if (indexB != -1 && (indexB + i == tmpStr.length()) && (indexB > i)) {
                return 1;
            } else
                continue;
        }
        return 0;
    }
}