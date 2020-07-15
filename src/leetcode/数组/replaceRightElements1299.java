package leetcode.数组; /**
 * Created with IntelliJ IDEA By fty on 2020/6/9
 */

import java.util.Arrays;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/9 18:51
 * @Version V1.0
 **/
public class replaceRightElements1299 {
    public static void main(String[] args) {
        int[] nums = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElments(nums)));
    }
    public  static int[] replaceElments(int[] arr){
        int rightMax = arr[arr.length - 1] ;
        arr[arr.length -1 ] = -1 ;
        for (int i = arr.length - 2 ;i >=0 ;i --){
            int t = arr[i];
            arr[i] = rightMax ;
            if (t > rightMax){
                rightMax = t ;
            }
        }
        return arr ;

    }
}
