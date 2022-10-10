package leetcode;

/**
 * @author fengtianyu
 * @version 1.0
 * @description: TODO
 * @date 2022/10/10 22:45
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 */
public class ThreeSumNum15 {



    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> resultList = new ArrayList<>();

        if (nums == null || nums.length < 3 ){
            return resultList ;
        }
        //从小到大进行排序
        Arrays.sort(nums);
        for ( int i = 0 ;i < nums.length -2 ;i++){
            if (nums[i] > 0){
                return resultList ;
            }
            //进行去重
            if ( i > 0 &&  nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1 ;
            int right = nums.length - 1 ;
            while (left < right){
                int sum = nums[i] + nums[left] + nums [right];
                if (sum == 0 ){
                    List<Integer> list = new ArrayList<>() ;
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    resultList.add(list);
                    while (left < right && nums[left] == nums[left+1]){
                        left ++ ;
                    }

                    while (left < right && nums[right] == nums[right-1]){
                        right -- ;
                    }
                    left ++ ;
                    right -- ;
                }else if(sum > 0){
                    right -- ;
                }else if (sum < 0){
                    left ++ ;
                }
            }
        }
        return resultList ;
    }


    public static void main(String[] args) {
        List<List<Integer>> resultList = new ArrayList<>();
        ThreeSumNum15 threeSumNum15 = new ThreeSumNum15();
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        resultList = threeSumNum15.threeSum(nums);
        System.out.println(resultList);
    }
}
