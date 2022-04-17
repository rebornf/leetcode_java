package leetcode.数组;

import java.util.Arrays;

/**
 * @author fengtianyu
 * @version 1.0
 * @description: TODO
 * @date 2022/4/17 20:49
 */
public class ArrayNumsFindIndex {


    private int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        //查找失败
        if (nums[r] != target) {
            return new int[]{-1, -1};
        }
        //第一个位置
        int L = r;

        int m = 0;
        int n = nums.length - 1;
        while (m < n) {
            int mid = (m + n + 1) / 2;
            if (nums[mid] <= target) {
                m = mid;
            } else {
                n = mid - 1;
            }
        }
        return new int[]{L,n};
    }

    public static void main(String[] args) {
      int[] testNums =   new int[]{5,7,7,8,10};
      ArrayNumsFindIndex  arrayNumsFindIndex = new ArrayNumsFindIndex() ;
      int[] resultNum = arrayNumsFindIndex.searchRange(testNums,8);
        System.out.println(Arrays.toString(resultNum));
    }
}
