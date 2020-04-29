package leetcode.字符串.无重复字符的最长字符串3;

import javax.print.DocFlavor;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/25 21:17
 * @Version V1.0
 **/
public class 滑动窗口 {
    public static void main(String[] args) {

    }

    public int lengtyOfLongestSubstring(String s) {
        int len = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        //滑动窗口
        while (i < len && i < len) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(i++);
            }
        }
        return ans;
    }
}