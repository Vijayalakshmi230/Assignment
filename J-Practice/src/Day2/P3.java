package Day2;
import java.util.Scanner;
class Book {
	private int bookId;
	private String title;
	private String author;
	private boolean isIssued;
	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isIssued = false;
	}
	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isIssued() {
		return isIssued;
	}
	public void setIssued(boolean status) {
		this.isIssued = status;
	}
	public String toString() {
		return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Issued: "
				+ (isIssued ? "Yes" : "No");
	}
}
class Library {
	private Book[] books;
	private int count;
	public Library(int size) {
		books = new Book[size];
		count = 0;
	}
	public void addBook(Book book) {
		if (count < books.length) {
			books[count++] = book;
			System.out.println("Book added successfully!");
		} else {
			System.out.println("Library is full!");
		}
	}
	public void removeBook(int bookId) {
		for (int i = 0; i < count; i++) {
			if (books[i].getBookId() == bookId) {
				books[i] = books[count - 1];
				books[count - 1] = null;
				count--;
				System.out.println("Book removed successfully!");
				return;
			}
		}
		System.out.println("Book not found!");
	}
	public void issueBook(int bookId) {
		for (int i = 0; i < count; i++) {
			if (books[i].getBookId() == bookId) {
				if (!books[i].isIssued()) {
					books[i].setIssued(true);
					System.out.println("Book issued successfully!");
				} else {
					System.out.println("Book is already issued.");
				}
				return;
			}
		}
		System.out.println("Book not found!");
	}
	public void withdrawBook(int bookId) {
		for (int i = 0; i < count; i++) {
			if (books[i].getBookId() == bookId) {
				if (books[i].isIssued()) {
					books[i].setIssued(false);
					System.out.println("Book withdrawn successfully!");
				} else {
					System.out.println("Book is already available.");
				}
				return;
			}
		}
		System.out.println("Book not found!");
	}
	public void displayBooks() {
		if (count == 0) {
			System.out.println("No books in the library.");
		} else {
			for (int i = 0; i < count; i++) {
				System.out.println(books[i]);
			}
		}
	}
}
public class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the max Capacity of books: ");
		int size = sc.nextInt();
		Library library = new Library(size);
		while (true) {
			System.out.println("1. Add Book");
			System.out.println("2. Remove ");
			System.out.println("3. Issue");
			System.out.println("4. Withdraw");
			System.out.println("5. Display");
			System.out.println("6. Exit");
			System.out.print("Enter the menu Option: ");
			int choice = sc.nextInt();
			if (choice == 6) {
				System.out.println("Exiting...");
				break;
			}
			int bookId;
			switch (choice) {
			case 1:
				System.out.print("Book ID: ");
				bookId = sc.nextInt();
				sc.nextLine(); 
				System.out.print("Title: ");
				String title = sc.nextLine();
				System.out.print("Author: ");
				String author = sc.nextLine();
				library.addBook(new Book(bookId, title, author));
				break;
			case 2:
				System.out.print("Enter Book ID to remove: ");
				library.removeBook(sc.nextInt());
				break;
			case 3:
				System.out.print("Enter Book ID to issue: ");
				library.issueBook(sc.nextInt());
				break;
			case 4:
				System.out.print("Enter Book ID to withdraw: ");
				library.withdrawBook(sc.nextInt());
				break;
			case 5:
				library.displayBooks();
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
