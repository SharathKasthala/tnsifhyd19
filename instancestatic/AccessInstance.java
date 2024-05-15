package instancestatic;

public class AccessInstance {
	int a=10;
	int display(){
		return 7;
	}

	public static void main(String[] args) {
		AccessInstance a1=new AccessInstance();
		System.out.println(a1.display());
		System.out.println(a1.a);// TODO Auto-generated method stub

	}

}
