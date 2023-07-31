
public class Maxnum {
	int n1;
	int n2;
	int n3;
	
	void initialize()
	{
		n1=10;
		n2=20;
		n3=30;
		
	}
	void max()
	{
	if(n1>=n2&&n1>=n3)
		System.out.println(n1 +"is the maximum number");
	else if(n2>=n1&&n2>=n3)
		System.out.println(n2 +"is the maximum number");
	else
     	System.out.println(n3 +"is the maximum number");
		
	}
	
	public static void main(String[] args) {
	   Maxnum m1=new Maxnum();
	   m1.initialize();
	   m1.max();
		// TODO Auto-generated method stub

	}

}
