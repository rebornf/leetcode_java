package leetcode.排序;



/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/9 17:25
 * @Version V1.0
 **/
/*
public class 归并排序 {
    public static void main(String[] args) {

    }
    // 归并排序
    void MergeSort(int arr[], int start, int end, int temp)
    {
        if (start >= end)
            return;
        int mid = (start + end) / 2;
        MergeSort(arr, start, mid, temp);
        MergeSort(arr, mid + 1, end, temp);

        // 合并两个有序序列
        int length = 0; // 表示辅助空间有多少个元素
        int i_start = start;
        int i_end = mid;
        int j_start = mid + 1;
        int j_end = end;
        while (i_start <= i_end && j_start <= j_end)
        {
            if (arr[i_start] < arr[j_start])
            {
                temp[length] = arr[i_start];
                length++;
                i_start++;
            }
            else
            {
                temp[length] = arr[j_start];
                length++;
                j_start++;
            }
        }
        while (i_start <= i_end)
        {
            temp[length] = arr[i_start];
            i_start++;
            length++;
        }
        while (j_start <= j_end)
        {
            temp[length] = arr[j_start];
            length++;
            j_start++;
        }
        // 把辅助空间的数据放到原空间
        for (int i = 0; i < length; i++)
        {
            arr[start + i] = temp[i];
        }
    }
}
*/