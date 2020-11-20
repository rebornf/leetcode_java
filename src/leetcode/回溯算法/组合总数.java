package leetcode.回溯算法;

import java.util.*;

/**
 * @author fty
 * @date 2020/11/20 14:36
 */
public class 组合总数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s =sc.nextLine();
            String[] str = s.split(" ");
            int[] nums =new int[str.length];
            for (int i = 0; i < str.length; i++) {
                nums[i] =Integer.parseInt(str[i]);
            }
            int target = sc.nextInt();
            组合总数 zh = new 组合总数();
            System.out.println(zh.combinationSum(nums,target));
        }


    }

    public List<List<Integer>> combinationSum(int[] candidates,int target){
        int len = candidates.length;
        List<List<Integer>> res =new ArrayList<>();
        if (len == 0){
            return  res ;
        }
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates,0,len,target,path,res);
        return res ;
    }

    private void dfs(int[] candidates, int begin, int len, int target, Deque<Integer> path, List<List<Integer>> res) {
        if (target < 0){
            return;
        }
        if (target == 0){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < len; i++) {
            path.addLast(candidates[i]);
            dfs(candidates, i, len, target-candidates[i], path, res);
            path.removeLast();//状态重置
        }
    }
}
