package Session;
//Task 2
public class Student {
	int stid;
	String name;
	String course;
	int marks;
	
	public Student(int stid, String name, String course, int marks) {
		this.stid = stid;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	
	public void show() {
		System.out.println( "Student ID : "+stid+"\tName : "+name+"\tCourse : "+course
				+"\tMarks : "+marks);
	}
}
