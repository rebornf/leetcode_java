package leetcode.排序;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/13 16:49
 * @Version V1.0
 **/

/**
 * 快速排序的基本思想是：通过一趟排序将待排记录分割成独立的两部分，
 * 其中一部分记录的关键字均比另一部分记录的关键字小，则可分别对这两部分记录继续进行排序，
 * 已达到整个序列有序。一趟快速排序的具体过程可描述为：从待排序列中任意选取一个记录(通常选取第一个记录)作为基准值，
 * 然后将记录中关键字比它小的记录都安置在它的位置之前，将记录中关键字比它大的记录都安置在它的位置之后。
 * 这样，以该基准值为分界线，将待排序列分成的两个子序列。
 *
 * 一趟快速排序的具体做法为：设置两个指针low和high分别指向待排序列的开始和结尾，
 * 记录下基准值baseval(待排序列的第一个记录)，然后先从high所指的位置向前搜索直到找到一个小于baseval的记录并互相交换，
 * 接着从low所指向的位置向后搜索直到找到一个大于baseval的记录并互相交换，重复这两个步骤直到low=high为止。
 * ————————————————
 */

 /*
 * @Description: 快速排序是不稳定吗，怎么设计与一个稳定的快排
 *
 * @Param:
 * @return:
 * @Author: fty
 * @Date:
 */
public class 快速排序 {
    public static void main(String[] args) {

    }


    /**
     * 快速排序方法
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int[] QuickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            QuickSort(array, start, smallIndex - 1);
        if (smallIndex < end)
            QuickSort(array, smallIndex + 1, end);
        return array;
    }
    /**
     * 快速排序算法——partition
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++)
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex)
                    swap(array, i, smallIndex);
            }
        return smallIndex;
    }

    /**
     * 交换数组内两个元素
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }



}
