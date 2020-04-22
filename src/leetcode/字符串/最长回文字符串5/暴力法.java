package leetcode.字符串.最长回文字符串5;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/22 13:16
 * @Version V1.0
 **/
public class 暴力法 {

    public String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; i++) {
                String res = s.substring(i, j);
                if (isPalindromic(res) && res.length() > max) {
                    ans = s.substring(i, j);
                    max = Math.max(max, ans.length());
                }

            }
        }
        return ans;
    }

    public boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
