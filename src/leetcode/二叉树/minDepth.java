package leetcode.二叉树;

/**
 * @Author fty
 * @Description 求二叉树的最小深度
 * @Date 2020/4/3 13:49
 * @Version V1.0
 **/
/**
时间复杂度：我们访问每个节点一次，时间复杂度为 O(N)O(N) ，其中 NN 是节点个数。
空间复杂度：最坏情况下，整棵树是非平衡的，例如每个节点都只有一个孩子，
 递归会调用 NN （树的高度）次，因此栈的空间开销是 O(N)O(N) 。
 但在最好情况下，树是完全平衡的，高度只有 \log(N)log(N)，因此在这种情况下空间复杂度只有 O(\log(N))O(log(N)) 。


 */
public class minDepth {
    public static void main(String[] args) {

    }
    public int MinDeep(TreeNode root ){
        if(root ==null){
            return 0 ;
        }

        if ((root.left==null) && (root.right == null)){
            return 1;
        }
        int min_depth =Integer.MAX_VALUE;
        if (root.left!=null){
            min_depth =Math.min(MinDeep(root.left),min_depth);
        }
        if (root.right!=null){
            min_depth =Math.min(MinDeep(root.right),min_depth);
        }
        return min_depth+1 ;

    }

    public class TreeNode {
        int val ;
        TreeNode left ;
        TreeNode right ;
        TreeNode(int x){
            val = x ;
        }
    }
}

