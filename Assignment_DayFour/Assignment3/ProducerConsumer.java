package Assignment3;

/**
 * Assignment 3 Producer Consumer scenario buffering to same location
 *
 * @author Dai
 */
public class ProducerConsumer {

    /**
     * Two running thread one incrementing stuff and one decrementing stuff
     * offset delay to see changes
     *
     */
    public static void main(String[] args) {
        final int[] stuff = {0};

        Runnable produce = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    stuff[0]++;
                    System.out.println(stuff[0]);
                    try {
                        Thread.sleep(900);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable consume = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    stuff[0]--;
                    System.out.println(stuff[0]);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        new Thread(produce).start();
        new Thread(consume).start();
    }
}