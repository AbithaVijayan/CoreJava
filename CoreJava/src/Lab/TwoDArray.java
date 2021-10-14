package Lab;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr[]={{1,2,3},{2,3,4}};
		int m=0;
		for(int i[] : arr) {
			int s=0;
			for(int j:i) {
				s += j;
			}
			m += s;
		}
		System.out.println(m);
	}

}
