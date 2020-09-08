package leetcode.面试.hw; /**
 * Created with IntelliJ IDEA By fty on 2020/9/6
 */

import DataStructure.Array.Array;

import java.text.StringCharacterIterator;
import java.util.*;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/9/6 19:23
 * @Version V1.0
 **/
public class 字符串源 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String[] ss = str1.split(" ");
        String[] ss1 = str2.split(" ");
        String[] arr1 = minus(ss,ss1);
        int count = 0 ;
        for (int i = 0; i <arr1.length ; i++) {
            if (arr1[i] == "?"){
                count++;
            }
        }






    }

    public static String[] minus(String[] arr1, String[] arr2) {
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> history = new LinkedList<>();
        String[] longerArr = arr1;
        String[] shorterArr = arr2;
        if (arr1.length > arr2.length) {
            longerArr = arr2;
            shorterArr = arr1;
        }
        for (String str : longerArr) {
            if (!list.contains(str)) {
                list.add(str);
            }
        }
        for (String str : shorterArr) {
            if (list.contains(str)) {
                history.add(str);
                list.remove(str);
            } else {
                if (!history.contains(str)) {
                    list.add(str);
                }
            }
        }

        String[] result = {};
        return list.toArray(result);
    }







}
