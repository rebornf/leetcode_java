package leetcode.二叉树.二叉树遍历;

import com.sun.org.apache.xpath.internal.objects.XNodeSet;
import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/10 16:10
 * @Version V1.0
 **/
public class 二叉树的后序遍历145 {
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

    //把现前序遍历改成left->right->root 然后再进行逆序
    public List<Integer> postOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }
        Collections.reverse(res);
        return res;
    }


    //方法2 采用递归
    public List<Integer> postOrderTravesal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrderTravesalHelper(root, list);
        return list;

    }


    public void postOrderTravesalHelper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        postOrderTravesalHelper(root.left, list);
        postOrderTravesalHelper(root.right, list);
        list.add(root.val);
    }


    //方法3   记录上一次遍历的节点，是从 左子树还是 右子树
    public List<Integer> postOrderTravesal3(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode last = null;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                TreeNode tmp = stack.peek();//
                //是否变到了左子树
                if (tmp.right != null && tmp.right != last) {
                    cur = tmp.right;
                } else {
                    list.add(tmp.val);
                    last = tmp;
                    stack.pop();
                }

            }
        }
        return list;
    }


}
