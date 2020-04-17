package leetcode.字符串.括号问题;

import java.util.Stack;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/13 19:49
 * @Version V1.0
 **/

/**
 括号配对问题
 • 描述
 现在，有一行括号序列，请你检查这行括号是否配对。
 • 输入
 输入数据都是一个字符串S(S的长度小于10000，且S不是空串），数据保证S中只含有"[","]","(",")"四种字符
 • 输出
 每组输入数据的输出占一行，如果该字符串中所含的括号是配对的，则输出Yes,如果不配对则输出No
 • 样例输入
 [(])
 (])
 ([])
 • 样例输出
 No
 No
 Yes
 */
public class 括号配对 {
    public void check(String str ){
        Stack<Character> stack =new Stack<Character>();
        //长度为奇数，不匹配
        if (str.length() %2 ==1){
            System.out.println("NO");
        }else {
            stack =new Stack<Character>();


            for (int i=0;i<str.length();i++){
                if (str.charAt(i)=='('||(str.charAt(i)=='[')){
                    stack.push(str.charAt(i));//当前栈时空的，存入位置字符
                }else if ((stack.peek()=='['&& str.charAt(i)==']')){
                    stack.pop();//表示相邻的两哥字符是一对匹配括号,出栈
                }else {
                    stack.push(str.charAt(i));
                }
            }
            if (stack.isEmpty()){
                System.out.println("Yes");
            }else {
                System.out.println("NO");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入");
    }
}
