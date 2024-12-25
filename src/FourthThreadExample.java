public class FourthThreadExample extends Thread {
    @Override
    public void run() { //необов'язковий для перевизначення метод, оскільки наш клас успадковується від класу Thread, у якому
        //ми реалізуємо логіку, яка буде виконуватися в новому потоці
        System.out.println("Start of Thread: " + getName());
    }
}
