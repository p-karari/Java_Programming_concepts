
public class Mbike implements Bycycle {
	private int speed;
	Mbike(int speed) {
		this.speed = speed;
	}
//	 public void setSpeed() {
//		 this.speed = speed;
//	 } 
	 
	 public int getSpeed() {
		 return speed;
	 }
	
//	 @override
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	
}
