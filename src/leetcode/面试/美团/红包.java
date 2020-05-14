package leetcode.面试.美团;


import java.util.*;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/13 10:51
 * @Version V1.0
 **/
public class 红包 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{3, 1, 5, 8};
        System.out.println(com(arr));
    }

    public static int com(int[] nums) {
        int n = nums.length;
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(i);
        }
        while (!list.isEmpty()) {
            int i = Collections.min(list);
            int z = i - 1;
            int c = i;
            int v = i + 1;
            if (v == list.size()) {
                list.set(-1, 1);
                list.set(n, 1);
            }
            int x = list.get(z) * list.get(c) * list.get(v);
            list.remove(i);
            max = max + x;
        }
        return max;
    }
}


