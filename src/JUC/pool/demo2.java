package JUC.pool;
import java.util.concurrent.*;/**
 * Created with IntelliJ IDEA By fty on 2020/6/21
 */

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/21 21:55
 * @Version V1.0
 **/
public class demo2 {
    // Executors 工具类、3大方法
    /**
     *new ThreadPoolExecutor.AbortPolicy() // 银行满了，还有人进来，不处理这个人的，抛出异常
     *new ThreadPoolExecutor.CallerRunsPolicy() // 哪来的去哪里！
     *new ThreadPoolExecutor.DiscardPolicy() //队列满了，丢掉任务，不会抛出异常！
     *new ThreadPoolExecutor.DiscardOldestPolicy() //队列满了，尝试去和最早的竞争，也不会抛出异常！
     */

        public static void main(String[] args) {
// 自 定 义 线 程 池 ！
                    ExecutorService threadPool = new ThreadPoolExecutor(
                    2,
                    5,
                    3,
                    TimeUnit.SECONDS,
                    new LinkedBlockingDeque<>(3), Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.DiscardOldestPolicy());	//队列满了，尝试去和最早的竞争，也不会抛出异常！
            try {
// 最大承载：Deque + max
// 超过 RejectedExecutionException for (int i = 1; i <= 9; i++) {
// 使用了线程池之后，使用线程池来创建线程
                for (int i = 1; i <= 9; i++) {
                threadPool.execute(()->{ System.out.println(Thread.currentThread().getName()+" ok");
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
// 线程池用完，程序结束，关闭线程池
            threadPool.shutdown();
        }
    }
}
