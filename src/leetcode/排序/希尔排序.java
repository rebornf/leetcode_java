package leetcode.排序;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/13 16:49
 * @Version V1.0
 **/

/**
 * 希尔排序(Shell's Sort)在插入排序算法的基础上进行了改进，
 * 算法的时间复杂度与前面几种算法相比有较大的改进。其算法的基本思想是：
 * 先将待排记录序列分割成为若干子序列分别进行插入排序，待整个序列中的记录"基本有序"时，再对全体记录进行一次直接插入排序。
 */
public class 希尔排序 {
    // 插入排序
    void ShellSort(int arr[], int length)
    {
        int increasement = length;
        int i, j, k;
        do
        {
            // 确定分组的增量
            increasement = increasement / 3 + 1;
            for (i = 0; i < increasement; i++)
            {
                for (j = i + increasement; j < length; j += increasement)
                {
                    if (arr[j] < arr[j - increasement])
                    {
                        int temp = arr[j];
                        for (k = j - increasement; k >= 0 && temp < arr[k]; k -= increasement)
                        {
                            arr[k + increasement] = arr[k];
                        }
                        arr[k + increasement] = temp;
                    }
                }
            }
        } while (increasement > 1);
    }
}
