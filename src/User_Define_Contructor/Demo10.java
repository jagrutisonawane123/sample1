package User_Define_Contructor;

public class Demo10
{
	int a;
	int b;
	
	
	Demo10()
	{
		a=6789;
		b=1234;
		
	}
	public void add()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		Demo10 d10=new Demo10();
		d10.add();
	}

}
