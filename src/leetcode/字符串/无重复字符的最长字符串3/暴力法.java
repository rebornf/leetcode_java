package leetcode.字符串.无重复字符的最长字符串3;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/25 21:24
 * @Version V1.0
 **/
public class 暴力法 {
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; i++) {
                if (Allunique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }

        }
        return ans;
    }

    public boolean Allunique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}
