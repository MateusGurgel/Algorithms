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

        //Quick Find
        //Quick Union

    }
}