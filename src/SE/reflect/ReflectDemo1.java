package SE.reflect;

import SE.domain.Person;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/3/11 14:43
 * @Version V1.0
 **/
public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        /**
         获取class对象的三种方式
         1 class.forName(“全类名”)将字节码的文件加载进内存，返回class 对象
         2 类名.class ，通过类名的属性class获取
         3 对象.getclass
         */

        // 1.class.forName("全类名")
        Class cl1=Class.forName("SE.domain.Person");
        System.out.println(cl1);
        // 2.类名.class
        Class cl2=Person.class;
        System.out.println(cl2);
        //3 对象，getclass
        Person p =new Person();
        Class cl3=p.getClass();
        System.out.println(cl3);

        System.out.println(cl1 == cl2);
        System.out.println(cl1 == cl3);
    }

}
