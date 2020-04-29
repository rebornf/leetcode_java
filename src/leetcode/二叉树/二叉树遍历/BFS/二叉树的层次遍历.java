package leetcode.二叉树.二叉树遍历.BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/10 21:00
 * @Version V1.0
 **/


public class 二叉树的层次遍历 {
    TreeNode last ;
    TreeNode nlast;
    public void PrintTree(TreeNode root){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            last=root;
            nlast= root;
            while(!queue.isEmpty()){
                TreeNode t =queue.peek();
                System.out.print(queue.poll().val+"");
                if (t.left !=null){
                    queue.add(t.left);
                    nlast =t.left ;
                }
                if (t.right !=null){
                    queue.add(t.right);
                    nlast =t.right;
                }
                //如果当前节点是最右节点，那么换行
                if (last ==t){
                    System.out.println();
                    last =nlast ;
                }
            }
        }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left =new TreeNode(2);
        root.right =new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.right.left =new TreeNode(5);
        root.right.right= new TreeNode(6);
        root.right.left.left =new TreeNode(7);
        root.right.left.right=new TreeNode(8);
        二叉树的层次遍历 t1 =new 二叉树的层次遍历();
        t1.PrintTree(root);

    }
    public static class TreeNode{
        int val;
        TreeNode left ;
        TreeNode right;

        TreeNode(int x){
            val= x;
        }
    }
    }





