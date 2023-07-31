
public class Leapyear {
	int a;
	
	void initialize()
	{
	  a=2017;
	}
	void leap()
	
	{
	if(a%4==0)
		System.out.println("leap year");
	else
	
		System.out.println("not a leap year");
	}
	
	public static void main(String[] args) {
		
		Leapyear l1=new Leapyear();
		l1.initialize();
		l1.leap();
		// TODO Auto-generated method stub

	}

}
