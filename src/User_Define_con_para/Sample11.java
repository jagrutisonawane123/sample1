package User_Define_con_para;

public class Sample11
{
	int n;
	int m;
	
	Sample11(int a,int b)
	{
		n=a;
		m=b;
	}
	public void div() 
	{
		System.out.println(n/m);
	}
	
	public static void main(String[] args)
	{
		Sample11 s11 = new Sample11(66,11);
		s11.div();
		
		Sample12 s2 =new  Sample12(12,4);
		s2.mul();
		
	}

}

