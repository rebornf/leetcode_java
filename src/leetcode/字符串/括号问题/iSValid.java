package leetcode.字符串.括号问题;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.*;

/**
 * @author fengtianyu
 * @version 1.0
 * @description: TODO
 * @date 2022/4/4 13:49
 */
public class iSValid {




    public boolean checkIsValid(String s){
        int len = s.length();
        if (len % 2 ==1 ){
            return  false ;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                if (stack.isEmpty() || !stack.peek().equals(map.get(ch))){
                    return false ;
                }
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
       return stack.isEmpty();
    }

    /**
     * 不用hashmap
     * @param s
     * @return
     */
    public boolean checkIsValid1(String s){
        if (s.length() % 2 == 1){
            return  false;
        }
        Stack<Character> stack = new Stack<>();
        for (Character character : s.toCharArray()){
            if (character == '('){
                stack.push(')');
            }else if (character == '['){
                stack.push(']');
            } else if (character == '{'){
                stack.push('}');
            }else if (stack.isEmpty() || !character.equals(stack.pop())){
                return  false ;
            }
        }
        return  stack.isEmpty() ;
    }

    public static void main(String[] args) {
        String s = "()";
        iSValid iSValid =new iSValid();
        Boolean result = iSValid.checkIsValid1(s);
        System.out.println(result);
    }

}
