package ExceptionHandling;

public class NullPoinyerException {
	public static void main(String[] args) {
		try {
			String name = null;
			System.out.println(name.charAt(0));
			
		}catch(NullPointerException e) {
			System.out.println("Name variable is empty!");
		}
	}
}
