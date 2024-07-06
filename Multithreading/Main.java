package Multithreading;

public class Main {
    public static void main(String[] args) {
        Thread.activeCount();//how many threads are active
        Thread.currentThread().getName();//return the name of the main thread basically
        Thread.currentThread().setName("MaiN");//you can set a name for the current thread
        Thread.currentThread().getPriority();
        Thread.currentThread().setPriority(10);
    }
}
