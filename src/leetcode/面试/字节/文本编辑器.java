package leetcode.面试.字节;

import java.util.Scanner;
import java.util.Stack;

public class 文本编辑器 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S = "";
        Stack<String> stack = new Stack<>();
        while (N-- > 0) {
            String str = sc.nextLine();
            String[] strings = str.split(" ");
            int opt = Integer.parseInt(strings[0]);
            switch (opt) {
                case 1: {
                    stack.push(S);
                    S += strings[1];
                    break;
                }
                case 2: {
                    stack.push(S);
                    int numDel = Integer.parseInt(strings[1]);
                    S = S.substring(0, S.length() - numDel);
                    break;
                }
                case 3: {
                    int numK = Integer.parseInt(strings[1]);
                    System.out.println(S.charAt(numK - 1));
                    break;
                }
                case 4: {
                    S = stack.pop();
                    break;
                }
            }
        }
    }
}