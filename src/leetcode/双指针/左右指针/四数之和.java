//package leetcode.˫ָ��.����ָ��; /**
// * Created with IntelliJ IDEA By fty on 2020/6/2
// */
//
//import com.sun.org.apache.bcel.internal.generic.AALOAD;
//import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
//import sun.print.DialogOnTop;
//
//import java.nio.file.LinkOption;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.regex.Pattern;
//
///**
// * @Author fty
// * @Description TODO
// * @Date 2020/6/2 16:34
// * @Version V1.0
// **/
//public class ����֮�� {
//    public static void main(String[] args) {
//
//    }
//
//    public List<List<Integer>> fourSum(int[] nums ,int target){
//        List<List<Integer>> res = new ArrayList<>();
//
//        if (nums == null || nums.length < 4){
//            return res;
//        }
//
//        Arrays.sort(nums);
//        int len = nums.length;
//        for (int k = 0; k <len -3 ; k++) {
//            if ( k>0 && nums[k] == nums[k-1]){
//                continue;
//            }
//            //��ȡ��ǰ����Сֵ,��ô�����Խ��Խ�󣬸���ûϷ
//            int mincur = nums[k] + nums[k+1] + nums[k+2] + nums[k+3] ;
//            if (mincur > target){
//                break;
//            }
//            //��ȡ��ǰ�����ֵ,��ô�������
//            int maxcurr= nums[k] + nums[len-1] +nums[len-2] +nums[len-3];
//            if (maxcurr  < target){
//               continue;
//            }
//            //�ڶ���ѭ��i��ָ��k+1;
//            for (int i = k+1; i < len-2 ; i++) {
//
//            }
//    }
//}
