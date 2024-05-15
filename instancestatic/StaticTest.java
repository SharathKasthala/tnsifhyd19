package instancestatic;

public class StaticTest {
	int a=20;
	static int b=200;
	static void display() {
		System.out.println(a);
		//static method does not access instance variable
		System.out.println(b);
	}

	public static void main(String[] args) {
		StaticTest.display();

	}

}
