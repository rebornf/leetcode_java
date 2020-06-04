//package leetcode.√Ê ‘.pd; /**
// * Created with IntelliJ IDEA By fty on 2020/6/2
// */
//
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.Scanner;
//
///**
// * @Author fty
// * @Description TODO
// * @Date 2020/6/2 20:20
// * @Version V1.0
// **/
//public class Õ≈Ω® {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int nP = sc.nextInt();
//            int M = sc.nextInt();
//            int[] coins = new int[nP];
//            Queue<Integer> q = new PriorityQueue<>();
//            for (int i = 0; i < nP; i++) {
//                coins[i] = sc.nextInt();
//                q.add(coins[i]);
//            }
//            for (int i = 0; i < M; i++) {
//                int max = (Integer) q.toArray()[q.size()-1];
//                int min = q.peek();
//                if (max - min > 1) {
//                    q.remove(max);
//                    q.remove(min);
//                    q.add(min + 1);
//                    q.add(max - 1);
//                } else
////                    break;
//            }
//            int res = (Integer) q.toArray()[q.size()-1] - q.peek();
//            System.out.println(res);
//        }
//    }
//}
