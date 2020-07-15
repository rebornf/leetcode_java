package leetcode.贪心; /**
 * Created with IntelliJ IDEA By fty on 2020/6/7
 */

import com.sun.deploy.security.MSCryptoDSASignature;

import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/7 16:18
 * @Version V1.0
 **/
public class flowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n =sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println(canPlaceFlowers(num));



    }
    public static int canPlaceFlowers(int[] flowerbed){
        int i= 0;
        int count = 0 ;
        while(i< flowerbed.length){
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 ||flowerbed[i+1] == 0)){
                flowerbed[i] = 1;
                count ++ ;
            }
            i++ ;
        }
        return count ;
    }
}
