package OverloadingOverriding;

public class OverridingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingParent obj=new OverridingChild();
		System.out.println(obj.display());
		System.out.println(OverridingChild.display1()); //instance method does not override
		
	}

}
