package User_Define_Contructor;

public class Demo3 
{
	int a;
	int b;
	int c;
	
	
	Demo3()
	{
		a=60;
		b=20;
		c=30;
	}
	public void div()
	{
		System.out.println(a/b*c);
	}
public static void main(String[] args) 
{
	
	Demo3 d1=new Demo3();
	d1.div();
	
}
}
