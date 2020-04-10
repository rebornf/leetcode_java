package leetcode.面试;

import java.util.*;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/8 17:37
 * @Version V1.0
 *  阿里 4.8
 * 小强开始了他的功夫特训，特训时间为n秒，有m个木头人，每个木头血量为a
 * 小强的攻击范围为b，他 每次攻击能最多对b个存活的得木头人造成1点伤害
 * 每次攻击需要1秒，当经过一次攻击后木头人的血量为0，木头人死亡
 * 问特训结束时，小强最多能消灭几个木头人
 *
 *
 *
 **/
public class 小强s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0){
            int n = sc.nextInt(); //总时间n秒
            int m = sc.nextInt(); //m个木头人
            int a = sc.nextInt(); //每个木头人血量a
            int b = sc.nextInt(); //攻击范围

            Queue<Integer> queue = new PriorityQueue<>();
            for (int i = 0; i < m; i++) {
                queue.add(a);
            }

            for (int j = 0; j < n; j++) {
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < b; i++) {
                    if (queue.size() > 0){
                        int tmp = queue.poll() - 1;
                        if (tmp != 0)
                            list.add(tmp);
                    }else {
                        break;
                    }

                }
                for (Integer in :list){
                    queue.add(in);
                }
            }
            int res = m - queue.size();
            System.out.println(res);
        }
    }
}

