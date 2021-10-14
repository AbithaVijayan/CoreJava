package Lab;

import Lab.InterfaceTest;
import Lab.Movable;
import Lab.Rollable;
import Lab.Vehicle;

public class InterfaceTest {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.move();
		System.out.println(v.isMovable());
		System.out.println(v.isRollable());
		
	}

}

interface Movable{
	int Average_Speed = 50; // auto public static and final
	void move();  //auto public and abstract
	boolean isMovable();
}
interface Rollable extends Movable{
	boolean isRollable();
}

class Vehicle extends InterfaceTest implements Rollable{

	@Override
	public void move() {
		System.out.println("Average Speed : "+Average_Speed);		
	}

	@Override
	public boolean isRollable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isMovable() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
