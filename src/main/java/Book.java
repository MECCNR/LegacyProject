public class Book extends Product {
    private String author;

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public String toString() {
        return id + " " + name + " " + price + " " + author;
    }

    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        } else {
            return false;
        }
    }
}
