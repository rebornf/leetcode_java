package leetcode.面试.Ali.GKY; /**
 * Created with IntelliJ IDEA By fty on 2020/7/5
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/7/5 9:07
 * @Version V1.0
 **/
public class alilock {

    public static void main(String[] args) {
            final Printali printali= new Printali();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    printali.printa();
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    printali.printl();
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    printali.printi();
                }
            }).start();


        }
    }

    class Printali{
        private final ReentrantLock lock = new ReentrantLock();
        private Condition printa =lock.newCondition();
        private Condition printl =lock.newCondition();
        private Condition printi =lock.newCondition();

        private int flag = 0;

        public  void printa() {
            try {
                lock.lock();
                for (int i = 0; i < 10; i++) {
                    while (flag % 3 != 0) {
                        printa.await();
                    }
                    System.out.print("a");
                    flag++;
                    printl.signal();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }

        public void printl() {
            try {
                lock.lock();
                for (int i = 0; i < 10; i++) {
                    while (flag % 3 != 1) {
                        printl.await();
                    }
                    System.out.print("l");
                    flag++;
                    printi.signal();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }


        public void printi() {
            try {
                lock.lock();
                for (int i = 0; i < 10; i++) {
                    while (flag % 3 != 2) {
                        printi.await();
                    }
                    System.out.print("i");
                    flag++;
                    printa.signal();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }



}

