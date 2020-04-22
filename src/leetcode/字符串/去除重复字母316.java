package leetcode.字符串;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/20 13:27
 * @Version V1.0
 **/

import java.nio.file.StandardWatchEventKinds;
import java.util.Scanner;
import java.util.Stack;

/**
 * 给你一个仅包含小写字母的字符串，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 * 示例 1:
 * <p>
 * 输入: "bcabc"
 * 输出: "abc"
 * 示例 2:
 * <p>
 * 输入: "cbacdcbc"
 * 输出: "acdb"
 * 1遍历字符串里的字符，如果读到的字符的 ASCII 值是升序，依次存到一个栈中；
 * 2若栈中由当前元素，则直接去除当前元素
 * 3 若栈顶的元素比当前的元素字典序大，且当前的元素的位置后面还有栈顶元素，将栈顶元素出栈，并且将当前的元素入栈
 */

//peek()函数返回栈顶的元素，但不弹出该栈顶元素
//pop()函数返回栈顶的元素，并且将该栈顶元素出栈。

/**String str1="012345012345";
 String str2="23";
 System.out.println( str1.indexOf(str2,5) );
 输出为8.
 java 中的string.indexof();查找字符或者字符串第一次出现的地方的索引 ，未找到的情况下返回-1；
 String.indexOf(String str，int index)
 从index的地方开始找，返回第一次出现的索引
 */

public class 去除重复字母316 {
    public static void main(String[] args) {
        System.out.println("请输入");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeDuplicateletters(s));

    }

    public static String removeDuplicateletters(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (stack.contains(c)) {
                continue;
            }//若栈中有该元素，则直接跳出，开始下次循环
            while (!stack.isEmpty() && stack.peek() > c && s.indexOf(stack.peek(), i) != 1) {
                stack.pop();
                stack.push(c);
            }
        }
        char[] tmp = new char[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            tmp[i] = stack.get(i);
        }
        return new String(tmp);
    }
}

