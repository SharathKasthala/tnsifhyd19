package instancestatic;

public class InstanceTest {
	int a=10;
	static int b=100;
	public  void display() {
		System.out.println(a);
		System.out.println(b);
		//instance method can access both instance and static variables
	}
	public static void main(String[] args) {
		InstanceTest I1=new InstanceTest();
		I1.display();

	}
}


