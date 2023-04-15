public class FourthThreadExample extends Thread {
    @Override
    public void run() { //необязательный для переопределения метод, так как наш класс наследуется от класса Thread, в котором
        //мы реализуем логику, которая будет выполняться в новом потоке
        System.out.println("Start of Thread: " + getName());
    }
}
