package learnJava;

public class Bicycleandmore_2 {
	public static void main (String []  args)
	{
		

	}
}


class Bicycle{

String chain = default_chain();
String tire_size = "44";
String  size;



String default_chain()
 {
 	return "10-speed";
 }

}


class Roadbike extends Bicycle
{
	String default_tire_size()
	{
		return "23";
	}
}

class MountainBike extends Bicycle
{
	String default_tire_size()
	{
		return "2.1";
	}
}