package leetcode.回溯算法;

import java.text.DecimalFormat;
import java.util.*;

/**
 * @author fty
 * @date 2020/11/20 16:57
 */
public class 组合总数2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] str = s.split(" ");
            int[] nums =new int[str.length];
            for (int i = 0; i < str.length; i++) {
                nums[i] = Integer.parseInt(str[i]);
            }
            int target = sc.nextInt();
            组合总数2 zh = new 组合总数2();
            System.out.println(zh.combinationSum2(nums,target));
        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates,int target){
        int len = candidates.length ;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0){
            return  res;
        }
        Arrays.sort(candidates);
        Deque<Integer> path = new ArrayDeque<>(len);
        dfs(candidates,len,0,target,res,path);
        return res ;
    }

    private void dfs(int[] candidates, int len, int begin, int target, List<List<Integer>> res, Deque<Integer> path) {
        if (target == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < len; i++) {
            //大剪枝，减去candidates[i] 小于0，减去后面的candinates[i+1],candinates[i+2]
            if(target - candidates[i] < 0){
                break;
            }
            //小剪指
            if ( i> begin && candidates[i] == candidates[i-1]){
                continue;
            }
            path.addLast(candidates[i]);
            dfs(candidates, len, i+1, target-candidates[i], res, path);
            path.removeLast();
        }
    }
}
