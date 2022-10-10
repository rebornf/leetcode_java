package leetcode;



/**
 * @author fengtianyu
 * @version 1.0
 * @description: TODO
 * @date 2022/9/27 20:56
 */
public class PowLeetCode50 {


    /**
     * 暴力法 ，时间复杂度 O(N) ,空间复杂度 O(1);
     * @param x
     * @param n
     * @return
     */
    public static  double reforceMyPow(double x ,int n) {
        long N = n ;
        if (N < 0){
            x = 1/x ;
            N = -N ;
        }
        double ans = 1 ;
        for (int i = 0 ;i < n ;i ++){
            ans = ans * x;
        }
        return ans ;

    }


   public static  double getPow(double x , int n){
         if ( n == 1 ){
             return x ;
         }
         if (n % 2 != 0){
             double half = getPow(x , n/2);
             return half * half * x ;
         }else {
             double half = getPow(x,n/2);
             return half * half ;
         }
   }



   static double myPow(double x, int n){
        if ( n == 0  || x == 1){
            return  1 ;
        }
        if (n < 0){
            return 1/getPow(x,n);
        }
        return getPow(x,n);
   }

   public static  double quickMul(double x ,long N){
       double  result ;
       if (N == 0){
           return  1.0 ;
       }
       double y = quickMul(x,N/2);
       if (N % 2 == 0){
           result = y * y;
       }else {
           result =  y * y * x ;
       }
       return  result ;

   }

    public static void main(String[] args) {
       double c = myPow(2.0000,10);
        System.out.println(c);
    }

//    public static void main(String[] args) {
//        int n=3;
//        int result = sum(n);
//        System.out.println(result);
//
//    }

    public static int sum(int n) {
        if(n==1) {
            return 1;
        }
        return n*sum(n-1);
    }


}
