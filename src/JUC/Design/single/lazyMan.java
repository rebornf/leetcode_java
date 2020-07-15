package JUC.Design.single; /**
 * Created with IntelliJ IDEA By fty on 2020/6/17
 */

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/17 14:34
 * @Version V1.0
 **/
public class lazyMan {

    private lazyMan() {

    }

    private static lazyMan lazyMan;

    public static lazyMan getInstance() {
        if (lazyMan == null) {
            synchronized (lazyMan.class) {
                if (lazyMan == null) {
                    lazyMan = new lazyMan();
                }
            }
        }
        return lazyMan;

    }
}
