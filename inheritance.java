
public class inheritance {

public static void main (String [] args) {
		MountainBike mountainBike = new MountainBike(20 , 1 , 10);
		System.out.printf("Gear is : %d\n" ,mountainBike.gear);
		System.out.printf("Bike speed is : %d\n" ,mountainBike.speed);
		System.out.printf("Seat height is : %d\n" ,mountainBike.seatHeight);
		mountainBike.applyBrake(2);
		System.out.printf("Bike speed after applying brake is : %d\n" ,mountainBike.speed);
		
		
		
	}
}
