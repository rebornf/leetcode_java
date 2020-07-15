package DataStructure.LinkList; /**
 * Created with IntelliJ IDEA By fty on 2020/6/11
 */

import javax.xml.soap.Node;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/11 23:01
 * @Version V1.0
 **/
public class LinkedListAlg {
    public static void main(String[] args) {
        
    }
    
    
    /*
    * @Description:定义Node节点 包含数据域和引用(存储所指向对象的内存地址)
    * @Param:  
    * @return:  
    * @Author: fty
    * @Date:  
    */

    public static class Node{
        //数据域
        private int data ;
        //引用 (存储所指向对象的内存地址)
        private Node next ;
        //构造函数(初始化数据)
        public Node(int data ,Node next){
            this.data = data ;
            this.next = next ;
        }
        //获取节点数据元素
        public int getData(){
            return  data ;
        }
    }

    public static Node creatNode(int value){
        return new Node(value,null);
    }
}
