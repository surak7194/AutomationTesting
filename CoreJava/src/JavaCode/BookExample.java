package JavaCode;

class Book {

	// Data member's

	String book_name = "Core Java";
	int price = 450;

	// Member function's

	void read() {
		System.out.println("I am reading " + book_name + " book");
	}

	void write() {
		System.out.println("I am writting " + book_name + " book");
	}

}

public class BookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book();
		System.out.println("Accessing Data member using Object: " +b1.book_name);
		System.out.println("Accessing Data member using Object: " +b1.price);


		b1.read();

		b1.write();
	}

}
