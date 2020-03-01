package leetcode.数组;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author fty
 * @Description 数组中重复数字
 * @Date 2020/3/1 21:44
 * @Version V1.0
 **/
public class RepeatNumber {
    public static void main(String[] args) {

    }
    public int findRepeatNumber (int[] nums ){    /*使用 HashSet 来进行处理，因为 HashSet 本身不允许出现重复元素，
                                                   所以当添加元素失败或已经包含该数字时
                                                   则表示出现了重复元素，将其返回即可。思路较为简单，就不给图了
                                                   */
        Set<Integer> numsset = new HashSet<>();
        for (int num : nums){
            if (! numsset.add(num)){
                return num ;
            }
        }
    return -1 ;
    }//时间复杂度：O(n)，空间复杂度：O(n)




   public int findRepeatNumber2 ( int[] nums) {
        int len = nums.length  ;
        for ( int i= 0 ;i<len;i++){
            while(nums[i]  != i){
                if (nums[i] == nums[nums[i]]){
                    return  nums[i];
                }
                swap(nums,i,nums[i]);
            }
        }
        throw new IllegalArgumentException("数组中不存在重复数字");
   }

   private void swap(int[] nums,int index1 ,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp ;
   }

}


