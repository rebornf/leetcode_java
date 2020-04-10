package IO;

import java.io.*;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/3/11 22:04
 * @Version V1.0
 **/
public class TextDataStream {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos =new DataOutputStream(baos);
        try {
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            System.out.println(bais.available());//读出其中有多少个有效的字节
            DataInputStream dis = new DataInputStream(bais);
            System.out.println(dis.readDouble());//先进先读
            System.out.println(dis.readBoolean());
            dos.close(); dis.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
