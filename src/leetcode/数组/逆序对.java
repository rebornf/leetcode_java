package leetcode.数组;


/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/9 16:20
 * @Version V1.0
 **/
public class 逆序对 {
    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] nums = str.split(" ");
//        int[] num = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            num[i] = Integer.parseInt(nums[i]);
//        }
        int[] arr = {4,5,6,9,7,2};
        System.out.println(reversePairs1(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /*
    * @Description: 暴力法
    * @Param:  时间复杂度为O(N^2),这里的N是数组的长度
    * 空间复杂度为 ：O(1)
    * @return:
    * @Author: fty
    * @Date:
    */
    public static int ReversePairs(int[] arr){
        int count =  0;
        int len  = arr.length ;
        for (int i = 0; i<len; i++) {
            for (int j = i+1; j < len ; j++) {
                if (arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }


  /*
  * @Description: 进一步优化，采用归并
  * @Param:
  * @return:
  * @Author: fty
  * @Date:
  */

  public static int reversePairs1(int[] nums){
      int len = nums.length;
      if (len < 2){
          return 0;
      }
      int[] copy =new int[len] ;
      for (int i = 0; i <=len-1; i++) {
          copy[i] = nums[i];
      }
      int[] temp = new int[len];
      return reversePairs1(copy,0,len-1,temp);
  }

    private static int reversePairs1(int[] copy,int left, int right, int[] temp) {
        if (left == right){
            return 0;
        }
        int mid  = left + (right - left)/2;
        int leftPairs = reversePairs1(copy,left,mid,temp);
        int righPairs = reversePairs1(copy, mid+1, right, temp);
        if (copy[mid] <= copy[mid+1]){
            return leftPairs + righPairs ;
        }
        int crossPairs = mergeAndCount1(copy,left,mid,right,temp);
        return leftPairs + righPairs + crossPairs ;
  }

    private static int mergeAndCount1(int[] nums, int left, int mid, int right, int[] temp) {
        for (int i = left; i <=right ; i++) {
            temp[i] = nums[i] ;
        }
        int m = left ;
        int n = mid+1;
        int count = 0;
        for (int k = 0; k <=right; k++) {
            if (m == mid +1){  //超出界限，只能将右侧的n归并回去
                nums[k] = temp[n];
                n++;
            }else if(n == right +1){
                nums[k] = temp[m];
                m++;
            }else if (temp[m] <= temp[n]){
                nums[k] =temp[m];
                m++;
            }else {
                nums[k] = temp[n] ;
                n++;
                count +=(mid-m+1);
            }
        }
        return count ;
    }


}


