
public class Amstrong {

	public static void main(String[] args) {
		int n=135;
		int temp=n;
		int r,sum=0;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if(temp==sum)
			System.out.println("Amstrong number");
		else
			System.out.println("Not Amstrong number");

		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

	}

}
