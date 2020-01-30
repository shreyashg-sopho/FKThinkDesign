package learnJava;
public class parts_1{
	public static  void main(String [] args)
	{
		System.out.println("Just checking if it compiles or not, and it did !");
		Bicycle roadbike = new Bicycle();
		roadbike.size = "L";
		roadbike.parts = new RoadBikeParts();
		roadbike.parts.tape_color = "red";
		System.out.println(roadbike.spares());
	}
}

class Bicycle{
	String size;
	Parts parts;

	void spares()
	{
		parts.spares();
	}
}

class Parts{
	String chain;
	String tire_size;

	void spares()
	{
		tire_size = tire_size;
		chain  = chain;
		System.out.println("tire_size is "+ tire_size + " chain is " + chain );
	}
	String default_tire_size()
	{
		System.out.println("Not implemented error");
		return null;
	}

	void local_spares()
	{
		System.out.println("Nothing in spare");
	}

	String default_chain()
	{
		return "10-speed";
	}


}




class RoadBikeParts extends Parts{
	String tape_color ;


	void local_spares()
	{
		System.out.println("tape_color "+ tape_color);
	}

	String default_tire_size()
	{
		return "23";
	}


class MountainBikeParts extends Parts{

	String front_shock;
	String rear_shock;

	void local_spares()
	{
	System.out.println("rear_shock  "+rear_shock);
	}

	String default_tire_size()
	{
		return "2.1";
	}
}








}
