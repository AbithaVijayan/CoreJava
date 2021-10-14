package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		s.close();
	}

}
