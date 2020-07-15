package leetcode.面试.Ali.GKY;
/**
 * Created with IntelliJ IDEA By fty on 2020/7/5
 */

/**
 * @Author fty
 * @Description TODO
 * @Version V1.0
 **/
public class TravelNums {
    
    //个人的理解是除去弃权的，剩下的人中，超过一半的人投赞成就算是一种方案
    public static void main(String[] args) {
        int peopleNum = 12;
        int res = 0;
            // 弃权的票数  
        for (int i = 0; i < peopleNum; i++) {
                // 反对的票数
            for (int j = 0; j < (peopleNum - i) / 2; j++) {
                    res += caclC(peopleNum, i) * caclC(peopleNum - i, j);
                }
            }
            System.out.println(res);
        }



    public static int caclC(int a, int b) {
        int fenZi = 1;
        int fenMu = 1;
        for (int i = 0; i < b; i++) {
            fenZi = fenZi * a;
            a--;
        }
        for (; b > 0; b--) {
            fenMu = fenMu * b;
        }
        return fenZi / fenMu;
    }
}
