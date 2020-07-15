//package leetcode.查找; /**
// * Created with IntelliJ IDEA By fty on 2020/7/6
// */
//
//import com.sun.javafx.iio.gif.GIFImageLoaderFactory;
//import leetcode.动态规划.dp数组.打家劫舍II213;
//
///**
// * @Author fty
// * @Description TODO
// * @Date 2020/7/6 22:33
// * @Version V1.0
// **/
//public class 可可吃香蕉 {
//    public static void main(String[] args) {
//       int[] nums ={3,6,7,11};
//       int  H = 8 ;
//        System.out.println(minEatingSpeed(nums,H));
//    }
//    //采用暴力法
//    public static int minEatingSpeed(int[] piles ,int H) {
//        int max = getMax(piles);
//        for (int speed = 1; speed < max ; speed++) {
//            if (canfinish(speed,piles,H))
//                return speed ;
//        }
//
//        return max ;
//    }
//
//
//    public static int minEatingSpeed1(int[] piles ,int H) {
//        int left = 1 ;
//        int right  = getMax(piles)+1;
//        while (left < right){
//            int mid = left + (right - left )/2 ;
//            if (canfinish(piles,mid,H)){
//                right = mid ;
//            }else {
//                left = mid +1 ;
//            }
//            return  left ;
//        }
//
//        int max = getMax(piles);
//        for (int speed = 1; speed < max ; speed++) {
//            if (canfinish(speed,piles,H))
//                return speed ;
//        }
//
//        return max ;
//    }
//
//
//
//    private static boolean canfinish(int speed, int[] piles, int H) {
//        int time = 0;
//        for (int n:
//             piles){
//           time = time +timeof(n,speed);
//        }
//        return time <= H ;
//  }
//    private static int timeof(int n, int speed){
//        int x ;
//        if(n % speed > 0){
//             x = 1;
//        }else {
//             x = 0;
//        }
//        return (n / speed) + x ;
//    }
//
//
//    private static int getMax ( int[] piles){
//        int max = 0;
//        for (int n :
//                piles) {
//            max = Math.max(n, max);
//        }
//        return max ;
//    }
//}
