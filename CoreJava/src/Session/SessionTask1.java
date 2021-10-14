package Session;

import java.util.Scanner;

//Task 1
public class SessionTask1 {
	void polindrom(int n) {
		int r,rev=0;
		int m=n;
		while(n>0){
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(m==rev)
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number not a palindrome");
	}
	void pattern(int n) {
		int k=1;
		for(int i=0;i<=n;i++) {
			for(int j=i-1;j<n*2;j=j+1) {
				System.out.print("  ");
			}
			for(int j=0;j<i;j++) {
				System.out.print(k+"   ");
				k=k+1;	
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionTask1 pol=new SessionTask1();
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter number to check for palindrome");  
	    int num= sc.nextInt();   
		pol.polindrom(num);
		System.out.println();
		System.out.println("The pattern");
		pol.pattern(4);
		

	}
}
