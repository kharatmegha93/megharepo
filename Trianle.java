
public class Trianle {

//	declare data member
		float b;
		float h;
		float area_t;
		
		void initialize()       //initialize data
		{
		b=15;
		h=12;
		}
		void area_t()
		{
//			area_t=(float)1/2*b*h;  
			System.out.println("area of triangle="+ area_t);
		}
		public static void main(String[] args) {
			Trianle t1=new Trianle();
			t1.initialize();
			t1.area_t();
			
		// TODO Auto-generated method stub

	}

}
