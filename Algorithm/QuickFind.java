package Algorithm;
//o(N*2)

public class QuickFind {
    private int[] id;
    public QuickFind(int N){
        id=new int[N];
        for(int i=0;i<N;i++){
            id[i]=i;
        }
    }
    public boolean connected(int p,int q){
        return id[p]==id[q];
    }
    public void union(int p,int q){
        int pid= id[p];
        int qid=id[q];
        for(int i=0;i<id.length;i++){
            if(id[i]==pid){
                id[i]=qid;
            }
        }
    }
    public static void main(String[] args) {
        int N = 10; 
        QuickFind qf = new QuickFind(N);
        qf.union(3, 4);
        qf.union(4, 9);
        qf.union(8, 0);
        qf.union(2, 3);
        qf.union(5, 6);
        System.out.println("3 and 9 connected: " + qf.connected(3, 9)); 
        System.out.println("5 and 6 connected: " + qf.connected(5, 6)); 
        System.out.println("1 and 7 connected: " + qf.connected(1, 7)); 
        qf.union(5, 0);
        qf.union(7, 2);
        qf.union(6, 1);
        qf.union(7, 3);
        System.out.println("1 and 0 connected: " + qf.connected(1, 0)); 
        System.out.println("7 and 4 connected: " + qf.connected(7, 4)); 
}
}
