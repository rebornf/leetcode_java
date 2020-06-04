package leetcode.LRU; /**
 * Created with IntelliJ IDEA By fty on 2020/5/28
 */

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;
import org.omg.CORBA.INTERNAL;
import sun.misc.LRUCache;

import java.util.HashMap;

/**
 * @Author fty
 * @Description LRU 算法实际上是让你设计数据结构：首先要接收一个 capacity 参数作为缓存的最大容量，
 * 然后实现两个 API，一个是 put(key, val) 方法存入键值对，
 * 另一个是 get(key) 方法获取 key 对应的 val，如果 key 不存在则返回 -1。
 * <p>
 * 注意哦，get 和 put 方法必须都是 O(1)O(1) 的时间复杂度，我们举个具体例子来看看 LRU 算法怎么工作。
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
        //先把新节点x做出来
        Node x = new Node(key, val);

        if (map.containsKey(key)) {
            //删除旧节点新插入到头部
            cache.remove(map.get(key));
            cache.addFirst(x);
            map.put(key, x);
        } else {
            if (capacity == cache.size()) {
                Node last = cache.removeLast();
                map.remove(last.key);
            }
            //直接添加到头部
            cache.addFirst(x);
            map.put(key, x);
        }
    }
}

class DoubleList {

    private Node head, tail;//头尾虚节点
    private int size; //链表的元素数量

    public DoubleList() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    //在链表头部添加节点x
    public void addFirst(Node x) {
        x.next = head.next;
        x.prev = head;
        head.next.prev = x;
        head.next = x;
        size++;
    }

    //删除节点x
    public void remove(Node x) {
        x.prev.next = x.next;
        x.next.prev = x.prev;
        size--;
    }

    //删除链表的最后一个节点，并返回该节点
    public Node removeLast() {
        if (tail.prev == head) {
            return null;
        }
        Node last = tail.prev;
        remove(last);
        return last;
    }

    //返回链表的长度
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


