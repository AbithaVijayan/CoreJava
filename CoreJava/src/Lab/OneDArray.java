package Lab;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int add=0;
		for(int i:arr) {
			add += i;
		}
		System.out.println("Sum of array elements = "+add);
		s.close();
	}

}
