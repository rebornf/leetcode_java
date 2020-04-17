package leetcode.二叉树.二叉树遍历;

import java.util.*;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/11 0:36
 * @Version V1.0
 **/
public class 二叉树层次遍历迭代 {

    public List<List<Integer>> levelOrder(TreeNode root ){
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if(root ==null) return levels ;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //将根节点放入队列，然后不断遍历队列
        queue.add(root);
        int level =0 ;
        while (!queue.isEmpty()){
            //开始当前层数
            //将队列中的元素都拿出来(也就是获取这一层的节点)，放到levels中
            levels.add(new ArrayList<>());
            //获取当前队列的长度，这个长度相当于当前这一层节点的个数
            int len = queue.size();
            for (int i=0;i<len;i++){
                TreeNode node = queue.remove();
                levels.get(level).add(node.val);
                if (node.left !=null)queue.add(node.left);
                if (node.right!=null)queue.add(node.right);
            }
            level++;
        }
        Collections.reverse(levels);
        return levels;

    }

    public static class TreeNode{
        int val ;
        TreeNode left ;
        TreeNode right ;
        TreeNode(int x){
            val = x ;
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
        二叉树层次遍历迭代 t2 =new 二叉树层次遍历迭代();
        System.out.print(t2.levelOrder(root));

    }
}
