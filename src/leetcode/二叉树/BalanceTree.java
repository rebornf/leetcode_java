package leetcode.二叉树;

/**
 * @Author fty
 * @Description 判断是否是平衡二叉树，采用递归的方法
 * @Date 2020/4/3 13:02
 * @Version V1.0
 **/
/*
public class BalanceTree {
    public static void main(String[] args) {

    }
    boolean res = true ;

    public boolean isBalanced(TreeNode root ){
        helper(root);
        return res ;

    }

    public int helper(TreeNode root){
        if (root ==null){
            return 0;
        }
        int left = helper(root.left)+1;
        int right = helper(root.right)+1;
        if (Math.abs(right -left)>1){
            res =false;
        }
        return Math.max(left,right);
    }

    public class TreeNode{
        int val ;
        TreeNode left ;
        TreeNode right ;
        TreeNode(int x){
            val =x ;
        }
    }
}
*/

