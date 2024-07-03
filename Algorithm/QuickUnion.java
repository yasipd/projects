package Algorithm;
//here we have the lazy approach(child and parent)

public class QuickUnion {
    private int[] id;
    public QuickUnion(int N){
        id=new int[N];
        for(int i=0;i<N;i++){
            id[i]=i;
        }
    }
    private int root(int i){
        while(i !=id[i]){
            i=id[i];
        }return i;
    }
    public boolean connected(int p,int q){
        return root(p)==root(q);
    }
    public void union(int p,int q){
        int i= root(p);
        int j=root(q);
        id[i]=j;
    }
    public static void main(String[] args) {
        int N = 10; 
        QuickUnion qu = new QuickUnion(N);
        qu.union(3, 4);
        qu.union(4, 9);
        qu.union(8, 0);
        qu.union(2, 3);
        qu.union(5, 6);

        // Check if some pairs are connected
        System.out.println("3 and 9 connected: " + qu.connected(3, 9)); // Should be true
        System.out.println("5 and 6 connected: " + qu.connected(5, 6)); // Should be true
        System.out.println("1 and 7 connected: " + qu.connected(1, 7)); // Should be false

        //perform some more union operations
        qu.union(5, 0);
        qu.union(7, 2);
        qu.union(6, 1);
        qu.union(7, 3);

        // if some pairs are connected
        System.out.println("1 and 0 connected: " + qu.connected(1, 0)); // Should be true
        System.out.println("7 and 4 connected: " + qu.connected(7, 4)); // Should be true
    }
}