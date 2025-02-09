package ex_08;

public class Book implements Cloneable {
    private final String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Book cloned = (Book) super.clone();
        cloned.author = (Author) author.clone();
        return cloned;
    }

    public Author getAuthor() {
        return author;
    }
}
