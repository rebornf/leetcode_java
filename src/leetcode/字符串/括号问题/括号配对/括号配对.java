package leetcode.字符串.括号问题.括号配对;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/13 19:49
 * @Version V1.0
 **/

/**
 * 括号配对问题
 * • 描述
 * 现在，有一行括号序列，请你检查这行括号是否配对。
 * • 输入
 * 输入数据都是一个字符串S(S的长度小于10000，且S不是空串），数据保证S中只含有"[","]","(",")"四种字符
 * • 输出
 * 每组输入数据的输出占一行，如果该字符串中所含的括号是配对的，则输出Yes,如果不配对则输出No
 * • 样例输入
 * [(])
 * (])
 * ([])
 * • 样例输出
 * No
 * No
 * Yes
 */
public class 括号配对 {
    public void check(String str) {
        Stack<Character> stack = new Stack<Character>();
        if (str.length() % 2 == 1) {
            System.out.println("No");
        } else {
            stack = new Stack<Character>();
        }
        for (int i = 0; i < str.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(str.charAt(i));
            } else if ((stack.peek() == '[' && str.charAt(i) == ']') || (stack.peek() == '(' && str.charAt(i) == ')') || (stack.peek() == '{' && str.charAt(i) == '}')) {
                stack.pop();
            } else {
                stack.push(str.charAt(i));
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static void main(String[] args) {
        System.out.println("请输入");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        括号配对 kh = new 括号配对();
        kh.check(str);
    }
}
