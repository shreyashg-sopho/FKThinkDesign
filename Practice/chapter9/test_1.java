package learnJava;
import junit.framework.*;

class test_1{
	public static void main (String [] args)
	{
		System.out.print("Hello Paaji");
		testing_Wheel();

	}

	public static void testing_Wheel()
	{
		Wheel wheel = new Wheel();
		wheel.rime = 20;
		wheel.tire = 1.1f;
		assertEquals (22.2, wheel.diameter());
	}
}

 class Gear {


	int chainring ;
	int cog;
	int rim;
	float tire;


	float ratio()
	{
		return chainring/cog;
	}

	float gear_inches()
	{
		Wheel wheel = new Wheel();
		wheel.rim =rim;
		wheel.tire = tire;
		return ratio()*wheel.diameter();
	}
}


class Wheel {

	int rim;
	float tire;
			

	float diameter()
	{
		return rim + (tire*2);

	} 


	}