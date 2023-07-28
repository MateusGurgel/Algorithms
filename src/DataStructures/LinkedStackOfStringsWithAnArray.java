package DataStructures;

public class LinkedStackOfStringsWithAnArray {

    String stack[];
    int count;

    public LinkedStackOfStringsWithAnArray(int capacity){
        stack = new String[capacity];
    }

    private void resize(int capacity) {
        String[] copy = new String [capacity];
        for (int i = 0; i < count; i++)  copy[i] = stack[i];
        stack = copy;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public void push(String string){

        if(count == stack.length){
            resize(stack.length * 2);
        }

        stack[count++] = string;
    }

    public String pop(){
        String string = stack[--count];
        stack[count] = null;
        if(count > 0 &&  count == stack.length / 4 ) resize(stack.length / 2);
        return string;
    }


}
