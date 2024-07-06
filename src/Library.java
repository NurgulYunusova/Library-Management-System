import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    ArrayList<Book> books;
    ArrayList<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
    }

    public void addUser(String name, String id) {
        users.add(new User(name, id));
    }

    public void removeBook(String isbn) {
        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();

            if (book.getIsbn().equals(isbn)) {
                iterator.remove();
                System.out.println("Book removed successfully!");
                return;
            }
        }

        System.out.println("Book ISBN is wrong!");
    }

    public void removeUser(String id) {
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();

            if (user.getId().equals(id)) {
                iterator.remove();
                System.out.println("User removed successfully!");
                return;
            }
        }

        System.out.println("User ID is wrong!");
    }

    public void borrowBook(String isbn, String userId) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && !book.isBorrowed()) {
                book.setBorrowed(true);
                System.out.println(book.getTitle() + " is borrowed by " + userId);
                return;
            } else {
                System.out.println("Book is not available.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isBorrowed()) {
                book.setBorrowed(false);
                System.out.println(book.getTitle() + " is returned by user");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void listUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
