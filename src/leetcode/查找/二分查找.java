package leetcode.查找;

import java.util.Arrays;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/14 18:13
 * @Version V1.0
 **/
public class 二分查找 {
    public static void main(String[] args) {
        int[] arr = {30, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(BinarySearch(arr, 40));

    }

    public static int BinarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (value == arr[mid]) {
                return mid;
            }
            if (value < arr[mid]) {
                low = mid + 1;
            }
            if (value < arr[mid]) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
