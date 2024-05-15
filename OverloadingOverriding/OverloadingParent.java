package OverloadingOverriding;

public class OverloadingParent {
    String display() {
        return "Instance parent method";
    }
    
    static String display(int x) {
        return "Static parent method";
    }
    
}
