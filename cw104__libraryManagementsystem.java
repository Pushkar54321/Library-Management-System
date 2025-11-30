import java.util.ArrayList;
class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' + '}';
    }
}

class Library{
    public ArrayList<Book> books;
    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }
}
public class cw104__libraryManagementsystem{
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Rich dad poor dad", "Robert Kiyosaki");
        bk.add(b1);

        Book b2 = new Book("Source Code", "Bill gates");
        bk.add(b2);

        Book b3 = new Book("Learning Java", " Joshua Crotts");
        bk.add(b3);

        Book b4 = new Book("Iron Man: The Ultimate Guide to the Armored Super Hero", "Matthew K. Manning");
        bk.add(b4);
        Library l = new Library(bk);
        l.addBook(new Book("Planet Hulk", "Greg Pak"));
        System.out.println(l.books);
        l.issueBook(b3, "Pushkar singh");
        System.out.println(l.books);
    }
}
