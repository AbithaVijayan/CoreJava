package Session;

import java.util.Scanner;

//Task 13
public class EnumStudent {
	public static void main(String[] args) {
		Studentm s1 = new Studentm(11, "Abitha", Subject.JAVA, 600);
		Studentm s2 = new Studentm(12, "Saritha", Subject.CPP, 500);
		Studentm s3 = new Studentm(13, "Kavitha", Subject.C, 400);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subject to display Student Detials");
		Studentm sm[] = { s1, s2, s3 };
		String sub = sc.next().toUpperCase();
		//Subject s;
		System.out.println("Students Details");
		for (Studentm std : sm) {
			if (Subject.valueOf(sub)==(std.s)) {
				System.out.println("Student ID : "+std.stid+"\tStudent Name : " + std.stname + "\tSubject : " + std.s+"\tMarks:"+std.marks );
			}
		}

	}
}
class Studentm {
	int stid;
	String stname;
	Subject s;
	int marks;

	public Studentm(int stid, String stname, Subject s, int marks) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.s = s;
		this.marks = marks;
	}
}