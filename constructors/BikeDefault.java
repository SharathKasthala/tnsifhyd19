package constructors;

public class BikeDefault {
	private String Keys;
	private String Stand;
	private String Helmet;
	private int speed;

	
	public BikeDefault() {
		this.Keys = "On";
		this.Helmet = "Yes";
		this.speed = 0;
		this.Stand = "Removed";
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
