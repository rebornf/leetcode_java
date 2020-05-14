package leetcode.面试.字节;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/11 17:38
 * @Version V1.0
 **/

/**
 * @Author fty
 * @Description 一个字符串s 和  一本字典，求出可以有多少种翻译的方法
 * 输入描述：第一行表示文章 ，文章的长度不超过50000；
 * 第二行包含一个正整数N    2<=N<=50000,表示字典单词的数量
 * 接下来N行，每行表示一个单词（单词长度不超过20)
 * <p>
 * 输出描述
 * 一个正整数
 * <p>
 * <p>
 * 输入
 * abcba
 * 5
 * ab
 * cb
 * bc
 * ba
 * a
 * <p>
 * <p>
 * 输出2
 * @Date 2020/5/11 11:24
 * @Version V1.0
 **/


public class 单词拆分次数 {
    static Set<String> dic = new HashSet<>();
    static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = Integer.parseInt(sc.nextLine());
        while (num-- > 0) {
            dic.add(sc.nextLine());
        }
        findNextWord(str);
        System.out.println(res);
    }

    public static void findNextWord(String str) {
        for (String word : dic) {
            int index = str.indexOf(word);
            if (index == -1 && str.equals("")) {
                res++;
                break;
            } else if (index == 0) {
                String tmpStr = str.substring(word.length());
                findNextWord(tmpStr);
            }
        }
    }


    public static void findNextWord2(String str) {
        if (str.equals(""))
            res++;
        for (String word : dic) {
            int index = str.indexOf(word);
            if (index == 0) {
                String tmpStr = str.substring(word.length());
                findNextWord2(tmpStr);
            }
        }
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}








