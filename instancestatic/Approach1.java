package instancestatic;

public class Approach1 {
	int a=10;
	static int b=20;
	void display() {
		System.out.println("instance method");
	}
	static String display1(){
		return "this is static method";
	}
	public static void main(String[] args) {
		int c=30;
		Approach1 a1=new Approach1();
		System.out.println(a1.a);
		a1.display();
		System.out.println(Approach1.b);
		System.out.println(Approach1.display1());
		System.out.println(c);
		
	}
}
