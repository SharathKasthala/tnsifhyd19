package constructors;

public class ConstructorsExample {
	int num;
	public ConstructorsExample() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor called");
		num=7;
	}
	public static void main(String[] args) {
		ConstructorsExample obj = new ConstructorsExample();
		System.out.println(obj.num);
	}

}
