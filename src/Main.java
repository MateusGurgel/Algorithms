import Algorithms.DynamicConnectivity.ImprovedQuickUnionUF;
import Algorithms.DynamicConnectivity.MyDynamicConnectivity;
import Algorithms.DynamicConnectivity.QuickFindUF;
import Algorithms.DynamicConnectivity.QuickUnionUF;
import DataStructures.LinkedStackOfStrings;
import DataStructures.LinkedStackOfStringsWithAnArray;
import DataStructures.Queue;

public class Main {
    public static void main(String[] args) {

        System.out.print("Hello and welcome! Let's solve some problems");

        //My Way
        System.out.println();

        System.out.print("1 - Dynamic Connectivity (my Way) \n");

        int[] points = {-1, 0, 1, 2, 3};

        MyDynamicConnectivity dc = new MyDynamicConnectivity(points);

        dc.union(-1,0);
        dc.union(-1,3);
        dc.union(1,2);

        System.out.println(dc.isConnected(1,2));
        System.out.println(dc.isConnected(0,3));
        System.out.println(dc.isConnected(1,-1));

        //Quick Find
        System.out.println();

        System.out.print("1 - Dynamic Connectivity (Quick Find) \n");

        QuickFindUF quickFindUF = new QuickFindUF(5);

        quickFindUF.union(0, 1);
        quickFindUF.union(0, 2);
        quickFindUF.union(3, 4);

        System.out.println(quickFindUF.isConnected(1,2));
        System.out.println(quickFindUF.isConnected(0,1));
        System.out.println(quickFindUF.isConnected(0,4));

        //Quick union
        System.out.println();

        System.out.print("1 - Dynamic Connectivity (Quick Union) \n");

        QuickUnionUF quickUnionUF = new QuickUnionUF(5);

        quickUnionUF.union(0, 1);
        quickUnionUF.union(0, 2);
        quickUnionUF.union(3, 4);

        System.out.println(quickUnionUF.isConnected(1,2));
        System.out.println(quickUnionUF.isConnected(0,1));
        System.out.println(quickUnionUF.isConnected(0,4));

        System.out.println();
        //Quick union improved

        System.out.print("1 - Dynamic Connectivity (Improved Quick Union) \n");

        ImprovedQuickUnionUF improvedQuickUnionUF = new ImprovedQuickUnionUF(5);

        improvedQuickUnionUF.union(0, 1);
        improvedQuickUnionUF.union(0, 2);
        improvedQuickUnionUF.union(3, 4);

        System.out.println(improvedQuickUnionUF.isConnected(1,2));
        System.out.println(improvedQuickUnionUF.isConnected(0,1));
        System.out.println(improvedQuickUnionUF.isConnected(0,4));

        System.out.println();
        //Stacks (First In, Last out!)

        LinkedStackOfStrings stack = new LinkedStackOfStrings();

        stack.push("LastOut");
        stack.push("FirstOut");

        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

        //Stacks with Array (First In, Last out!)
        System.out.println();

        LinkedStackOfStringsWithAnArray arrayStack = new LinkedStackOfStringsWithAnArray(2);

        arrayStack.push("LastOut");
        arrayStack.push("FirstOut");

        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.isEmpty());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.isEmpty());

        //Queue
        System.out.println();

        Queue<String> queue = new Queue<String>();

        queue.enqueue("First Out");
        queue.enqueue("Middle Out");
        queue.enqueue("Last Out");

        for(String string : queue){
            System.out.println(string);
        }

        System.out.println();

        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());

    }
}