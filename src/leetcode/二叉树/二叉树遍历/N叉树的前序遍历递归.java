package leetcode.二叉树.二叉树遍历;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/11 15:46
 * @Version V1.0
 **/
public class N叉树的前序遍历递归 {
     List<Integer> res =new LinkedList<>();
    public List<Integer> preorder(Node root ){

        dfs(root);
        return res;
    }

    public void dfs(Node root){
        if (root==null)return ;
        res.add(root.val);
        for (var child:root.child){
            dfs(child);
        }
    }


    public class Node{
        int val ;
        public List<Node> child;

        public Node(int _val) {
            val = _val;
        }


        public Node(int _val, List<Node> _child) {
            val = _val;
            child = _child;


        }
    }
}
