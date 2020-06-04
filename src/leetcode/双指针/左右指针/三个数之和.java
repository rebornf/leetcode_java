package leetcode.双指针.左右指针; /**
 * Created with IntelliJ IDEA By fty on 2020/6/1
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/1 16:02
 * @Version V1.0
 **/
public class 三个数之和 {
    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> b = new ArrayList<List<Integer>>();
        b = threeSum(a);
        for (int i = 0; i < b.size(); i++)
            System.out.println(b.get(i));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) break;
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int left = k + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[k] + nums[left] + nums[right];
                if (sum < 0) {
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                } else if (sum > 0) {
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                } else {
                    res.add(new ArrayList<>(Arrays.asList(nums[k], nums[left], nums[right])));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
