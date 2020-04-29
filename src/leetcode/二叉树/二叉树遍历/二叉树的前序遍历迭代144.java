package leetcode.二叉树.二叉树遍历;


import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/11 16:24
 * @Version V1.0
 **/
public class 二叉树的前序遍历迭代144 {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            // System.out.println(output);
        }
        return output;

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);
        二叉树的前序遍历迭代144 t2 = new 二叉树的前序遍历迭代144();

        System.out.println(t2.preorderTraversal(root));

    }
}