package leetcode.二叉树; /**
 * Created with IntelliJ IDEA By fty on 2020/7/12
 */

import java.util.Stack;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/7/12 22:55
 * @Version V1.0
 **/
public class T1 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        //System.out.println(isValidBST(root));
        inorder(root);
    }
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }



    public static void inorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);//
        while (!stack.empty() || root != null){
            if(root != null){
                stack.push(root);
                root = root.left;
            }else {
                root = stack.pop();
                System.out.println(root.val);
                root = root.right;
            }
        }
    }




}

