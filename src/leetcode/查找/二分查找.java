package leetcode.查找;

import com.sun.org.apache.xerces.internal.xni.XMLResourceIdentifier;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.rmi.dgc.VMID;
import java.util.Arrays;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/14 18:13
 * @Version V1.0
 **/
public class 二分查找 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(BinarySearchright(arr, 2));

    }

    public static int BinarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (value == arr[mid]) {
                return mid;
            }
            else if (value < arr[mid]) {
                low = mid + 1;
            }else if (value > arr[mid]) {
                high = mid - 1;
            }
        }
        return -1;
    }


    public static int BinarySearchleft(int[] arr, int value) {
        if (arr.length == 0){
            return  -1 ;
        }
        int low = 0;
        int high = arr.length ;
        while (low < high) {
            int mid = low  + (high - low) / 2;
            if (value == arr[mid]) {
                high = mid;
            } else if (value < arr[mid]) {
                high = mid ;
            }else if (value > arr[mid]) {
                low = mid + 1 ;
            }
        }
        return low;
    }


    public static int BinarySearchright(int[] arr, int value) {
        if (arr.length == 0){
            return  -1 ;
        }
        int low = 0;
        int high = arr.length ;
        while (low < high) {
            int mid = low  + (high - low) / 2;
            if (value == arr[mid]) {
                low = mid + 1 ;
            } else if (value < arr[mid]) {
                high = mid ;
            }else if (value > arr[mid]) {
                low = mid + 1 ;
            }
        }
        return low-1;
    }



}
