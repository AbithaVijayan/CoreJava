package Lab;

public class Room {
	int roomNo; 
	 String roomType; 
	 float roomArea; 
	 boolean acMachine; 
	 
	 void setData(int rno, String rt, float area, boolean ac) 
	 { 
	 roomNo = rno; 
	 roomType = rt; 
	 roomArea = area; 
	 acMachine = ac; 
	 } 
	 void displayData() 
	 { 
		 System.out.println("The room number : "+ roomNo); 
		 System.out.println ("The room Type : " + roomType); 
		 System.out.println ("The room area : " + roomArea); 
		 String s = (acMachine) ? "yes " : "no "; 
		 System.out.println ("AC Machine needed : "+ s); 
	 } 
	 public static void main(String arg[]) 
	{ 
	 Room room1 = new Room ( ); 
	 room1. setData (101, "Deluxe", 240.0f, true); 
	 room1.displayData ( ); 
	 } 
}
