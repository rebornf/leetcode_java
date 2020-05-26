package leetcode.字符串;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/19 17:46
 * @Version V1.0
 **/
public class 替换空格ms05 {
    public static void main(String[] args) {

    }

    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == ' ') {
                res.append("%20");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
