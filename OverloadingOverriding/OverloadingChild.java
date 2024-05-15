package OverloadingOverriding;

public class OverloadingChild extends OverloadingParent{
    	String display() {
    		return " instance child method";
    	}
    	static String display(String x) {
    		return "Static child method";
 
    	}
}
