package User_Define_Contructor;

public class Demo5 
{
	int a;
	int b;
	int c;
	
	Demo5()
	{
		
		a=77;
		b=66;
		c=55;
	}
	public void mul() 
	{
	System.out.println(a*b*c);	
	}
 public static void main(String[] args)
 {
	 Demo5 d5=new Demo5();
	 d5.mul();
	
}
}
