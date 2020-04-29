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


    }

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

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
