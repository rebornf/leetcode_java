package leetcode.面试.Ali.GKY; /**
 * Created with IntelliJ IDEA By fty on 2020/7/5
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/7/5 11:29
 * @Version V1.0
 **/
public class wp2 {
    public static void main(String[] args) {

            String pattern = "aaaa";
            String str = "小明 小红 小红 小红";
            boolean flag =wp2(pattern,str);
            System.out.println(flag);
        }
    public static boolean wp2(String pattern, String str) {
        Map<Character, String> map = new HashMap<Character, String>();
        Set<String> set = new HashSet<String>();
        String[] pieces = str.split(" ");
        if(pieces.length != pattern.length()) return false;
        int i = 0;
        for(String s : pieces){
            char p = pattern.charAt(i);
            //System.out.println(p);
            // 如果该字符产生过映射
            if(map.containsKey(p)){
                // 且映射的字符串和当前字符串不一样
                if(!s.equals(map.get(p))) return false;
            } else {
                // 如果该字符没有产生过映射
                // 如果当前字符串已经被映射过了
                if(set.contains(s)) {
                    return false;
                }
                // 否则新加一组映射
                map.put(p, s);
                set.add(s);
            }
            i++;
        }
        return true;
    }
}
