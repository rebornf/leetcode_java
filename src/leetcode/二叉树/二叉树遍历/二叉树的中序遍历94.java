package leetcode.二叉树.二叉树遍历;

import java.util.*;

/**
 * @Author fty
 * @Description leetcode 94
 * @Date 2020/4/27 21:34
 * @Version V1.0
 **/
public class 二叉树的中序遍历94 {
    public static void main(String[] args) {

       TreeNode root = null;
        

        二叉树的中序遍历94 二叉树的中序遍历94 = new 二叉树的中序遍历94();
        List<Integer> list = 二叉树的中序遍历94.inorderTravesal2(root);
        System.out.println(list);
    }


    /**
     * 中序遍历，迭代法
     * @param root
     * @return
     */
    public List<Integer> inorderTravesal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;//当前节点
        while (curr != null || !stack.isEmpty()) {//
            while (curr != null) {
                stack.push(curr);//节点不为0，放入栈中，直到最左的子节点为空
                curr = curr.left;
            }
            curr = stack.pop();//然后出栈，
            res.add(curr.val);
            curr = curr.right;

        }
        return res;
    }

    public List<Integer> inorderTravesal2(TreeNode root){
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res ;
    }

    /**
     * 中序遍历
     */
    public void inorder(TreeNode treeNode ,List<Integer> res){
        if (treeNode == null) {
            return;
        }
        inorder(treeNode.left,res);
        res.add(treeNode.val);
        inorder(treeNode.right,res);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
