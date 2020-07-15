package leetcode.面试.vivo; /**
 * Created with IntelliJ IDEA By fty on 2020/6/7
 */

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/7 15:12
 * @Version V1.0
 **/
public class 种花 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n  = sc.nextInt() ;
            sc.nextLine();
            String str = sc.nextLine();
            String[] nums = str.split(" ");
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(nums[i]);
            }
            System.out.println(canPlaceFlowers(num));

        }

    public static int canPlaceFlowers(int[] flowerbed) {
        int i = 0, count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            i++;
        }
        return count;
    }
}


