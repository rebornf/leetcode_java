package leetcode.面试.阅文;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.logging.SimpleFormatter;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/19 19:41
 * @Version V1.0
 **/
public class 时间差 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String startTimeStr = sc.nextLine();
        String endTimeStr = sc.nextLine();
        Date startTime = strToDateLong(startTimeStr);
        Date endTime = strToDateLong(endTimeStr);
        int res = (int) (((endTime.getTime() - startTime.getTime()) / 1000) / 60);// date.getTime() 返回时间的毫秒数值,将其转换为分钟
        System.out.println(res);
    }

    public static Date strToDateLong(String strDate) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = format.parse(strDate, pos);
        return strtodate;
    }
}
