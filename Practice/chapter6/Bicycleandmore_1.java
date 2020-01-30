package learnJava;

public class Bicycleandmore_1 {
	public static void main (String []  args)
	{
		Bicycle bike = new Bicycle();
		bike.style = "mountain";
		bike.size = "S";
		bike.front_shock="Manitou";
		bike.rear_shock = "Fox";
		bike.spares();

	}
}


class Bicycle{

String style;
String size;
String tape_color;
String rear_shock;
String front_shock;


void spares()
{
	if (style == "road")
	{
		String chain = "10-speed";
		float tire_size = 23;
		tape_color = tape_color;
		System.out.println("chain : "+  chain + " tire_size : " + tire_size +  " tape_color : " + tape_color );
	}
	else
	{
		String chain = "10_speed";
		float tire_size = 2.1f;
		rear_shock = rear_shock;
		System.out.println("chain : "+  chain + " tire_size : " + tire_size + " rear_shock : " + rear_shock);
	}
	
}

}