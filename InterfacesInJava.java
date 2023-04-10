
public class InterfacesInJava {

	public static void main(String[] args) {
		Mbike bike1 = new Mbike(20);
		System.out.printf("Starting speed is : %skm/h\n" ,bike1.getSpeed());
		bike1.applyBrake(5);
		System.out.printf("Speed after applying brake is : %skm/h\n" ,bike1.getSpeed());
		bike1.speedUp(40);
		System.out.printf("Speed after accelerating bike is : %skm/h\n" ,bike1.getSpeed());
		

	}

}
