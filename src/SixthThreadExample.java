public class SixthThreadExample implements Runnable {
    @Override //аннотация, которая говорит, что мы будем переопределять следующий метод
    public void run() { //обязательный для переопределения метод, так как наш класс наследуется от интерфейса Runnable, в котором
        //мы реализуем логику, которая будет выполняться в новом потоке
        System.out.println("Start of the Thread: " + getClass().getName());
        System.out.println("waiting 3 seconds");

        try { //пытаемся выполнить следующий код
            Thread.sleep(3000); //усыпляем основной поток
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + getClass().getName() + " finished his work.");
    }
}
