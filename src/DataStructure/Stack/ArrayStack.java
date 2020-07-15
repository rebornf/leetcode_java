package DataStructure.Stack; /**
 * Created with IntelliJ IDEA By fty on 2020/6/6
 */

/**
 * @Author fty
 * @Description 基于数组的顺序栈
 * @Date 2020/6/6 20:18
 * @Version V1.0
 **/
public class ArrayStack {
    private static String[] arr ;//数组
    private static int count ;//栈中元素的个数
    private static int n ; //栈的大小


    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(String.valueOf(1));
        arrayStack.push(String.valueOf(2));
        arrayStack.push(String.valueOf(3));
        arrayStack.push(String.valueOf(4));
        arrayStack.push(String.valueOf(5));
        System.out.println("此时栈是否为空：" + arrayStack.isEmpty());// 判断栈是否为空
        System.out.println("获取栈顶元素" + arrayStack.peek());// 获取栈顶元素
//       // System.out.println("当前栈内元素共有：    " + arrayStack.size() + "个");
//        System.out.println("元素：    " + arrayStack.pop() + "出栈");// 元素出栈
//        System.out.println("当前栈内元素共有：    " + arrayStack.c + "个");
//        arrayStack
//        System.out.println("当前栈内元素共有：    " + arrayStack.size() + "个");

    }


    public ArrayStack(int n){
        this.arr = new String[n];
        this.n = n ;
        this.count = 0;
    }


    /*
    * @Description:  入栈
    * @Param:  item 入栈的元素
    * @return:  是否入栈成功
    * @Author: fty
    * @Date:
    */

    public static boolean push(String item) {
        //数组空间不够了，直接返回false，入栈失败
        if (count == n ){
            return false ;
        }
        arr[count] = item ;
        count ++ ;
        return true ;
    }

 /*
 * @Description: 出栈
 * @Param:
 * @return: 返回出栈元素
 * @Author: fty
 * @Date:
 */

    public static String pop(){
        if (count == 0){
            return  null ;
        }
        String tmp = arr[count -1] ;
        count -- ;
        return tmp ;
    }

    public static boolean isEmpty(){
        return false;
    }

    public static String peek(){
        return arr[count-1];
    }


}
