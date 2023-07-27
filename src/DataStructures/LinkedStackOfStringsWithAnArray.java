package DataStructures;

public class LinkedStackOfStringsWithAnArray {

    String stack[];
    int count;

    public LinkedStackOfStringsWithAnArray(int capacity){
        stack = new String[capacity];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public void push(String string){
        stack[count++] = string;
    }

    public String pop(){
        return stack[--count];
    }


}
