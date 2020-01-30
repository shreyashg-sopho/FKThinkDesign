package learnJava;

class diameter_in_wheel_2{
	public static void main (String [] args)
	{
	Gear gear_obj = new Gear();
	//gear_obj.rim = 26;
	//gear_obj.tire = 1.5f;
	gear_obj.chainring= 52;
	gear_obj.cog = 11;
	Wheel wheel_obj = new Wheel();
	wheel_obj.rim = 26;
	wheel_obj.tire = 1.5f;
	gear_obj.wheel = wheel_obj;
	System.out.print(gear_obj.gear_inches()+ "\n");
	}
}

 class Gear {


	int chainring ;
	int cog;
	//int rim;
	//float tire;
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
		return rim + (tire*2);

	} 


	}