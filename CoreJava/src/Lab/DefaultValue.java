package Lab;

public class DefaultValue {
	
	int a;
	double b;
	float c;
	boolean d;
	String e;
	
	public void printValue() {
		System.out.println("int Default Value : "+ a);
		System.out.println("double Default Value : "+ b);
		System.out.println("float Default Value : "+ c);
		System.out.println("boolean Default Value : "+ d);
		System.out.println("String Default Value : "+ e);
	}
	
	public static void main(String[] args) {
		
		DefaultValue d = new DefaultValue();
		d.printValue();

	}

}
