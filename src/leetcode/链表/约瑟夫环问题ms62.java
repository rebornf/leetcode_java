package leetcode.链表;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/19 14:09
 * @Version V1.0
 **/
public class 约瑟夫环问题ms62 {
    public static void main(String[] args) {

    }

    //比较直观的方法，但会超时时间复杂度O(mn)
    public int lastRamaining(int n, int m) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        while (list.size() != 1) {
            for (int i = 0; i < m; i++) {
                Integer pre = list.pollFirst();
                if (i != m - 1) {
                    list.add(pre);
                }
            }
        }
        return list.pollFirst();
    }

    //约瑟夫环数学解决方法

    public int lastRamianing2(int n, int m) {
        int last = 0;
        for (int i = 2; i <= n; i++) {
            last = (last + m) % i;
        }
        return last;
    }

    //递归的方法
    public int lastRemaining3(int n, int m) {
        if (n == 1 || m < 1) {
            return -1;
        }
        if (n == 1) {
            return 0;
        }
        return (lastRemaining3(n - 1, m) + m) % n;
    }

}
