package Queue;

import Array.Array;

public class ArrayQueue<E> implements Queue<E> {

    Array<E> queue;

    public ArrayQueue(int capacity) {
        queue = new Array<E>(capacity);

    }

    public ArrayQueue() {

    }


    @Override
    public void enqueue(E e) {
        queue.addLast(e);
    }

    @Override
    public E dequeue() {
        return queue.removeFirst();
    }

    @Override
    public E getFront() {
        return queue.getFirst();
    }

    @Override
    public int getSize() {
        return queue.getSize();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: ");
        sb.append("front [");
        for (int i = 0; i < queue.getSize(); i++) {
            sb.append(queue.get(i));
            if (i != queue.getSize()) {
                sb.append(", ");
            }
        }
        sb.append(" ] tail");
        return sb.toString();
    }
}
