package leetcode.面试; /**
 * Created with IntelliJ IDEA By fty on 2020/9/24
 */

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/9/24 19:48
 * @Version V1.0
 **/
public class wanmei {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int target = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            int[] nums = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                nums[i] = Integer.parseInt(arr[i]);
            }

            int result = search(nums, target);

            System.out.println(result);
        }

        public static int search(int[] nums, int target) {
//todo
            int len = nums.length ;
            for(int i = 0;i< len ; i++){
                if(nums[i] == target){
                    return i ;
                }
            }
            return -1;
        }
}

