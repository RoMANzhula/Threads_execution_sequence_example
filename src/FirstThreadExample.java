public class FirstThreadExample extends Thread { // створюємо клас FirstThreadExample, який наслідується від класу Thread
    @Override // анотація, яка говорить, що ми збираємось перевизначити наступний метод
    public void run() { // цей метод - це своєрідна капсула, в якій ми прописуємо ту логіку, яку ми хочемо запустити
        // в новому потоці. І для того, щоб ініціалізувати цю капсулу в новому потоці, нам потрібно буде викликати метод
        // start() - це важливе правило багатопоточності.
        System.out.println("Привіт! Моє ім'я системи: " + getName()); // код (логіка), який ми хочемо запустити в новому потоці
    }
}
