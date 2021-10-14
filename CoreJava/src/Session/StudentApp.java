package Session;

import java.util.Scanner;

//Task 2
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		int numstd=sc.nextInt();
		Student std[];
		std=new Student[numstd];
		
		int stdid,stdmarks;
		String stdname,stdcource;
		int k=0;
		for(int i=0;i<numstd;i++) {
			System.out.println("Enter Student "+(++k)+" details");
			stdid=sc.nextInt();
			stdname=sc.next();
			stdcource=sc.next();
			stdmarks=sc.nextInt();
			std[i]=new Student(stdid,stdname,stdcource,stdmarks);
		}
		System.out.println();
		System.out.println("Students having more than 60 marks from BCA course:\n ");
		for(int i=0;i<numstd;i++) {
			if(std[i].marks>60 && std[i].course.equals("BCA")) {
				System.out.println("Student Id : "+std[i].stid+"\tStudent Name : "+std[i].name+"\tCourse : "+std[i].course+"\tMarks : "+std[i].marks);
			}
		}
	}

}
