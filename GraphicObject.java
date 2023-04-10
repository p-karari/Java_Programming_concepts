
public abstract class GraphicObject {
	
	int x;
	int y;
	
	//abstract classes in java support concrete methods , eg below
	void moveTo(int newX , int newY) {
		System.out.printf("move to x: %d anad y: %d" , x , y);
	}
	
	abstract void draw();
	abstract void resize();

}
