package ex_06;

public class Counter {
    public String name;
    public int counter;

    public Counter(String name) {
        this(name, 0);
    }

    public Counter(String name, int counter) {
        this.counter = counter;
        this.name = name;
    }

    public int add(int value) {
        counter += value;

        return counter;
    }

    public int dec(int value) {
        counter -= value;

        return counter;
    }

    public int add() {
        return ++counter;
    }

    public int dec() {
        return --counter;
    }
}
