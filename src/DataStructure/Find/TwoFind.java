package DataStructure.Find; /**
 * Created with IntelliJ IDEA By fty on 2020/6/9
 */

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;
import leetcode.字符串.括号问题.括号配对.括号配对HashMap;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/9 21:25
 * @Version V1.0
 **/
public class TwoFind {
    public static void main(String[] args) {

    }


    /*
    * @Description: 简单的二分查找
    * @Param:  n 数组长度 value 查找的值
    * @return:
    * @Author: fty
    * @Date:
    */
    public static int simpleFind(int[] nums ,int n ,int value){
        int low = 0;
        int high = n - 1;
        int mid = low + (high - low )/ 2;
        if (nums[mid] == value) {
            low = mid + 1;
        }else if (nums[mid] < value){
            low = mid + 1 ;
        }else {
            high = mid - 1;
        }
        return  -1 ;
    }




    /*
    * @Description: 递归实现
    * @Param:
    * @return:
    * @Author: fty
    * @Date:
    */

    public static int recurFind(int[] nums,int low ,int high ,int value){
        if (low > high){
            return -1 ;
        }
        int mid = low + (high - low)/2;
        //进行递归
        if (nums[mid] == value){
            return mid ;
        }else if (nums[mid] < value){
            return recurFind(nums,mid+1, high, value);
        }else {
            return recurFind(nums, low, mid-1, value);
        }
    }
    
    
    /*
    * @Description:查找第一个值等于定值的元素
    * @Param:  a 数组
    * @return:  n 数组长度
    * @Author: fty
    * @Date:  
    */

    public int find1(int[] a,int n , int value){
        int low = 0;
        int high = n-1 ;

        while (low <= high){
            int mid= low + (high - low)/2;
            if(a[mid] == value){
                if (mid == n-1 || a[ mid + 1] != value){
                    return mid;
                }else {
                    low = mid + 1;
                }
            }else if(a[mid] < value){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return  -1 ;
    }


    /*
    * @Description:查找最后一个等于定值的元素
    * @Param:  a 数组
    * @return:  n 数组
    * @Author: fty
    * @Date:
    */


}
