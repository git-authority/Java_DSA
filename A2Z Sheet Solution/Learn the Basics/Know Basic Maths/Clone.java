import java.util.*;

// Book class
class Book {
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

// Library class
class Library implements Cloneable {
    String name;
    List<Book> books;

    Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book){
        books.add(book);
    }

    void display(){
        System.out.println("Library : " + name);
        for(Book book : books){
            System.out.println("Book : " + book.title + ", Author : " + book.author);
        }
    }

    // Shallow clone
    Library shallowClone() throws CloneNotSupportedException {
        Library shallowClonedLibrary = (Library) this.clone();
        return shallowClonedLibrary;
    }

    // Deep clone
    Library deepClone() throws CloneNotSupportedException {
        Library deepClonedLibrary = (Library) this.clone(); // Copy library name and books reference
        deepClonedLibrary.books = new ArrayList<>(); // Create a new book list

        for(Book book : this.books){
            deepClonedLibrary.books.add(new Book(book.title, book.author)); // Copy book details
        }

        return deepClonedLibrary;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// Main class
public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Create Library
        Library library = new Library("Central_Library");

        // Add books
        library.addBook(new Book("Frankestein", "Mary_Shelley"));
        library.addBook(new Book("King_Arthur_and_the_Round_Table", "Rosemary_Sutcliff"));

        // Display original
        System.out.println("Original Library : ");
        library.display();

        // Clone
        Library shallowLibrary = library.shallowClone();
        Library deepLibrary = library.deepClone();

        // Modify original
        library.books.get(1).title = "Treasure_Island";
        library.books.get(1).author = "Robert_Louis_Stevenson";

        // Display after modification
        System.out.println("\nAfter Modifications :\n");

        System.out.println("Original Library : ");
        library.display();

        System.out.println("\nShallow Clone : ");
        shallowLibrary.display();

        System.out.println("\nDeep Clone : ");
        deepLibrary.display();
    }
}
