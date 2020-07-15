package JUC.Design.single; /**
 * Created with IntelliJ IDEA By fty on 2020/7/8
 */

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/7/8 21:40
 * @Version V1.0
 **/
public class aq {

    private static AtomicInteger sum = new AtomicInteger(0);

        public static void  increase() {
            sum.incrementAndGet();
        }
        ConcurrentHashMap<String,String > concurrentHashMap = new ConcurrentHashMap<>();
}
