package User_Define_Contructor;

public class Demo9
{
	int a;
	int b;
	

	Demo9()
	{
		
		a=55;
		b=22;
		
	}
	public void mul()
	{
		System.out.println(a*b);
		
	}
	public static void main(String[] args)
	{
		Demo9 d9=new Demo9();
		d9.mul();
		
	}
}
