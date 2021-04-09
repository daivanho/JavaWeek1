package Assignment2;

/**
 * Assignment 2 Create a deadlock scenario with two running threads
 *
 * @author Dai
 */
public class DeadLock {

    /**
     * Synchronized out of order creating a dead lock
     *
     * @param args
     */
    public static void main(String[] args) {
        DeadLock d1 = new DeadLock();
        DeadLock d2 = new DeadLock();
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (d1) {
                        Thread.sleep(100);
                        synchronized (d2) {

                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (d2) {
                        Thread.sleep(100);
                        synchronized (d1) {

                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(t1).start();
        new Thread(t2).start();
    }
}
