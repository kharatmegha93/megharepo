
public class Posinev {
	int a;
	
	void initialize()
	{
	a=-20;
	}
	void check()
	{
		if(a>0)
			System.out.println("positive number");
     	else
	        System.out.println("negative number");
	}
	public static void main(String[] args) {
		Posinev p1=new Posinev();
		p1.initialize();
		p1.check();
		// TODO Auto-generated method stub

	}

}
