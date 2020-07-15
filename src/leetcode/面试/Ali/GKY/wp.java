package leetcode.面试.Ali.GKY; /**
 * Created with IntelliJ IDEA By fty on 2020/7/5
 */

/**
 * @Author fty
 * @Description TODO
 * @Version V1.0
 **/
public class wp {
    public static void main(String[] args) {

        String pattern = "baaa";
        String str = "北京 杭州 杭州 杭州";
        boolean flag =wp(pattern,str);
        System.out.println(flag);
    }

    public static boolean wp(String pattern ,String str ){
        //空值校验省略
        String a = null;
        String b = null;
        String[] strArr = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String param : strArr) {
            if(a == null) {
                a = param;
                sb = sb.append("a");
            }else if(a.equals(param)){
                sb = sb.append("a");
            }else if(b == null) {
                b = param;
                sb = sb.append("b");
            } else if(b.equals(param)) {
                sb = sb.append("b");
            }
        }
        return pattern.equals(sb.toString());
    }

}




