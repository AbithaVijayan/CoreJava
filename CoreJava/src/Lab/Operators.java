package Lab;

public class Operators {

	public static void main(String[] args) {
		
		System.out.println("Increment and Decrement Operators");
		int x=10;
		System.out.println("x : "+x);
		System.out.println("X++ : "+(x++)+"\t++X : "+(++x)+"\tX-- : "+(x--)+"\t--X : "+(--x));
		//x=10, x++=11, ++x=12, x--=11, --x=10s
		
		System.out.println();
		
		System.out.println("Bitwise Complement Operator");
		int num=35;
		int res=~num;
		System.out.println("Complement of "+num+" : "+res);
		
		System.out.println();
		
		System.out.println("Arithmetic Operators");
		int a=12,b=5;
		System.out.println("a is "+a+"   b is "+b);
		System.out.println("a+b = "+(a+b)); //Addition
		System.out.println("a-b = "+(a-b)); //Subtraction
		System.out.println("a*b = "+(a*b)); //Multiplication
		System.out.println("a/b = "+(a/b)); //division
		System.out.println("a%b = "+(a%b)); //Modulus
		
		System.out.println();
		
		System.out.println("Relational Operators");
		int n1=7,n2=11;
		System.out.println("a is "+n1+"   b is "+n2);
		System.out.println("a==b : "+(n1==n2)); //is equal to
		System.out.println("a!=b : "+(n1!=n2)); //not equal to
		System.out.println("a>b : "+(n1>n2)); //greater than
		System.out.println("a<b : "+(n1<n2)); //less than
		System.out.println("a>=b : "+(n1>=n2)); //greater than or equal to
		System.out.println("a<=b : "+(n1<=n2)); //less than or equal to
		
		System.out.println();
		
		System.out.println("Bitwise Operators");
		
		
		System.out.println();
		System.out.println("Conditional Operators");
		int num1=5, num2=4, num3=7;
		System.out.println("a is "+num1+"   b is "+num2+"   c is "+num3);
		System.out.println("a>b && a<c : "+(num1>num2 && num1<num3));
		System.out.println("a>b || a<c : "+(num1>num2 || num1<num3));
		System.out.println("a>b && a>c : "+(num1>num2 && num1>num3));
		System.out.println("a>b || a>c : "+(num1>num2 || num1>num3));
		System.out.println("a>b && a>c || b<c : "+(num1>num2 && num1>num3 || num2<num3));
		System.out.println("(a<b || a>c) && b<c : "+((num1<num2 || num1>num3)&&num2<num3));
		
	}

}
