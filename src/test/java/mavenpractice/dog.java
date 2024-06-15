package mavenpractice;

public class dog {

	//instance data member/variable
	float age=10.5f;
	float weight=13.6f;
	String Name="bobby";
	String colour="black";
	
	//instance member function/method
	public void bark()
	{
		System.out.println("Dog is barking");
	}
	
	public void eat()
	{
		System.out.println("Dog is eating");
	}
	
	public void run()
	{
		System.out.println("Dog is Running");

	}
	
	public static void main(String[] args)
	{
		dog d= new dog();
		System.out.println(d.colour); 
		System.out.println(d.age);
	System.out.println(d.Name);
	System.out.println(d.weight);
	
	d.bark();
	d.eat();
	d.run();
	}

}
