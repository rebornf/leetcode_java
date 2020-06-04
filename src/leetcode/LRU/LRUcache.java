package leetcode.LRU; /**
 * Created with IntelliJ IDEA By fty on 2020/5/28
 */

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;
import org.omg.CORBA.INTERNAL;
import sun.misc.LRUCache;

import java.util.HashMap;

/**
 * @Author fty
 * @Description LRU �㷨ʵ����������������ݽṹ������Ҫ����һ�� capacity ������Ϊ��������������
 * Ȼ��ʵ������ API��һ���� put(key, val) ���������ֵ�ԣ�
 * ��һ���� get(key) ������ȡ key ��Ӧ�� val����� key �������򷵻� -1��
 * <p>
 * ע��Ŷ��get �� put �������붼�� O(1)O(1) ��ʱ�临�Ӷȣ����Ǿٸ��������������� LRU �㷨��ô������
 * @Version V1.0
 **/
class LRUcache {
    // key-> Node(key,val);
    HashMap<Integer, Node> map;
    DoubleList cache;
    int capacity;

    public LRUcache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node tmp = map.get(key);
        cache.remove(tmp);
        cache.addFirst(tmp);

        return tmp.val;
    }

    public void put(int key, int val) {
        //�Ȱ��½ڵ�x������
        Node x = new Node(key, val);

        if (map.containsKey(key)) {
            //ɾ���ɽڵ��²��뵽ͷ��
            cache.remove(map.get(key));
            cache.addFirst(x);
            map.put(key, x);
        } else {
            if (capacity == cache.size()) {
                Node last = cache.removeLast();
                map.remove(last.key);
            }
            //ֱ����ӵ�ͷ��
            cache.addFirst(x);
            map.put(key, x);
        }
    }
}

class DoubleList {

    private Node head, tail;//ͷβ��ڵ�
    private int size; //�����Ԫ������

    public DoubleList() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    //������ͷ����ӽڵ�x
    public void addFirst(Node x) {
        x.next = head.next;
        x.prev = head;
        head.next.prev = x;
        head.next = x;
        size++;
    }

    //ɾ���ڵ�x
    public void remove(Node x) {
        x.prev.next = x.next;
        x.next.prev = x.prev;
        size--;
    }

    //ɾ����������һ���ڵ㣬�����ظýڵ�
    public Node removeLast() {
        if (tail.prev == head) {
            return null;
        }
        Node last = tail.prev;
        remove(last);
        return last;
    }

    //��������ĳ���
    public int size() {
        return size;
    }

}

class Node {
    public int key, val;
    public Node next, prev;

    public Node(int k, int v) {
        this.key = k;
        this.val = v;
    }
}


