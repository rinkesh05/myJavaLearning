class Book {
    String title;
    int price;

    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    // Copy constructor
    Book(Book otherBook) {
        this.title = otherBook.title;
        this.price = otherBook.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

public class CopyConstructorDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", 450);
        Book book2 = new Book(book1);

        book2.display();
    }
}