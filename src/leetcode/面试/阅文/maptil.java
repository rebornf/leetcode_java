package leetcode.面试.阅文;

import com.sun.xml.internal.ws.wsdl.parser.MemberSubmissionAddressingWSDLParserExtension;

import java.lang.reflect.Field;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/19 20:14
 * @Version V1.0
 **/
public class maptil {
    public static Map<String, Object> beantoString(Object object) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();

        Class clas = object.getClass();
        Field[] fields = clas.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(object));
        }
        return map;
    }
}
