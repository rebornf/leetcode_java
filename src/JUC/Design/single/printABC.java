package JUC.Design.single;

/**
 * @author fengtianyu
 * @version 1.0
 * @description: TODO
 * @date 2022/8/19 0:24
 */

/**
 * A线程打印A
 *  B线程打印B
 * C线程打印C
 *
 * ABC三个线程交替打印100个字符
 */
public class printABC {


    private static Integer status = 0 ;

    private static Object lock = new Object() ;


    private static Integer count = 0 ;


    public static void main(String[] args) {
        Thread t1  = new Thread(() -> {
            while (true){
                synchronized (lock){
                    if (count + 1 <= 100 && status == 0){
                        System.out.println("A");
                        lock.notifyAll();
                        count++ ;
                        status = 1 ;
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread t2  = new Thread(() -> {
            while (true){
                synchronized (lock){
                    if (count + 1 <= 100 && status == 1){
                        System.out.println("B");
                        lock.notifyAll();
                        count++ ;
                        status = 2 ;
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });


        Thread t3  = new Thread(() -> {
            while (true){
                synchronized (lock){
                    if (count + 1 <= 100 && status == 2){
                        System.out.println("C");
                        lock.notifyAll();
                        count++ ;
                        status = 0 ;
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
