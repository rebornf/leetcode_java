package leetcode.二叉树;

import com.sun.source.tree.BinaryTree;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/3/23 23:46
 * @Version V1.0
 **/
public class TreeDeep {
    public static void main(String[] args) {


    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int MaxDeep(TreeNode root){
        if (root ==null){
            return 0;
        }else {
            int left_height =MaxDeep(root.left);
            int right_height =MaxDeep(root.right);
            return java.lang.Math.max(left_height,right_height);
        }
    }
}



