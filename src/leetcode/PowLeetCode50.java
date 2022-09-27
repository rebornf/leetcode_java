package leetcode;

/**
 * @author fengtianyu
 * @version 1.0
 * @description: TODO
 * @date 2022/9/27 20:56
 */
public class PowLeetCode50 {


   public static  double getPow(double x , int n){
         long N = n ;
         return N >= 0 ? quickMul(x,N) : 1.0 /quickMul(x ,-N);
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
//result
//    public static void main(String[] args) {
//       double c = quickMul(2.0000,10);
//        System.out.println(c);
//    }

    public static void main(String[] args) {
        int n=3;
        int result = sum(n);
        System.out.println(result);

    }

    public static int sum(int n) {
        if(n==1) {
            return 1;
        }
        return n*sum(n-1);
    }


}
