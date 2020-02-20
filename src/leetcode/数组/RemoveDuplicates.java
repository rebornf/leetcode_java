package leetcode.数组;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/2/20 21:13
 * @Version V1.0
 **/
public class RemoveDuplicates {
    public static void main(String[] args) {

    }
    public int removeDuplicate(int[] nums){
        if (nums.length == 0) return 0 ;
        int  i= 0 ;
        for (int j=1 ;j<nums.length;j++){
         if (nums[j] != nums[i]){
             i++;
             nums[i]= nums[j];
         }
        }
    return i+1;
    }
}
