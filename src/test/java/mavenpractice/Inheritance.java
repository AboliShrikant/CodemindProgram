package mavenpractice;


public class Inheritance {

	////*******************Hierarchical Inheritance
	
	public static void main(String[] args)
	{
		FourWheeler f=new FourWheeler();
		f.dooropeningmechanism();
		System.out.println(f.noofDoors);
		System.out.println(f.manufacturar);
		System.out.println(f.model);
		System.out.println(f.colour);
		System.out.println(f.Speed);
		
		System.out.println("********************************************");
		TwoWheeler t=new TwoWheeler();
		System.out.println(t.manufacturar);
		System.out.println(t.model);
		System.out.println(t.colour);
		System.out.println(t.Speed);
		
	}

}
class vehicle
{
	String manufacturar="mahindra";
	String model="xl 6";
	String colour="red";
	int Speed=120;
	
	public void changeGear()
	{
		System.out.println("Change Gear");
	}
	public void breaking()
	{
		
	}
}

class TwoWheeler extends vehicle
{
	String Handle;
}
class FourWheeler extends vehicle
{

	int noofDoors=2;
    public void dooropeningmechanism()
    {
    	System.out.println("Open Door by hydrolic System.");
    }
}
