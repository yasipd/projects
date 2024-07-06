package Multithreading;

public class MultiThreading extends Thread{
    @Override
    public void run() {
        for (int i=10;i>0;i--){
            System.out.println("Thread #1 : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }
        System.out.println("thread number 1 is finished.");
    }
}
