package leetcode.LRU; /**
 * Created with IntelliJ IDEA By fty on 2020/6/4
 */


import com.sun.media.sound.AiffFileReader;

/**
 * @Author fty
 * @Description 对于一个固定大小的数组，任何位置都可以是队首，只要知道队列长度，就可以根据下面公式计算出队尾位置：
 * <p>
 * tailIndex=(headIndex+count?1)modcapacity
 * <p>
 * 其中 capacity 是数组长度，count 是队列长度，headIndex 和 tailIndex 分别是队首 head 和队尾 tail 索引。
 * @Date 2020/6/4 9:28
 * @Version V1.            leetcode 622
 **/
public class CircularQueue {

    private int[] queue; //一个固定大小的数组，用于保存循环队列的元素
    private int headIndex;
    private int count; //循环队列当前的长度，即循环队列中的元素数量
    private int capacity;

    public CircularQueue(int k) {
        this.capacity = k;
        this.queue = new int[k];
        this.headIndex = 0;
        this.count = 0;
    }
    //向队列中插入元素，操作成功方法返回true;

    public boolean eQueue(int value) {
        if (this.count == this.capacity) {
            return false;
        }
        this.queue[(this.headIndex + this.count) % this.capacity] = value;//在队尾插入元素
        this.count += 1;
        return true;
    }

    //从循环队列删除元素

    public boolean deQueue() {
        if (this.count == 0) {
            return false;
        }
        this.headIndex = (this.headIndex + 1) % capacity;
        this.count = this.count - 1;
        return true;
    }

    //得到队列的队头元素
    public int Front() {
        if (this.count == 0) return -1;
        return this.queue[this.headIndex];
    }

    //得到队列的队尾元素
    public int Rear() {
        if (this.count == 0) return -1;
        int tailIndex = (this.headIndex + this.count - 1) % this.capacity;
        return this.queue[tailIndex];
    }
    // 时间复杂度：\mathcal{O}(1)O(1)。该数据结构中，所有方法都具有恒定的时间复杂度。
    //
    //空间复杂度：\mathcal{O}(N)O(N)，其中 NN 是队列的预分配容量。循环队列的整个生命周期中，都持有该预分配的空间。

    public boolean isEmpty() {
        return (this.count == 0);
    }

    public boolean isFull() {
        return (this.count == this.capacity);
    }
}
