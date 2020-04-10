package SE.reflect;

import SE.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/3/13 15:23
 * @Version V1.0
 **/
public class ReflectDemo3 {
    /**  Class对象功能：
     * 获取功能：
     1. 获取成员变量们
     * Field[] getFields() ：获取所有public修饰的成员变量
     * Field getField(String name)   获取指定名称的 public修饰的成员变量

     * Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
     * Field getDeclaredField(String name)
     2. 获取构造方法们
     * Constructor<?>[] getConstructors()
     * Constructor<T> getConstructor(类<?>... parameterTypes)

     * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     * Constructor<?>[] getDeclaredConstructors()
     3. 获取成员方法们：
     * Method[] getMethods()
     * Method getMethod(String name, 类<?>... parameterTypes)

     * Method[] getDeclaredMethods()
     * Method getDeclaredMethod(String name, 类<?>... parameterTypes)

     4. 获取全类名
     * String getName()

     */
    public static void main(String[] args) throws Exception {
        //获取Person的class对象
        Class personClass= Person.class ;
        /**
         2. 获取构造方法们
         * Constructor<T> getConstructor(类<?>... parameterTypes)
         * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
         * Constructor<?>[] getConstructors()
         * * Constructor<?>[] getDeclaredConstructors()
         */
        //Constructor<T> getConstructor(类<?>... parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //创建对象

        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);

        Constructor constructor1 = personClass.getConstructor();//如果使用空参数构造方法创建对象，操作可以简化：Class对象的newInstance方法
        System.out.println(constructor1);



        Object o = personClass.newInstance();
        System.out.println(o);
    }
}
