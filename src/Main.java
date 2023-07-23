import DynamicConnectivity.MyDynamicConnectivity;
import DynamicConnectivity.QuickFindUF;

public class Main {
    public static void main(String[] args) {

        System.out.print("Hello and welcome! Let's solve some problems");

        //My Way
        System.out.print("1 - Dynamic Connectivity (my Way) \n");

        int[] points = {-1, 0, 1, 2, 3};

        MyDynamicConnectivity dc = new MyDynamicConnectivity(points);

        dc.union(-1,0);
        dc.union(-1,3);
        dc.union(1,2);

        System.out.println(dc.isConnected(1,2));
        System.out.println(dc.isConnected(0,3));
        System.out.println(dc.isConnected(1,-1));

        //My Way
        System.out.print("1 - Dynamic Connectivity (Quick Find) \n");

        QuickFindUF quickFindUF = new QuickFindUF(5);

        quickFindUF.union(0, 1);
        quickFindUF.union(0, 2);
        quickFindUF.union(3, 4);

        System.out.println(quickFindUF.isConnected(1,2));
        System.out.println(quickFindUF.isConnected(0,1));
        System.out.println(quickFindUF.isConnected(0,4));


        //Quick Find



        //Quick Union

    }
}