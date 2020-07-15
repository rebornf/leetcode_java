package leetcode.面试.Ali.GKY; /**
 * Created with IntelliJ IDEA By fty on 2020/7/5
 */

import java.util.concurrent.Semaphore;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/7/5 10:15
 * @Version V1.0
 **/
public class ali2 {

        public static void main(String[] args) throws InterruptedException {
            new Threada(3).start();
            new Threadl(2).start();
            new Threadi(1).start();
        }

        //以a开始的信号量,初始信号量数量为1
        private static Semaphore a = new Semaphore(1);
        //l、i信号量,a完成后开始,初始信号数量为0
        private static Semaphore l= new Semaphore(0);
        private static Semaphore i = new Semaphore(0);


        static class Threada extends Thread {
            private int count;
            public Threada(int count) {
                super();
                this.count = count;
            }
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 2; i++) {
                        a.acquire();// A获取信号执行,A信号量减1,当A为0时将无法继续获得该信号量
                        for (int j = 0; j < count; j++) {
                            System.out.print("a");
                        }

                        l.release();// l释放信号，l信号量加1（初始为0），此时可以获取l信号量
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


        static class Threadl extends Thread {
            private int count;
            public Threadl(int count) {
                super();
                this.count = count;
            }
            @Override
            public void run() {
                try {
                    for (int m = 0; m< 2; m++) {
                        l.acquire();
                        for (int j = 0; j < count; j++) {
                            System.out.print("l");
                        }
                        i.release();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


        static class Threadi extends Thread {
            private int count;
            public Threadi(int count) {
                super();
                this.count = count;
            }
            @Override
            public void run() {
                try {
                    for (int m = 0; m < 2; m++) {
                         i.acquire();
                        for (int j = 0; j < count; j++) {
                            System.out.println("i");
                        }
                        a.release();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

}

