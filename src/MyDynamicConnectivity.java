import java.util.Arrays;

public class MyDynamicConnectivity {

    private int connections[];
    private int points[];

    public int getPointIndex(int pointNumber) {
        for (int i = 0; i < points.length; i++) {
            if (points[i] == pointNumber) {
                return i;
            }
        }
        return -1;
    }


    public void union(int firsNum, int secondNum){

            int firsNumIndex = getPointIndex(firsNum);
            int secNumIndex = getPointIndex(secondNum);

            int fistConnection = connections[firsNumIndex];
            int secondConnection = connections[secNumIndex];

            for (int i = 0; i < connections.length; i++) {
                if (connections[i] == fistConnection){
                    connections[i] = secondConnection;
                }
            }

    }


    public boolean isConnected(int firsNum, int secondNum){
        int firsNumIndex = getPointIndex(firsNum);
        int secNumIndex = getPointIndex(secondNum);

        if(firsNumIndex == -1 || secNumIndex == -1){
            return false;
        }

        return connections[firsNumIndex] == connections[secNumIndex];
    }

    public MyDynamicConnectivity(int points[]){
        //assuming that all the numbers will not repeat themselves
        this.points = Arrays.copyOf(points, points.length);
        this.connections = Arrays.copyOf(points, points.length);
    }

}
