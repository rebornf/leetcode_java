package leetcode.数组;

/**
 * @author fengtianyu
 * @version 1.0
 * @description: TODO
 * @date 2022/8/3 0:43
 */


import com.sun.corba.se.impl.naming.cosnaming.NamingUtils;

/**
 * 乘积最大子数组
 */
public class MaxProduct {
    
    public int getMaxProduct(int[] nums){
         int maxNum = 0;

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                int temp  = nums[i] *  nums[j];
                if (maxNum <  temp ){
                    maxNum = temp ;
                }
            }
        }
        return 0 ;
    }
}
