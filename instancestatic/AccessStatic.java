package instancestatic;

public class AccessStatic {

	static int a=10;
	static String display(){
		return "Static method accessed";
	}

	public static void main(String[] args) {
		
		System.out.println(AccessStatic.a);// TODO Auto-generated method stub
		System.out.println(AccessStatic.display());
	}
}
