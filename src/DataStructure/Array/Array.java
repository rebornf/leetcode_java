package DataStructure.Array; /**
 * Created with IntelliJ IDEA By fty on 2020/6/7
 */

/**
 * @Author fty
 * @Description   /
 *  * 测试数据注意事项：
 *  *
 *  * 插入数据：
 *  * 1、判断空数组插入数据。
 *  * 2、输入下标索引超出下标范围。
 *  * 3、将数据插入到尾部。
 *  *
 *  * 查找数据：
 *  * 1、输入下标超出下标范围
 *  *
 *  *
 *  * 删除数据：
 *  * 1、索引超出下标范围。
 *  * 2、删除尾元素
 *  *
 *  */

import java.math.BigInteger;

/**
 *  * 1) 数组的插入、删除、按照下标随机访问操作；
 *  * 2）数组中的数据是int类型的
 * @Date 2020/6/7 9:55
 * @Version V1.0
 **/
public class Array {
    public static void main(String[] args) {

    }

    private int[] data ;
    private int count ;
    private int n;


    /*
    * @Description: 数组传参 ，数组的大小 构造函数
    * @Param:
    * @return:
    * @Author: fty
    * @Date:
    */

    public Array(int capacity){
        n =capacity ;
        data = new int[capacity];
        count = 0 ;
    }


    /*
    * @Description: 数组插入元素
    * @Param: index：数组下表索引
    * @Param: value: 要插入数组的元素值
    * @return:  是否插入成功
    * @Author: fty
    * @Date:
    */

    public boolean insert(int index ,int value){
        if (index < 0 || index > count)return  false ;//首先考虑数组的越界问题，是否在数组索引范围内
        if ( count == n){
            return false ;
        }
        for (int i = count - 1 ;i>=index ;i --){ //数组中的数据最后依次向后移动，直到用户指定索引元素空出空间
            data[i+1] = data[i] ;
        }
        data[index] = value ;
        count ++ ;
        return true ;
    }


    /*
    * @Description: 插入头元素
    * @Param: value 插入元素的值
    * @return:
    * @Author: fty
    * @Date:
    */

    public Boolean insertHead(int value){
        data[count] = value ;
        count ++ ;
        return  true ;
    }


    /*
    * @Description: 下标随机访问
    * @Param: index 用户传参下标
    * @return:
    * @Author: fty
    * @Date:
    */

    public int find(int index){
        if (index < 0 || index > count ){
            return -1;
        }
        return data[index-1];
    }


    /*
    * @Description: 根据用户输入的索引删除数组中的数据
    * @Param: index 数组下标
    * @return:
    * @Author: fty
    * @Date:
    */

    public  boolean delete(int index){
        if (index < 0 || index > count) return false ;
        //将删除的元素的后面元素都依次向前移动
        for (int i = index; i <count ; i++) {
            data[i-1] = data[i] ;
        }
        count -- ;
        return  true ;
    }

    public void printAll(){
        for (int i = 0; i < count; i++) {
            System.out.println(data[i] + "");
        }
        System.out.println();
    }
}
