package leetcode.面试.快手;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/25 22:03
 * @Version V1.0
 * <p>
 * 小明最近在做病毒自动检测，他发现，在某些library 的代码段的二进制表示中，如果包含子串并且恰好有k个1，
 * 就有可能有潜在的病毒。library的二进制表示可能很大，并且子串可能很多，人工分析不可能，
 * 于是他想写个程序来先算算到底有多少个子串满足条件。如果子串内容相同，但是开始或者结束位置不一样，则被认为是不同的子串。
 * 注：子串一定是连续的。例如"010"有6个子串，分别是 "0, "1", "0", "01", "10", "010"
 * <p>
 * 第一行是一个整数k，表示子串中有k个1就有可能是病毒。其中 0 <= k <= 1 000 000
 * <p>
 * 第二行是一个字符串，就是library的代码部分的二进制表示。字符串长度 <= 1 000 000。并且字符串中只包含"0"或"1".
 * <p>
 * 输入
 * 1
 * 1010
 * 输出
 * 6
 **/

/**
 * 采用滑动窗口
 *
 * 这是一个子串满足问题，输入一个由0，1字符组成的字符串str，求满足包含k个1的连续字串个数。
 * 毫不夸张的说，可能大部分人第一眼就是求出所有子串，再计数所有满足k的子串，但仔细一想，问题没有那么简单！
 *
 * 思路就是，采用滑动窗口的方式，从字符串数组左侧依次向右滑动，直至满足k个1，在下一个数不为1且数组不越界的情况下窗口向右滑动，同时计数。
 * 核心代码如下：
 */
public class 病毒检测 {
    public static int NumSubString(int k, String str) {
        char[] chars = str.toCharArray();
        int res = 0;
        int len = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == '1') {
                res++;
            }
        }
        if (res < k) {
            return 0;
        }
        res = 0;
        for (int i = 0; i < len; i++) {
            //滑动索引
            int index = 0;
            int count = 0;
            while (count < k && index < len) {
                if (chars[index] == '1' && ++count == k) {
                    res++;
                    index++;
                    break;
                }
                index++;
            }
            //满足k以后继续右滑
            while (index < len && chars[index] != '1') {
                res++;
                index++;
            }
        }
        return res;
    }
}
