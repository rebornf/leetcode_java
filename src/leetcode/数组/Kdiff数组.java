package leetcode.数组;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/13 15:23
 * @Version V1.0
 **/
public class Kdiff数组 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int k = 1;
        System.out.println(findPair2(arr, k));
    }

    public static int findPair2(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    sum++;
                    break;
                }

            }
        }
        return sum;
    }

    public int findPairs3(int[] nums, int k) {
        int sum = 0;
        if (k < 0) {
            return sum;
        }
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashmap.put(nums[i], hashmap.getOrDefault(nums[i], 0) + 1);
        }

        for (int i : hashmap.keySet()) {
            if (k == 0) {
                if (hashmap.get(i) > 1) sum++;
            } else {
                if (hashmap.containsKey(i + k)) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
