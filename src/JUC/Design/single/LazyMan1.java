package JUC.Design.single; /**
 * Created with IntelliJ IDEA By fty on 2020/6/28
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/28 19:32
 * @Version V1.0
 **/
public class LazyMan1 {

    private static boolean fty= false;
    private volatile static AtomicInteger num = new AtomicInteger();

    private LazyMan1(){
        synchronized (LazyMan1.class){
            if (fty == false){
                fty = true ;
            }else {
                throw  new RuntimeException("不要试图使用反射破坏异常");
            }

        }

        System.out.println(Thread.currentThread().getName()   +  "ok");
    }
    private static LazyMan1 lazyMan1 ;

    //双重检测锁模式的
    public static LazyMan1 getInstance(){
        if (lazyMan1 == null) {
            synchronized (LazyMan1.class){
                if (lazyMan1 == null){
                    lazyMan1 = new LazyMan1();//不是一个原子性操作
                    
                    /*
                    * @Description: 1 分配内存空间
                    * 2 执行构造方法
                    * 3 把这个对象指向这个空间
                    * 期望执行的顺序 123 实际执行的顺序是132
                    */
                }
            }
        }
        return  lazyMan1 ;
    }
    public static void add(){
        num.getAndIncrement();
    }


    public static void main(String[] args) throws Exception {



        //LazyMan1 instance = LazyMan1.getInstance();

        Field fty = LazyMan1.class.getDeclaredField("fty");
        fty.setAccessible(true);

        Constructor<LazyMan1> declaredConstructor = LazyMan1.class.getDeclaredConstructor(null) ;
        declaredConstructor.setAccessible(true);
        LazyMan1 instance = (LazyMan1) declaredConstructor.newInstance();
        LazyMan1 instance2 = (LazyMan1) declaredConstructor.newInstance();

        fty.set(instance,false);

        System.out.println(instance);
        System.out.println(instance2);
    }
}
