package OverloadingOverriding;

public class OverridingChild extends OverridingParent {
	String display() {
		return "Parent static method";
	}
	static String display1(){
		return "Child static method";
	}

}
