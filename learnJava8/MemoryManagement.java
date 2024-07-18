package learnJava8;

public class MemoryManagement {
    private static final int SIZE = 1000;

    public static void main(String[] args) {
        // Create a large number of objects to fill up memory
        createObjects();

        // Requesting Garbage Collection
        System.gc();

        // Wait for a moment to allow GC to process
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Garbage Collection requested and completed.");
    }

    private static void createObjects() {
        for (int i = 0; i < SIZE; i++) {
            String[] largeArray = new String[SIZE];
            for (int j = 0; j < SIZE; j++) {
                largeArray[j] = "Filling up memory: " + i + " - " + j;
            }
        }
        System.out.println("Objects created and memory filled up.");
    }
}
