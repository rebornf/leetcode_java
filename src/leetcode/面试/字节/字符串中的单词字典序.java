package leetcode.面试.字节;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/11 10:36
 * @Version V1.0
 **/
/*
public class 字符串中的单词字典序 {
    public static void main(String[] args) {

    }

    public boolean wordBreak(String s  , List<String> wordDict){
        if (s==null ||  s.length()==0){
            return false;
        }
        boolean  []dp =new boolean [s.length()+1];
        dp[0] =true;
        for (int i=0;i<s.length();i++){

        }
    }
}
 **/
/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/11 11:24
 * @Version V1.0
 **/
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class 字符串中的单词字典序 {
    static Set<String> dic = new HashSet<>();
    static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in

        );
        String str = sc.nextLine();
        int num = Integer.parseInt(sc.nextLine());
        while (num-- > 0) {
            dic.add(sc.nextLine());
        }
        findNextWord2(str);
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
}

