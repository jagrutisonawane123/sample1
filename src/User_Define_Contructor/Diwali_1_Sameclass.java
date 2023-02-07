package User_Define_Contructor;

public class Diwali_1_Sameclass 
{
	
	int n1;
	int n2;
	
	Diwali_1_Sameclass ()
	{
		n1=111;
		
		
		n2=222;
	}
	
	public void add()
	{
		System.out.println(n1+n2);
		
	}
	public void mul()
	{
		System.out.println(n1*n2);
		
	}
	public static void main(String[] args) 
	{
		Diwali_1_Sameclass d1=new Diwali_1_Sameclass();
		d1.add();
		d1.mul();
		
		
		Diwali_2_diffclass d2=new Diwali_2_diffclass ();
		d2.sub();
		
		
		
	}

}
