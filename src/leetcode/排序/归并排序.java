//package leetcode.排序;
//
//
//import com.sun.org.apache.xerces.internal.xs.ItemPSVI;
//
//import java.util.Arrays;
//import java.util.Calendar;
//import java.util.List;
//
///**
// * @Author fty
// * @Description TODO
// * @Date 2020/4/9 17:25
// * @Version V1.0
// **/
//
//public class 归并排序 {
//        public static void main(String[] args) {
//
//            int[] data = {1,2,3,4,5};
//
//            List list = Arrays.asList(data);
//
//            System.out.println("列表中的元素数量是：" + list.size());
//
//        }
//    }//
//    // 归并排序
//    public static void mergeSort(int[]  arr){
//        if ( arr == null  || arr.length <=1){
//            return;
//        }
//        mergeSort(arr,0,arr.length-1);
//
//    }
//
//    public static  void mergeSort( int[] arr, int low, int high){
//        if ( low < high) {
//            int mid = low + ((high - low) >> 1);//右移一位，相当于除以2，但右移的运算速度更快
//            mergeSort(arr, low, mid);// 若使用(low+high)/2求中间位置容易溢出
//            mergeSort(arr, mid + 1, high);
//        }
//
//    }
//
//    public static void merge(int[] arr,int low,int mid,int high){
//        int[] tmp =new int[arr.length];
//        int i = low ;
//        int j = mid + 1;
//        int k = 0;
//
//        while (i <= mid  ||  j <= high) {
//            if (arr[i] < arr [j]){
//                tmp[k++] = arr [i++];
//            }else {
//                tmp[k++] = arr[j++];
//            }
//        }
//        while (i<=mid) {
//            tmp[k++] = arr[i++];
//        }
//        while (j<arr.length){
//            tmp[k++] = arr[j++];
//        }
//        for (int m= 0; m<tmp.length ; m++) {
//            arr[m] = tmp[m];
//        }
//    }
//}
//
//
//
//
