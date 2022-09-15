package leetcode;

/**
 * @author fengtianyu
 * @version 1.0
 * @description: TODO
 * @date 2022/9/15 20:21
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 数字 n代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 * <p>
 * 输入：n = 1
 * 输出：["()"]
 */
public class GenerateParenthesis22 {

    public static void main(String[] args) {
        GenerateParenthesis22 generateParenthesis22 = new GenerateParenthesis22();
        List<String> result =generateParenthesis22.generateParenthesis(3);
        System.out.println(result);
    }

    public  List<String> generateParenthesis(int n){
        List<String> combination =  new ArrayList<String>();
        generateAll(new char[2*n],0,combination);
        return combination ;
    }

    public  void generateAll(char[] current, int pos, List<String> result){
        if (pos == current.length){
            if (valid(current)){
                result.add(new String(current));
            }
        }else {
            current[pos] = '(';
            generateAll(current,pos +1 ,result);
            current[pos] = ')';
            generateAll(current,pos+1,result);
        }
    }

    /**
     * 校验生成的括号是否有效
     *
     * @param temp
     * @return
     */
    public boolean valid(char[] temp) {
        int result = 0;
        for (char c : temp) {
            if (c == '(') {
                ++result;
            } else {
                --result;
            }
            if (result < 0) {
                return false;
            }
        }
        return result == 0;
    }


}
