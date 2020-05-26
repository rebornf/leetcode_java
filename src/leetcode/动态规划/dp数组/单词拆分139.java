package leetcode.动态规划.dp数组;

import java.awt.datatransfer.StringSelection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/11 21:11
 * @Version V1.0
 **/
public class 单词拆分139 {

    public static void main(String[] args) {

    }


    //方法1暴力法
    public boolean wordbreak1(String s, List<String> wordDict) {
        return word_break(s, (List<String>) new HashSet(wordDict), 0);
    }

    public boolean word_break(String s, List<String> wordDict, int start) {
        if (start == s.length()) {
            return true;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && word_break(s, wordDict, end)) {
                return true;
            }
        }
        return false;
    }


    //方法2用wordDict 去生成 所有可能的字符串，期间如果出现了目标字符串s，就返回true
    //优化3 如果s中有的字母在生成中的没有


    public boolean wordBreak2(String s, List<String> wordDict) {
        HashSet<Character> set = new HashSet<>();
        //将wordDict的 每个字母放入到set中
        for (int i = 0; i < wordDict.size(); i++) {
            String t = wordDict.get(i);
            for (int j = 0; j < t.length(); j++) {
                set.add(t.charAt(j));
            }
        }
        //判断s 的每个字母是否在set中存在
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                return false;
            }
        }
        return wordBreakHelper(s, wordDict, "", new HashMap<String, Boolean>());

    }

    public boolean wordBreakHelper(String s, List<String> wordDict, String tmp, HashMap<String, Boolean> hashMap) {
        //如果此时生成的字符串长度够了，则进行比较 字符串是否相等
        /*
        if (tmp.length() == s .length()){
            if (tmp.equals(s)){
                return true;
            }else {
                return false ;
            }
        }
        */
        //如果长度超了，返回false
        if (tmp.length() > s.length()) {
            return false;
        }
        if (hashMap.containsKey(tmp)) {
            return hashMap.get(tmp);
        }
        //进行优化 第i个字符都不相等 则返回false
        for (int i = 0; i < tmp.length(); i++) {
            if (s.charAt(i) != tmp.charAt(i)) {
                return false;
            }
        }
        for (int i = 0; i < wordDict.size(); i++) {
            if (wordBreakHelper(s, wordDict, tmp + wordDict.get(i), hashMap)) {
                //结果放入hashmap
                hashMap.put(tmp, true);
                return true;
            }
        }
        return false;
    }


    //方法3  使用动态规划

    public boolean wordBreak3(String s, List<String> worddict) {
        HashSet<String> set = new HashSet<>(worddict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && worddict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }


}
