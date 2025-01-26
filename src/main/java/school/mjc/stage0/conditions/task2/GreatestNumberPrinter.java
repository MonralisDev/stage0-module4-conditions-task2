package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if (first > second) {
            System.out.println(first); // Виводимо перше число, якщо воно більше
        } else {
            System.out.println(second); // Виводимо друге число, якщо воно більше або рівне
        }
    }
}