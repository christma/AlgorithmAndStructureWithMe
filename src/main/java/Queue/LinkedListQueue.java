package Queue;

import LinkedList.LinkedList;

public class LinkedListQueue<E> implements Queue<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head, tail;
    private int size;

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {

        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        }
        Node delNode = head;
        head = head.next;
        delNode.next = null;
        if (head == null) {
            tail = null;
        }
        size--;
        return delNode.e;

    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        }
        return head.e;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Queue: front ");
        Node cur = head;
        while (cur != null) {
            sb.append(cur + "->");
            cur = cur.next;
        }
        sb.append("NULL tail");
        return sb.toString();
    }
}
