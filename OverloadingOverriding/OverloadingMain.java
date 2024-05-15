package OverloadingOverriding;

public class OverloadingMain {

	public static void main(String[] args) {
		OverloadingParent b1=new OverloadingChild();
		System.out.println(b1.display());
		System.out.println(OverloadingChild.display("name"));		
	}

}
