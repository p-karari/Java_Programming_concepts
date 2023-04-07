
public class MountainBike extends Bicycle{
	int seatHeight;
	public MountainBike(int startSpeed , int startGear , int startHeight) {
		super(startSpeed , startGear);
		seatHeight = startHeight;
	}
	
	public void setHeight(int newValue){
		seatHeight = newValue;
	}

}
