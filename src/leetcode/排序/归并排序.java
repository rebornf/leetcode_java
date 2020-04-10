package leetcode.排序;



/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/9 17:25
 * @Version V1.0
 **/
public class 归并排序 {
    public static void main(String[] args) {

    }

    public static void mergesort(int []arr ,int left,int right,int []tmp){
        if (left<right){
            int mid =(left+right)/2;
            mergesort(arr, left, right, tmp);//

        }

    }

    public static void merge (int[] arr ,int left,int mid,int right,int[] tmp){
        int i= left;//左序列指针
        int j=mid+ 1;//右序列指针
        int k=0;//临时数组指针；
        while (i<=mid && j<=right){
            if (arr[i] < arr[j]){
                tmp[k++] =arr[i++];
            }else {
                tmp[k++] =arr[j++];
            }
        }
        while(i<=mid){//将左边的元素填充进tmp中

        }
    }
}
