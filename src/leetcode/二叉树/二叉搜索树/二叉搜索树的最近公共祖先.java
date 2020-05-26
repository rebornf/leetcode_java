package leetcode.二叉树.二叉搜索树; /**
 * Created with IntelliJ IDEA By fty on 2020/5/25
 */

import jdk.nashorn.internal.ir.CallNode;
import leetcode.字符串.括号问题.括号配对.括号配对HashMap;
import sun.reflect.generics.tree.Tree;

import java.time.Year;

/**
 * @Author fty
 * @Description 我们来复习一下二叉搜索树（BST）的性质：
 * <p>
 * 节点 NN 左子树上的所有节点的值都小于等于节点 N的值
 * 节点 NN 右子树上的所有节点的值都大于等于节点 N的值
 * 左子树和右子树也都是 BST
 * @Date 2020/5/25 14:34
 * @Version V1.0
 **/
public class 二叉搜索树的最近公共祖先 {
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

    //采用递归
    public TreeNode lowestCommenAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal = root.val;
        int pVal = p.val;
        int qVal = q.val;
        if (pVal > parentVal && qVal > parentVal) {
            return lowestCommenAncestor(root.right, p, q);
        }
        if (pVal < parentVal && qVal < parentVal) {
            return lowestCommenAncestor(root.left, p, q);
        } else {
            return root;
        }

    }

    //采用迭代
    public TreeNode lowestCommenAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        int pVal = p.val;
        int qVal = q.val;
        TreeNode node = root;
        while (node != null) {
            int parentVal = node.val;
            if (pVal > parentVal && qVal > parentVal) {
                node = node.right;
            } else if (pVal < parentVal && qVal < parentVal) {
                node = node.left;
            } else {
                return node;
            }
        }
        return null;
    }
}
