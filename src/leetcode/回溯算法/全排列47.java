package leetcode.回溯算法;

import java.util.*;

/**
 * @author fty
 * @date 2020/11/20 15:10
 */
public class 全排列47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] str =s.split(" ");
            int[] nums = new int[str.length];
            for (int i = 0; i <str.length; i++) {
                nums[i] =Integer.parseInt(str[i]);
            }
            全排列47 pl = new 全排列47();
            System.out.println(pl.permuteUnique(nums));
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums){
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0){
            return  res ;
        }
        Arrays.sort(nums);
        boolean[] used = new boolean[len] ;
        Deque<Integer> path = new ArrayDeque<>(len);
        dfs(nums,len,0,used,path,res);
        return  res ;
    }

    private void dfs(int[] nums, int len, int depth, boolean[] used, Deque<Integer> path, List<List<Integer>> res) {
        if (depth == len){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]){
                continue;
            }
            if (i>0 && nums[i] == nums[i-1] && !used[i - 1]){
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true ;
            dfs(nums, len, depth+1, used, path, res);
            used[i] = false ;//回溯部分代码,和之前的dfs的代码是对称的
            path.removeLast();
        }
    }


}
