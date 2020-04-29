package leetcode.二叉树.二叉树遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/11 15:46
 * @Version V1.0
 **/

public class 二叉树的前序遍历递归 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);
        二叉树的前序遍历递归 t2 = new 二叉树的前序遍历递归();
        System.out.println(t2.preorderTravel(root));

    }


    public List<Integer> preorderTravel(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }


    public void helper(TreeNode root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        helper(root.left, res);
        helper(root.right, res);
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
