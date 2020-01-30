package learnJava;

class Gear
{
	int chainring;
	int cog;
	Wheel wheel = new Wheel();
	wheel.tire = tire;
	wheel.rim = rim;



	float ratio()
	{
		return chainring/cog;
	}

	float gear_inches()
	{
		return ratio * (tire * 2);
	}

}


class Wheel
{
	int rim;
	int tire;


	int diameter()
	{return rim + (tire*2);}
}



public class Gear_wheel{
	public static void main(String [] args)
	{

		System.out.println(" the code is compiling");
	}

}



