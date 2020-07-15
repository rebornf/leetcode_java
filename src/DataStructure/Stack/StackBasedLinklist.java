//package DataStructure.Stack;
///**
// * Created with IntelliJ IDEA By fty on 2020/6/6
// */
//
//
///**
// * @Author fty
// * @Description  �����������ʽջ ����ջ����ջ�����ջ
// * @Date 2020/6/6 21:39
// * @Version V1.0
// **/
//public class StackBasedLinklist {
//
//    public  Node top =null ;
//
//
//    private static class Node {
//
//        private int data;
//
//        private Node next;
//
//        public Node(int data,Node next) {
//            this.data = data;
//            this.next = null;
//        }
//        //get ��ȡ�����򷽷�
//        public int getData() {
//            return data;
//        }
//    }
//
//
//
//    /*
//    * @Description: ��ջ
//    * @Param:  value ��Ҫ��ջ��Ԫ��
//    * @return:
//    * @Author: fty
//    * @Date:
//    */
//
//    public void push(int value){
//        Node newNode = new Node(value,null);//����һ��ջ�ڵ�
//        if (top == null){
//            top = newNode ;
//        }else {
//            //���뵽topջ���ǰ
//            newNode.next = top ;
//            top = newNode ;
//        }
//    }
//
//    /*
//    * @Description: ��ջ
//    * @Param: -1 ջ��û������
//    * @return : -1 ջ��û������
//    * @Author: fty
//    * @Date:
//    */
//
//    public int pop() {
//        if (top == null) {
//            return -1;
//        }
//        int value = top.data ;
//        top = top.next;
//        return  value ;
//    }
//
//    public void printAll(){
//        Node p =  top ;//��ջ��ָ�븳ֵ��p
//        while ( p != null){
//            System.out.println(p.data +"");
//            p = p.next ; //ָ����һ���ڵ�
//        }
//        System.out.println();
//    }
//}
