package DynamicConnectivity;

public class QuickUnionUF {
    int id[];

    public QuickUnionUF(int N){
        id = new int[N];
        for(int i = 0; i < N; i++) id[i] = i;
    }

    private int getRoot(int i){
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean isConnected(int p, int q){
        return getRoot(p) == getRoot(q);
    }

    public void union(int p, int q){
        int pRoot = getRoot(p);
        int qRoot = getRoot(q);

        id[qRoot] = pRoot;
    }
}
