package leetcode.数组;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author fty
 * @Description 给定一个整数数组和一个整数 k, 你需要在数组里找到不同的 k-diff 数对
 * 这里将 k-diff 数对定义为一个整数对 (i, j), 其中 i 和 j 都是数组中的数字，
 * 且两数之差的绝对值是 k.
 * @Date 2020/5/13 15:23
 * @Version V1.0
 **/
public class Kdiff数组 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 1, 4, 5};
        int k = 1;
        System.out.println(findPairs3(arr, k));
    }


    public static int findPairs2(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < len; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    sum++;
                    break;
                }
            }
        }
        return sum;
    }


    public static int findPairs3(int[] nums, int k) {
        int res = 0;
        if (k < 0) {
            return 0;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        for (int i : hashMap.keySet()) {
            if (k == 0) {
                if (hashMap.get(i) > 1) {
                    res++;
                }
            } else {
                if (hashMap.containsKey(i + k))
                    res++;
            }
        }
        return res;

    }

}
