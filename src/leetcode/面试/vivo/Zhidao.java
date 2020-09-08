package leetcode.面试; /**
 * Created with IntelliJ IDEA By fty on 2020/7/16
 */

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/7/16 19:56
 * @Version V1.0
 **/
public class Zhidao{

        public static void main(String[] args) {
            String condition = "";
            Zhidao zhidao = new Zhidao();
            do{
                Scanner scanner = new Scanner(System.in);
                try{
                    System.out.print("请输入第一个数：");
                    double x = scanner.nextDouble();
                    System.out.print("请输入第二个数：");
                    double y = scanner.nextDouble();
                    System.out.print("请输入运算符：");
                    String s = scanner.next();
                    char z = s.charAt(0);
                    zhidao.yunsuan(x, y, z);
                }catch(Exception e){
                    System.out.println("请输入正确的数据！");
                }
                System.out.print("是否继续？continue：继续，任意字符：结束");
                condition = scanner.next();
            }while("continue".equals(condition));
        }
        public static void yunsuan(double x,double y,Character z){
            DecimalFormat r=new DecimalFormat();
            r.applyPattern("#0.00");
            if(z.equals('+')){
                System.out.println(x+"+"+y+"=" + r.format((x+y)));
            } else if(z.equals('-')){
                System.out.println(x+"-"+y+"=" + r.format((x-y)));
            } else if(z.equals('*')){
                System.out.println(x+"*"+y+"=" + r.format((x*y)));
            } else if(z.equals('/')){
                if(y==0){
                    System.out.println("被除数不能为0");
                } else{
                    System.out.println(x+"/"+y+"=" + r.format((x/y)));
                }
            }else{
                System.out.println("无法识别改运算符");
            }
        }
    }

