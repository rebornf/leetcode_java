package leetcode.字符串;


import java.util.Scanner;

/**
 * @author fty
 * @date 2020/11/13 10:25
 */

public class MutiplyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        MutiplyString ml = new MutiplyString() ;
        System.out.println(ml.Multiply(num1, num2));

    }
    /**
     *@param
     *@return 
     */
    //
    public String Multiply(String num1,String num2){
        if (num1.equals("0") || num2.equals("0")){
            return "0";
        }
        String ans = "0";
        int m = num1.length();
        int n = num2.length();
        for (int i = n-1; i >=0 ; i--) {
            StringBuffer curr = new StringBuffer();
            int add = 0 ;
            for (int j = n-1; j >i ; j--) {
                curr.append(0);
            }
            int y = num2.charAt(i) - '0';
            for (int j = m-1; j >= 0 ; j--) {
                int x = num1.charAt(j) -'0';
                int product = x*y + add;
                curr.append(product % 10);
                add = product / 10 ;
            }
            if ( add != 0){
                curr.append(add % 10);
            }
            ans = addString(ans,curr.reverse().toString());
        }
        return  ans ;
    }

    public String addString(String num1 ,String num2){
        int i = num1.length()-1;
        int j = num2.length()-1;
        StringBuffer sb = new StringBuffer();
        int add = 0;
        while ( i >= 0 || j >= 0){
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0 ;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0 ;
            int temp = n1 + n2 + add ;
            add = temp / 10 ;
            sb.append(temp % 10);
            i-- ;j-- ;
        }
        if (add == 1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
    




}
