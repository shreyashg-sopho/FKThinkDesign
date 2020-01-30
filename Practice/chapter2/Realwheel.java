package learnJava;

public class Realwheel
{
	public static void main (String [] args)
	{
		System.out.println("Hello There");
		Wheel wheel = new Wheel();
		wheel.rim = 26;
		wheel.tire = 1.5f;
		System.out.print(wheel.circumference() + "\n");

		Gear gear = new Gear();
		gear.chainring = 52;
		gear.cog = 11 ;
		gear.wheel = wheel;
		System.out.print(gear.gear_inches());
		System.out.print(gear.ratio());



	}

}

 class Gear {


	int chainring ;
	int cog;
	Wheel wheel;

	float ratio()
	{
		return chainring/cog;
	}

	float gear_inches()
	{
		return ratio()*wheel.diameter();
	}
}


class Wheel {

	int rim;
	float tire;



	float diameter()
	{
		return rim + (tire * 2);
	}

	float circumference()
	{
		return diameter() * 3.142f;
	}
}