package leetcode.二叉树.二叉树遍历;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/10 21:36
 * @Version V1.0
 **/

/**
 * 时间复杂度：O(N)O(N)，因为每个节点恰好会被运算一次。
 * 空间复杂度：O(N)O(N)，保存输出结果的数组包含 N 个节点的值
 *
 * 最简单的解法就是递归，首先确认树非空，然后调用递归函数 helper(node, level)，参数是当前节点和节点的层次。程序过程如下：
 * 输出列表称为 levels，当前最高层数就是列表的长度 len(levels)。比较访问节点所在的层次 level 和当前最高层次 len(levels) 的大小，
 * 如果前者更大就向 levels 添加一个空列表。
 * 将当前节点插入到对应层的列表 levels[level] 中。
 * 递归非空的孩子节点：helper(node.left / node.right, level + 1)。
 */
public class 二叉树层序遍历递归 {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public void helper(TreeNode node, int level) {
        if (levels.size() == level)
            levels.add(new ArrayList<>());

        levels.get(level).add(node.val);

        if (node.left != null) {
            helper(node.left, level + 1);
        }
        if (node.right != null) {
            helper(node.right, level + 1);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return levels;
        helper(root, 0);
        return levels;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
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
        二叉树层序遍历递归 t2 =new 二叉树层序遍历递归();
        System.out.println(t2.levelOrder(root));

    }


}

