package Test; /**
 * Created with IntelliJ IDEA By fty on 2020/6/14
 */

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/6/14 17:09
 * @Version V1.0
 **/
public class CharArray {
    public static void main(String[] args) {
        String s = new String("我是中国人");
        char[] c = s.toCharArray();
        System.out.println("数组的长度为"+c.length);
        System.out.println(c);
        String s1  = new String(c,0,2);
        System.out.println(s1);
    }
}
