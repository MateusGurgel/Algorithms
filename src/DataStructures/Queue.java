package DataStructures;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {

    Node first;
    Node last;

    public Iterator<Item> iterator() { return new ListIterator(); }

    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        public boolean hasNext() { return current != null; }
        public Item next() {
            Item item = current.value;
            current = current.next;
            return item;
        }
    }

    private class Node{
        Node next;
        Item value;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(Item item){
        Node oldLast = last;

        last = new Node();
        last.value = item;
        last.next = null;

        if(isEmpty()) first = last;
        else oldLast.next = last;

    }

    public Item dequeue(){
        Item value = first.value;

        first = first.next;

        if(isEmpty()) last = null;
        return value;
    }


}
