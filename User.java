import java.time.*;
import java.util.*;
public class User {
	
	public String name;
	public LocalDate birthDay;
	public ArrayList<book> books = new ArrayList<book>(); 

//public void borrow(book book1) {
//	this.books.add(book1);
//	
//}
	
public int age() {
	int age = Period.between(this.birthDay, LocalDate.now()).getYears();	
	return age;
	
	}
}
