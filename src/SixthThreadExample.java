public class SixthThreadExample implements Runnable {
    @Override //анотація, яка вказує, що ми будемо переозначати наступний метод
    public void run() { //обов'язковий для переозначення метод, оскільки наш клас реалізує інтерфейс Runnable, в якому
        //ми реалізуємо логіку, яка буде виконуватися в новому потоці
        System.out.println("Початок потоку: " + getClass().getName());
        System.out.println("Очікуємо 3 секунди");

        try { //намагаємось виконати наступний код
            Thread.sleep(3000); //зупиняємо потік на 3 секунди
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Потік " + getClass().getName() + " завершив свою роботу.");
    }
}
