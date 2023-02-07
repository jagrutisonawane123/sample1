package User_Define_Contructor;

public class Diwali_3_Sameclass
{
	int b1;
	int b2;
	
	Diwali_3_Sameclass(int s1, int s2)
	
	{
		b1=s1;
		b2=s2;
	}
	public void add1()
	{
		System.out.println(b1+b2);
		
	}
	public static void main(String[] args)
	{
		Diwali_3_Sameclass d3=new Diwali_3_Sameclass(898,33);
		d3.add1();
		
		Diwali_4_Diffclass d4=new Diwali_4_Diffclass(12,22);
		d4.mul2();
	}
	
}
	

