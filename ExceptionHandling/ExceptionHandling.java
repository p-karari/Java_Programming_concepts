package ExceptionHandling;
import java.util.*;

public class ExceptionHandling {
	
	
	
	public static void main(String[] args) {
		 Scanner num = new Scanner(System.in);
		 System.out.print("Enter the first number : ");
		 int num1 = num.nextInt();
		  num.nextLine();
		  
		  System.out.print("Enter the second number : ");
		  int num2 = num.nextInt();
		  num.nextLine();
		  try {
			  int result = num1 / num2;
			  System.out.printf("Result : %s\n" , result);
		  } catch(ArithmeticException e) {
			  System.out.println("Can't divide by zero");
		  } 
		  
		  
	}

}
