package structures;

import java.util.Iterator;

public class LinkedListQueue<Item> implements Iterable<Item> {

    private Node first; // points to the first added element in collection
    private Node last; // points to the last added element in collection
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void enqueue(Item item) {
        // Add Item to the end of collection
        Node oldlast = last;
        last = new Node();
        last.item = item;
        if (isEmpty()) first = last;
        else oldlast.next = last;
        N++;
    }

    public Item dequeue() {
        // Remove Item form the beginning of the collection
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
