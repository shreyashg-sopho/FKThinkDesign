package learnJava;

public class Bicycleandmore_3 {
	public static void main (String []  args)
	{

	}
}

class Bicycle
{

String size = "S";
String chain = default_chain();
float tire_size = default_tire_size();


void spares()
	{
		tire_size = tire_size;
		chain = chain;
	}
  String default_chain()
 {
 	return "10-speed";
 }

 float default_tire_size()
 {
 	System.out.println("Error to be raised");
 	return 0;
 }
	
}

class Roadbike extends Bicycle{


	String tape_color ;

	float default_tire_size()
   {
 	return 23;

   }





}




class Mountainbike extends Bicycle{

	String front_shock;
	String rear_shock;
float default_tire_size()
 {
 	return 2.1f;

}

}