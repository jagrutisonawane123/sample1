package User_Define_Contructor;

public class Demo6
{
	int n;
	int m;
	
	
	Demo6()
	{
		n=88;
		m=99;
	}
	public void T1()
	{
		System.out.println(n+m);
		
	}
	public void T2()
	{
		System.out.println(n*m);
		
	}
	public static void main(String[] args) 
	{
		Demo6 d6=new Demo6();
		d6.T1();
		d6.T2();
		
		
	}

}
