package User_Define_Contructor;

public class Demo8 
{
	int a;
	int b;
	
	
	Demo8()
	{
		a=44;
		b=66;
		
	}
	
	public void sub() 
	{
		System.out.println(b-a);
		
	}
public static void main(String[] args) 
{
	Demo8 d8=new Demo8();
	d8.sub();
	
}
}
