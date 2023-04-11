package ExceptionHandling;

public class TringIndexOutOfBoundExceprion {

	public static void main(String[] args) {
		try {
			String name = "i am Kelvin";
			System.out.println(name.charAt(25));
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index is out of bound!");
		}
	}

}
