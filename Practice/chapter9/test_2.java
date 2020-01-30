package learnJava;
import junit.framework.*;

class test_1{
	public static void main (String [] args)
	{
		System.out.print("Hello Paaji");
		testing_Gear();

	}

	public static void testing_Gear()
	{
		Gear gear = new Gear();
		gear.chainring = 52;
		gear.cog = 11;
		gear.rim = 26;
		gear.tire = 1.5f;
		assertEquals (116.0, gear.gear_inches();
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