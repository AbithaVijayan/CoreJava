package Lab;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		s.close();
		for(int d=2;d<n;d++) {
			if(n%d==0) {
				System.out.println("Not prime");
				return;
			}
		}
		
		System.out.println("prime");
	}
	
}
