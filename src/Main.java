import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Book\n" +
                    "2. Remove Book\n" +
                    "3. Add User\n" +
                    "4. Remove User\n" +
                    "5. Borrow Book\n" +
                    "6. Return Book\n" +
                    "7. List Books\n" +
                    "8. List Users\n" +
                    "9. Exit");

            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();

                    library.addBook(title, author, isbn);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter ISBN for removing book: ");
                    String bookIsbn = scanner.nextLine();

                    library.removeBook(bookIsbn);
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();

                    library.addUser(name, id);
                    System.out.println("User added successfully.");
                    break;
                case 4:
                    System.out.print("Enter id for removing user: ");
                    String bookId = scanner.nextLine();

                    library.removeUser(bookId);
                    break;
                case 5:
                    System.out.print("Enter ISBN for borrowing book: ");
                    String borrowBookIsbn = scanner.nextLine();
                    System.out.print("Enter user ID: ");
                    String borrowUserId = scanner.nextLine();

                    library.borrowBook(borrowBookIsbn, borrowUserId);
                    break;
                case 6:
                    System.out.print("Enter ISBN for returning book: ");
                    String returnBookIsbn = scanner.nextLine();

                    library.returnBook(returnBookIsbn);
                    break;
                case 7:
                    library.listBooks();
                    break;
                case 8:
                    library.listUsers();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.print("Invalid option! Try again!");
            }
        }
    }
}