package learnJava;

public class Bicycleandmore_4 {
	public static void main (String []  args)
	{
		
		Recumbentbike bent = new Recumbentbike();
		bent.flag = "tall and oranges";
		System.out.println(bent.tire_size);
		System.out.println(bent.chain);
		System.out.println(bent.flag);	}
}


class Bicycle{
	String size;
	String chain  = default_chain();
	String tire_size = default_tire_size();


	void spares()
	{
		tire_size = tire_size;
		chain = chain;
	}

	String default_tire_size()
	{
		System.out.print("Error Error Error !");
		return null;
	}

	void local_spares() 
	{
		tire_size = tire_size;
		chain = chain;
	}


	String default_chain()
	{
		return "10-speed";
	}
}


class Roadbike extends Bicycle{
	String tape_color;


	void local_spares()
	{
	tape_color = tape_color;
	}


	String default_tire_size()
	{
		return "23";
	}



}



class Mountainbike extends Bicycle{

	String front_shock;
	String rear_shock;

	void local_spares()
	{
	rear_shock = rear_shock;
	}


	String default_tire_size()
	{
		return "2.1";
	}


}


class Recumbentbike extends Bicycle{


	String flag;


	void local_spares()
	{
		flag = flag;
	}

	String default_chain()
	{
		return "9-speed";
	}

	String default_tire_size()
	{
		return "28";
	}

}






