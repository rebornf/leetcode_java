package DataStructure.Stack; /**
 * Created with IntelliJ IDEA By fty on 2020/6/30
 */

import java.util.Deque;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/30 21:49
 * @Version V1.0
 **/
public class Cqueue {
    public static void main(String[] args) {

    }

    Deque<Integer> stack1 ;
    Deque<Integer> stack2 ;

    public void appendTail(int value){
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()){
            stack2.push(stack1.pop());
        }
        return 0;
    }
}
