package practice;
class car{
	String name;
	float price;
	int NoOfSeats;
	
}

public class PassByReference {
	public static void main(String args[]) {
	 car a=new car();
	 System.out.println("................*************************.................");
	 System.out.println("Before Assigning");
	 System.out.println(a.name);
	 System.out.println(a.NoOfSeats);
	 System.out.println(a.price);
	 
	 a.name="Maruthi";
	 a.NoOfSeats=6;
	 a.price=12.5f;
	 System.out.println("After Assigning");
	 System.out.println(a.name);
	 System.out.println(a.NoOfSeats);
	 System.out.println(a.price);
	 
	car b;
	b=a;
	System.out.println("................*************************.................");
	System.out.println("Second reference");
	System.out.println(b.name);
	System.out.println(b.NoOfSeats);
	System.out.println(b.price);
	System.out.println("This is knowm as pass by refernce");
		
	}
	
}
