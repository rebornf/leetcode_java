package leetcode.LRU; /**
 * Created with IntelliJ IDEA By fty on 2020/6/4
 */


import com.sun.media.sound.AiffFileReader;

/**
 * @Author fty
 * @Description ����һ���̶���С�����飬�κ�λ�ö������Ƕ��ף�ֻҪ֪�����г��ȣ��Ϳ��Ը������湫ʽ�������βλ�ã�
 * <p>
 * tailIndex=(headIndex+count?1)modcapacity
 * <p>
 * ���� capacity �����鳤�ȣ�count �Ƕ��г��ȣ�headIndex �� tailIndex �ֱ��Ƕ��� head �Ͷ�β tail ������
 * @Date 2020/6/4 9:28
 * @Version V1.            leetcode 622
 **/
public class CircularQueue {

    private int[] queue; //һ���̶���С�����飬���ڱ���ѭ�����е�Ԫ��
    private int headIndex;
    private int count; //ѭ�����е�ǰ�ĳ��ȣ���ѭ�������е�Ԫ������
    private int capacity;

    public CircularQueue(int k) {
        this.capacity = k;
        this.queue = new int[k];
        this.headIndex = 0;
        this.count = 0;
    }
    //������в���Ԫ�أ������ɹ���������true;

    public boolean eQueue(int value) {
        if (this.count == this.capacity) {
            return false;
        }
        this.queue[(this.headIndex + this.count) % this.capacity] = value;//�ڶ�β����Ԫ��
        this.count += 1;
        return true;
    }

    //��ѭ������ɾ��Ԫ��

    public boolean deQueue() {
        if (this.count == 0) {
            return false;
        }
        this.headIndex = (this.headIndex + 1) % capacity;
        this.count = this.count - 1;
        return true;
    }

    //�õ����еĶ�ͷԪ��
    public int Front() {
        if (this.count == 0) return -1;
        return this.queue[this.headIndex];
    }

    //�õ����еĶ�βԪ��
    public int Rear() {
        if (this.count == 0) return -1;
        int tailIndex = (this.headIndex + this.count - 1) % this.capacity;
        return this.queue[tailIndex];
    }
    // ʱ�临�Ӷȣ�\mathcal{O}(1)O(1)�������ݽṹ�У����з��������к㶨��ʱ�临�Ӷȡ�
    //
    //�ռ临�Ӷȣ�\mathcal{O}(N)O(N)������ NN �Ƕ��е�Ԥ����������ѭ�����е��������������У������и�Ԥ����Ŀռ䡣

    public boolean isEmpty() {
        return (this.count == 0);
    }

    public boolean isFull() {
        return (this.count == this.capacity);
    }
}
