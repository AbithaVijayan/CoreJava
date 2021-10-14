package Lab;

public class ControlStatements {

	public static void main(String[] args) {
		
		System.out.println("CONTROL STATEMENTS!!!");
		System.out.println();
		System.out.println("IF Statements");
		int a=10,b=25;
		if(a>b)
			System.out.println(a+" is greater");
		else
			System.out.println(b+" is greater");
		System.out.println();
		System.out.println("WHILE Statements");
		int i=1;  
	    while(i<=10){  
	        System.out.println(i);  
	    i++;  
	    } 
	    System.out.println();
	    System.out.println("FOR Statements");
	    for(int j=1;j<=10;j++) {
	    	System.out.println(j);
	    }
	    System.out.println();
	    System.out.println("DO WHILE Statements");
	    int k=1;
	    do {
            System.out.println(k);
            k++;
        } while (k<=10);
	}

}
