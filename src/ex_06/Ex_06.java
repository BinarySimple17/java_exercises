package ex_06;

public class Ex_06 {

    /**
     * Реализовать класс-счетчик.
     * Полями класса должны выступать название счетчика и, непосредственно, целочисленный счетчик.
     * <p>
     * Реализовать для созданного класса конструктор с двумя параметрами,
     * с одним (значение счетчика в таком случае инициализировать как 0),
     * методы увеличения и уменьшения счетчиков на 1 и на заданное пользователем целом значение.
     * Методы должны возвращать актуальное значение счетчика.
     * <p>
     * Используя созданный класс,
     * посчитать количество четных и количество нечетных чисел в ряду от 1 до 100.
     * Конечные показатели счетчиков вывести в консоль.
     */

    public static void main(String[] args) {
        new Ex_06().run();
    }

    public void run() {
        Counter evenCounter = new Counter("Четные числа");
        Counter oddCounter = new Counter("Нечетные числа");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenCounter.add();
            } else {
                oddCounter.dec();
            }
        }

        printCounterValue(evenCounter);
        printCounterValue(oddCounter);
    }

    private void printCounterValue(Counter counter) {
        System.out.printf("%s: %d\n", counter.name, counter.counter);
    }
}
