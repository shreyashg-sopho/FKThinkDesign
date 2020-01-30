package learnJava;
public class parts_1{
	public static  void main(String [] args)
	{
		Part chain = new Part();
		chain.name = "chain";
		chain.description = "10-speed";


		Part road_tire = new Part();
		road_tire.name = "road_tire";
		road_tire.description = "23";

		Part tape = new Part();
		tape.name = "Tape_color";
		tape.description = "red";


		Part rear_shock = new Part();
		rear_shock.name = "rear_shock";
		rear_shock.description = "fox";


		Part front_shock= new Part();
		front_shock.name = "front_shock";
		front_shock.description = "Manitou";
		front_shock.need_spare = false;


		
		
	}

class Bicycle{
	String size;
	Parts parts;

	void spares()
	{
		if (parts.spares() == true)
		{
			System.out.println("There is a need of spare object ");
		}
		else
			System.out.println("There is no need of spare object ");


	}
}

class Parts{
	Part part;

	boolean spares()
	{
		return part.need_spare();
	}

}


class Part{
	String name;
	String description;
	String need_spare = true;

}

