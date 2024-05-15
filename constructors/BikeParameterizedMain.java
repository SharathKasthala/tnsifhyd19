package constructors;

public class BikeParameterizedMain {
	public static void main(String[] args) {
		BikeParameterized bike1 = new BikeParameterized("On", "Removed", "Yes", 0);
		BikeParameterized bike2 = new BikeParameterized("Off", "not removed", "Yes", 0);
		
		bike1.ready();
		bike2.ready();
		
	}

}
