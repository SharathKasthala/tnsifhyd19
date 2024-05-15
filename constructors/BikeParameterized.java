package constructors;

public class BikeParameterized {
	private String Keys;
	private String Stand;
	private String Helmet;
	private int speed;

	public BikeParameterized(String Keys, String Stand, String Helmet, int speed) {
		this.Keys = Keys;
		this.Stand = Stand;
		this.Helmet = Helmet;
		this.speed = speed;
		
		// TODO Auto-generated constructor stub
	}
	public void ready() {
		if(Keys.equals("On") && Helmet.equals("Yes") && speed == 0 && Stand.equals("Removed")) {
			System.out.println("Bike is ready to go");
			
		}
		else {
			System.out.println("Bike is not ready to go");
		}
	}

}
