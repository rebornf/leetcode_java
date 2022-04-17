package leetcode.字符串.括号问题;



import java.util.ArrayList;
import java.util.List;

/**
 * @author fengtianyu
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 20:42
 */
public class generateParentthesis {


    public static void main(String[] args) {

    }


    public List<String> generatePanrent(int n){
      List<String> res = new ArrayList<>();
      generate(res,"",0,0,n);
      return res ;
    }
    /**
     * count1统计个数
     * @param res
     * @param ans
     * @param count1
     * @param count2
     * @param n
     */
    public void generate(List<String> res ,String ans ,int count1 ,
                         int count2 ,int n){


        if (count1 > n || count2 > n){
            return;
        }
        if (count1 == n && count2 == n ){
            res.add(ans);
        }

        if (count1 >= count2){
            String ans1 = new String(ans);
            generate(res,ans+"(",count1 +1 ,count2,n);
            generate(res,ans+")",count1 ,count2 +1 ,n);

        }
    }
}
