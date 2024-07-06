package Multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Thread.activeCount();//how many threads are active
        // Thread.currentThread().getName();//return the name of the main thread basically
        // Thread.currentThread().setName("MaiN");//you can set a name for the current thread
        // Thread.currentThread().getPriority();
        // Thread.currentThread().setPriority(10);
        // for(int i=10;i>0;i--){
        //     System.out.println(i);
        //     try {
        //         Thread.sleep(1000);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // }
        // System.out.println("you are done!");
        // MultiThreading thread2 =new MultiThreading();
        // thread2.start();
        // System.out.println(thread2.isAlive());
        MultiThreading thread1 =new MultiThreading();
        MyRunnable runnable1=new MyRunnable();
        Thread thread2=new Thread(runnable1);
        thread1.start();
        thread2.start();
}
}

