package leetcode.面试.美团; /**
 * Created with IntelliJ IDEA By fty on 2020/9/6
 */

import com.sun.scenario.animation.shared.ClipEnvelope;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.ClientInfoStatus;
import java.util.*;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/9/6 11:34
 * @Version V1.0
 **/
public class 郊游 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        jiaoyou(list);
    }




    private static void jiaoyou(List<Integer> list){
        int n = list.size();
        LinkedList<Integer> res = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (res.contains(list.get(i))){
                res.remove(list.get(i));
                res.addFirst(list.get(i));
            }else {
                res.addFirst(list.get(i));
            }
        }
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}