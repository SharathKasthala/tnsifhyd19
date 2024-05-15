package packages;
import packages.RoyalEnfield.*;
import packages.Pulsar.*;
import packages.Activa.*;

public class MainBikes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoyalEnfield r=new RoyalEnfield();
		Pulsar p=new Pulsar();
		Activa a=new Activa();
		r.price();
		r.cc();
		r.colour();
		p.price();
		p.cc();
		p.colour();
		a.price();
		a.cc();
		a.colour();
	}

}
