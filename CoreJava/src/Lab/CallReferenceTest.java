package Lab;

public class CallReferenceTest {
	int i,j;
	public CallReferenceTest(int a,int b) {
		i=a;
		j=b;
	}
	
	public void show(CallReferenceTest n) {
		n.i *= 2;
		System.out.println(n.i);
		n.j += 2;
		System.out.println(n.j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallReferenceTest obj=new CallReferenceTest(10,20);
		obj.show(obj);
	}

}
