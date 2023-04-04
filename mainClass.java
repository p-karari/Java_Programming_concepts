import java.util.*;
import java.time.LocalDate;
public class main {
	public static void main(String[] args) {
		User youngerUser = new User();
		youngerUser.name = "Kelvin Karari";
		User olderUser = new User();
		olderUser.name = "Ngang'a Karari";
		olderUser.birthDay = LocalDate.parse("1998-09-22");
		
		book book1 = new book();
		book1.title = "Gifted hands";
		book1.author = "Ben Carson";
//		youngerUser.borrow(book1);
		
		youngerUser.birthDay = LocalDate.parse("2002-09-22");
		System.out.printf("%s was born back in %s and is now %d years old\n" , youngerUser.name , youngerUser.birthDay.toString(), youngerUser.age()) ;
		System.out.printf("%s was born back in %s and is now %d years old\n" , olderUser.name , olderUser.birthDay.toString(), olderUser.age()) ;
		System.out.printf("%s has borrowed these books : %s", youngerUser.name ,  book1.toString());
		
		
	};

	

}
