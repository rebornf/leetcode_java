package leetcode.排序;


import java.util.Arrays;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/9 17:25
 * @Version V1.0
 **/

public class 归并排序 {
        public static void main(String[] args) {

            int[] arr1 = {4,2,6,3,5};
            System.out.println(Arrays.toString(arr1));
            mergeSort1(arr1,0,arr1.length-1);
            System.out.println(Arrays.toString(arr1));

        }

     //归并排序
    public static int[] mergeSort1(int[]  arr1){
        if ( arr1 == null  || arr1.length <=1){
            return arr1;
        }
        mergeSort1(arr1,0,arr1.length-1);

        return arr1;
    }

    public static  void mergeSort1( int[] arr, int low, int high){
        if ( low < high) {
            int mid = low + ((high - low)/2);//右移一位，相当于除以2，但右移的运算速度更快
            mergeSort1(arr, low, mid);// 若使用(low+high)/2求中间位置容易发生整形溢出
            mergeSort1(arr, mid + 1, high);
            merge1(arr,low,mid,high);
        }

    }

    public static void merge1(int[] array,int left,int mid,int right){
        int[] tmp = new int[array.length];
        for (int i = left; i <=right ; i++) {
            tmp[i] = array[i];
        }
        int i = left ;
        int j = mid + 1 ;
        for (int k = 0; k <=right; k++) {
            if (i ==mid+1){
                array[k] = tmp[j];
                j++ ;
            }else if (j ==right+1){
                array[k] = tmp[i] ;
                i++;
            }else if (tmp[i] <= tmp[j]){  //辅助数组上的首元素进行比较 注意这里是<= ,如果写的是小于的话,归并排序就不是稳定的排序
                array[k] = tmp[i] ;
                i++;
            }else {
                array[k] = tmp[j];
                j++ ;
            }
        }

    }





//    public static int[] mergeSort(int[] array){
//            int len = array.length ;
//            if (array == null || len < 2 ){
//                return  null ;
//            }
//            return mergeSort(array,0,len-1);
//    }
//
//    private static int[] mergeSort(int[] array, int left, int right) {
//        int mid = left + (right - left) / 2;
//        if (left < right) {
//           //如果使用 mid = (left + right)/2这种的话，
//            mergeSort(array, left, mid);
//            mergeSort(array, mid + 1, right);
//        }
//        return  merge(array,left, mid,right);
//    }

    private static int[] merge(int[] array, int left, int mid, int right) {
        int[] tmp = new int[array.length];
        for (int i = left; i <=right ; i++) {
            tmp[i] = array[i];
        }
        int i = left ;
        int j = mid + 1 ;
        for (int k = 0; k <=right; k++) {
            if (i ==mid+1){
                array[k] = tmp[j];
                j++ ;
            }else if (j ==right+1){
                array[k] = tmp[i] ;
                i++;
            }else if (tmp[i] <= tmp[j]){  //辅助数组上的首元素进行比较 注意这里是<= ,如果写的是小于的话,归并排序就不是稳定的排序
                array[k] = tmp[i] ;
                i++;
             }else {
                 array[k] = tmp[j];
                 j++ ;
             }
        }
        return array ;
    }



    /**
     * 归并排序
     *
     * @param array
     * @return
     */
    public static int[] MergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(MergeSort(left), MergeSort(right));
    }
    /**
     * 归并排序——将两段排序好的数组结合成一个排序数组
     *
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }









}




