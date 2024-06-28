package week1.day2;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Library bookName = new Library();
	    bookName.addBook("Introduction to Java");
	    
	    bookName.issueBook();
	}
   
	public String addBook(String bookTitle) {
		System.out.println(bookTitle +" Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		// TODO Auto-generated method stub
		System.out.println("Book issued successfully");
	} 
	
}
