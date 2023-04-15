public class FifthThreadExample extends Thread {
    @Override
    public void run() {
        System.out.println("Start of the Thread: " + getName());
        System.out.println("waiting 3 seconds");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + getName() + " finished his work.");
    }
}
