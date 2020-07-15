package DataStructure.Array; /**
 * Created with IntelliJ IDEA By fty on 2020/6/7
 */

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/7 10:43
 * @Version V1.0
 **/
public class Array_crossborder {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        medthod();
    }

    //数组访问越界
    public static int medthod(){
        int i = 0;
        int[] arr = new int[3];
        try {
            for(; i<=3; i++){
                arr[i] = 0;
                System.out.println("hello world");
            }
        } catch (Exception e) {
            System.out.print("数组越界");
        }
        return 0;
    }
}
