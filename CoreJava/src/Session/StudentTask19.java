package Session;
//Task 19
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentTask19 {

	int stid;
	String stname, email, mobile;

	public StudentTask19(int stid, String stname, String email, String mobile) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.email = email;
		this.mobile = mobile;
	}

	public void show() {
		System.out.println("Student ID : " + stid + "\tStudent Name : " + stname + "\tEmail : " + email + "\tMobile Number : " + mobile);
	}

	public void show1() {
		System.out.println("Student ID : " + stid + "\tStudent Name : " + stname + "\tEmail : " + email + "\tMobile Number : " + mobile);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String emailpat = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		StudentTask19[] St = new StudentTask19[5];
		System.out.println("Enter 5 Students Details (id, name, Email, Mob)");
		for (int i = 0; i < 5; i++) {
			int sid = sc.nextInt();
			String na = sc.next();
			String em = sc.next();
			String mob = sc.next();
			if (em.matches(emailpat) && mob.matches("\\+?\\d{10}"))
				St[i] = new StudentTask19(sid, na, em, mob);
			else {
				System.out.println("Invalid Email or Mobile Number!!!!!\nPlease check Email or Mobile Number");
				break;
			}
		}

		try {
			System.out.println();
			System.out.println("Students details whose Mobile Number starts with 98 ");
			System.out.println("********************************************************************************************");
			for (StudentTask19 std : St) {
				if (std.mobile.startsWith("98")) {
					std.show();
				}	
			}
			System.out.println("********************************************************************************************");
			int count = 0;
			System.out.println();
			System.out.println("Students Email ID from gmail");
			System.out.println("********************************************************************************************");
			for (StudentTask19 std : St) {
				Pattern p = Pattern.compile("@g(oogle)?mail\\.com$");
				Matcher m = p.matcher(std.email);
				if (m.find()) {	
					std.show();
				}	
				else {
					count++;
				}
			}
			System.out.println("********************************************************************************************");
			System.out.println("");
			System.out.println("Number of Students whose Email ID is not from gmail is : " + count);

		} catch (Exception e) {
			System.out.println(" make sure u had enter right mobNo and email");
		}
	}
}
