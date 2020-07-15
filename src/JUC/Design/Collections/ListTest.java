package JUC.Design.Collections; /**
 * Created with IntelliJ IDEA By fty on 2020/6/18
 */

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/18 8:48
 * @Version V1.0
 **/
public class ListTest {
    public static void main(String[] args) {
        List<String> list  =  new ArrayList<>();
        List<String> list1 = new Vector<>();
        List<String> list2 = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }
}
