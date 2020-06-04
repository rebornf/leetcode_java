package leetcode.数组;

import java.sql.SQLOutput;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/9 16:20
 * @Version V1.0
 **/
public class 逆序对 {
    public static void main(String[] args) {

    }
    /*
     暴力法
     */
    public int ReversePairs(int nums[]){
        int tmp = 0;
        int len =nums.length ;
        for (int i =0;i<len-1 ;i++){
            for (int j= i+1;j<len;j++){
                if (nums[i] > nums[j]){
                    System.out.println("找到逆序对之一:"+nums[i]+" "+nums[j]);
                    tmp++ ;
                }
            }
        }
        return tmp;
    }



}


