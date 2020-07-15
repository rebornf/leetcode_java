package JUC.Design.Lock; /**
 * Created with IntelliJ IDEA By fty on 2020/6/17
 */

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/17 19:15
 * @Version V1.0
 **/
public class Demo01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        new Thread(() -> {
            phone.sms();
        }, "A").start();

        new Thread(() -> {
            phone.sms();
        }, "B").start();
    }
}

    class Phone{
        public synchronized void  sms(){
            System.out.println(Thread.currentThread().getName()+"sms");
            call();
        }

        public synchronized void call(){
            System.out.println(Thread.currentThread().getName()+"call");
        }
    }

//Asms
//Acall
//Bsms
//Bcall