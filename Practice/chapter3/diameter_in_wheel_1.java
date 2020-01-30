package learnJava;

class diameter_in_wheel_1{
	public static void main (String [] args)
	{
	Gear gear_obj = new Gear();
	gear_obj.rim = 26;
	gear_obj.tire = 1.5f;
	gear_obj.chainring= 52;
	gear_obj.cog = 11;
	System.out.print(gear_obj.gear_inches()+ "\n");
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