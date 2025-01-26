package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {
        if (from1UpTo1000 < 500) {
            System.out.println("Eagle"); // Виводимо "Eagle", якщо число менше 500
        } else {
            System.out.println("Tail"); // Виводимо "Tail", якщо число 500 або більше
        }
    }
}