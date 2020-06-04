package leetcode.LRU; /**
 * Created with IntelliJ IDEA By fty on 2020/6/4
 */

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;
import org.omg.CORBA.INTERNAL;
import sun.security.x509.InvalidityDateExtension;

import javax.xml.ws.spi.http.HttpHandler;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author fty
 * @Description ����Ϊ �����ʹ�ã�LFU�������㷨��Ʋ�ʵ�����ݽṹ����Ӧ��֧�����²�����get �� put��
 * <p>
 * get(key)- ����������ڻ����У����ȡ����ֵ�����������������򷵻� -1��
 * put(key, value) - ������Ѵ��ڣ�������ֵ������������ڣ�������ֵ�ԡ�������ﵽ������ʱ����Ӧ���ڲ�������֮ǰ��ʹ�����ʹ�õ�����Ч��
 * �ڴ������У�������ƽ�֣���������������������ͬʹ��Ƶ�ʣ�ʱ��Ӧ��ȥ�����δʹ�õļ���
 * �����ʹ�ô����������Բ����������������� get �� put �����Ĵ���֮�͡�ʹ�ô������ڶ�Ӧ��Ƴ�����Ϊ 0
 * @Date 2020/6/4 14:46
 * @Version V1.0
 **/
public class LFUcache {
    Map<Integer, Node> cache; //���滺������
    Map<Integer, DoubleList> frepMap;//����ÿ��Ƶ�ζ�Ӧ��˫������
    int size;
    int capacity;
    int min;

    public LFUcache(int capacity) {
        cache = new HashMap<>(capacity);
        frepMap = new HashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        frepInc(node);
        return node.value;
    }


    public void frepInc(Node node) {
        //��ԭfrep��Ӧ�������Ƴ���������min
        int frep = node.freq;
        DoubleList list = frepMap.get(frep);
        list.removeNode(node);
        if (frep == min && list.head.next == list.tail) {
            min = frep + 1;
        }
        // ������freq��Ӧ������
        node.freq++;
        list = frepMap.get(frep + 1);
        if (list == null) {
            list = new DoubleList();
            frepMap.put(frep + 1, list);
        }
        list.addNode(node);
    }

    class Node {
        int key;
        int value;
        int freq = 1;
        Node pre;
        Node next;

        public Node() {
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    class DoubleList {
        Node head;
        Node tail;

        public DoubleList() {
            head = new Node();
            tail = new Node();
            head.next = tail;
            tail.pre = head;
        }

        public void addNode(Node node) {
            node.pre = head.next;
            head.next.pre = node;
            head.next = node;
            node.pre = head;
        }

        public void removeNode(Node node) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
    }
}
