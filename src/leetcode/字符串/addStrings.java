package leetcode.字符串;

import java.util.Scanner;

/**
 * @author fty
 * @date 2020/11/13 9:59
 */
public class addStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1  = sc.nextLine();
        String s2  = sc.nextLine();
        System.out.println(addStrings(s1,s2));

    }
   /**
    *@param s1 s2
     *@return
    * 时间复杂度: O(max(len1 ,len2)) ，竖式加法的次数取决于较大数的位数
    * 空间复杂度：O(1) ,java的方法中用了StrinBuffer，空间复杂度为O(n)
    */
    public static String addStrings(String s1 ,String s2){
        StringBuilder sb = new StringBuilder();  //StringBuilder初始化的时候
        int i = s1.length()-1 ;
        int j = s2.length()-1 ;
        int carry = 0 ;
        while (i >= 0 || j >= 0 ){
            int n1 = i >= 0 ? s1.charAt(i)-'0': 0 ;
            int n2 = j >= 0 ? s2.charAt(j)-'0': 0 ;
            int temp = n1 + n2+ carry;
            carry = temp / 10 ;
            sb.append(temp % 10);
            i--;j--;
        }
        if (carry == 1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
