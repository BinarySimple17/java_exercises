package ex_08;

public class Author implements Cloneable {
    private final String name;

    public Author(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
