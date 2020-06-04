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
 * @Description 请你为 最不经常使用（LFU）缓存算法设计并实现数据结构。它应该支持以下操作：get 和 put。
 * <p>
 * get(key)- 如果键存在于缓存中，则获取键的值（总是正数），否则返回 -1。
 * put(key, value) - 如果键已存在，则变更其值；如果键不存在，请插入键值对。当缓存达到其容量时，则应该在插入新项之前，使最不经常使用的项无效。
 * 在此问题中，当存在平局（即两个或更多个键具有相同使用频率）时，应该去除最久未使用的键。
 * 「项的使用次数」就是自插入该项以来对其调用 get 和 put 函数的次数之和。使用次数会在对应项被移除后置为 0
 * @Date 2020/6/4 14:46
 * @Version V1.0
 **/
public class LFUcache {
    Map<Integer, Node> cache; //储存缓存内容
    Map<Integer, DoubleList> frepMap;//储存每个频次对应的双向链表
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
        //从原frep对应的链表移除，并更新min
        int frep = node.freq;
        DoubleList list = frepMap.get(frep);
        list.removeNode(node);
        if (frep == min && list.head.next == list.tail) {
            min = frep + 1;
        }
        // 加入新freq对应的链表
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
