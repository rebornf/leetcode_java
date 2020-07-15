package leetcode.面试.vivo; /**
 * Created with IntelliJ IDEA By fty on 2020/6/7
 */

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/7 15:50
 * @Version V1.0
 **/

    public class 楼层 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(superEggDrop(k,n));
    }
        public static int superEggDrop(int K, int N) {
            int count=1;
            while(getcounts(count,K)<N){
                ++count;
            }
            return count;
        }

        /**
         * 可确定的楼层
         * @param count 移动次数
         * @param egg 鸡蛋数
         * @return
         */
        public static int getcounts(int count,int egg){
            if(count==1||egg==1){
                return count;
            }
            return getcounts(count-1,egg)+1+getcounts(count-1,egg-1);
        }
}
