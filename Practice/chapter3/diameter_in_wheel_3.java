package learnJava;

class diameter_in_wheel_3{
	public static void main (String [] args)
	{
	Wheel wheel = new Wheel();
	wheel.rim = 26;
	wheel.tire = 1.5f;
	wheel.chainring= 52;
	wheel.cog = 11;
	System.out.print(wheel.gear_inches()+ "\n");
	}
}

 class Gear {


	int chainring ;
	int cog;


	float ratio()
	{
		return chainring/cog;
	}

	float gear_inches(float diameter)
	{
		return ratio()*diameter;
	}
}


class Wheel {

	int rim;
	float tire;
	int chainring;
	int cog;
	Gear gear = new Gear();
	



	float diameter()
	{
		return rim + (tire * 2);
	}

	float gear_inches()
	{
		gear.chainring = chainring;
		gear.cog = cog;
		return gear.gear_inches(diameter());

	} 


	}