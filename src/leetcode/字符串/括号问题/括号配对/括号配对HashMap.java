package leetcode.字符串.括号问题.括号配对;

import javax.print.attribute.standard.PrinterResolution;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/22 22:23
 * @Version V1.0
 **/
public class 括号配对HashMap {
    private HashMap<Character, Character> maps;

    public 括号配对HashMap() {
        this.maps = new HashMap<Character, Character>();
        this.maps.put(')', '(');
        this.maps.put(']', '[');
        this.maps.put('}', '{');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (this.maps.containsKey(c)) {
                char stacktop = stack.empty() ? '#' : stack.pop();
                if (stacktop != this.maps.get(c)) {
                    return false;
                }

            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("请输入");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        括号配对HashMap khh = new 括号配对HashMap();
        System.out.println(khh.isValid(str));
    }
}
