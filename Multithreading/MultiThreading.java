package Multithreading;

public class MultiThreading extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

        }
    }
}
