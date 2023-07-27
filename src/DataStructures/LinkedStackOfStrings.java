package DataStructures;

public class LinkedStackOfStrings {

    private static class Node{
        String value;
        Node nextNode;
    }

    private Node firstNode = null;

    public boolean isEmpty(){
        return firstNode == null;
    }

    public String pop(){
        String firsItem = firstNode.value;
        firstNode = firstNode.nextNode;
        return firsItem;
    }

    public void push(String string){
        Node newNode = new Node();
        newNode.value = string;
        newNode.nextNode = firstNode;
        firstNode = newNode;
    }

}
