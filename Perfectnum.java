
public class Perfectnum {
	int i;
	int n;
	int sum;
	void initialize()
	{ n=28;
		sum=0;
	}
	void perfect()
	{
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			sum=sum+i;
		}
		
		if(sum==n)
			System.out.println("perfect number");
		else
			System.out.println("Not perfect number");
	}
	
	public static void main(String[] args) {
		Perfectnum p1=new Perfectnum();
		p1.initialize();
		p1.perfect();
		

			// TODO Auto-generated method stub

	}

}
