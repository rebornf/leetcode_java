package DataStructure.Array; /**
 * Created with IntelliJ IDEA By fty on 2020/6/7
 */

/**
 * @Author fty
 * @Description   /
 *  * ��������ע�����
 *  *
 *  * �������ݣ�
 *  * 1���жϿ�����������ݡ�
 *  * 2�������±����������±귶Χ��
 *  * 3�������ݲ��뵽β����
 *  *
 *  * �������ݣ�
 *  * 1�������±곬���±귶Χ
 *  *
 *  *
 *  * ɾ�����ݣ�
 *  * 1�����������±귶Χ��
 *  * 2��ɾ��βԪ��
 *  *
 *  */

import java.math.BigInteger;

/**
 *  * 1) ����Ĳ��롢ɾ���������±�������ʲ�����
 *  * 2�������е�������int���͵�
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
    * @Description: ���鴫�� ������Ĵ�С ���캯��
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
    * @Description: �������Ԫ��
    * @Param: index�������±�����
    * @Param: value: Ҫ���������Ԫ��ֵ
    * @return:  �Ƿ����ɹ�
    * @Author: fty
    * @Date:
    */

    public boolean insert(int index ,int value){
        if (index < 0 || index > count)return  false ;//���ȿ��������Խ�����⣬�Ƿ�������������Χ��
        if ( count == n){
            return false ;
        }
        for (int i = count - 1 ;i>=index ;i --){ //�����е����������������ƶ���ֱ���û�ָ������Ԫ�ؿճ��ռ�
            data[i+1] = data[i] ;
        }
        data[index] = value ;
        count ++ ;
        return true ;
    }


    /*
    * @Description: ����ͷԪ��
    * @Param: value ����Ԫ�ص�ֵ
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
    * @Description: �±��������
    * @Param: index �û������±�
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
    * @Description: �����û����������ɾ�������е�����
    * @Param: index �����±�
    * @return:
    * @Author: fty
    * @Date:
    */

    public  boolean delete(int index){
        if (index < 0 || index > count) return false ;
        //��ɾ����Ԫ�صĺ���Ԫ�ض�������ǰ�ƶ�
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
