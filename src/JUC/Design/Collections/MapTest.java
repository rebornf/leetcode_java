package JUC.Design.Collections; /**
 * Created with IntelliJ IDEA By fty on 2020/6/18
 */

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/18 11:12
 * @Version V1.0
 **/
public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new ConcurrentHashMap<>();

        for (int i = 0; i <=30; i++) {
            new Thread(()->{
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,5));
                System.out.println(map);
            },String.valueOf(i)).start();
        }
    }
}
