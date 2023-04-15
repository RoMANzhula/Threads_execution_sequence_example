public class SecondThreadExample implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Start of the Thread: " + getClass().getName() + " - " + i);
        }
    }
}
