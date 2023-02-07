package User_Define_Contructor;

public class Demo2 

{
	int n1;
	int n2;
	
	Demo2()
	{
		n1=30;
		n2=22;
		
	}
	public void sub()
	{
		System.out.println(n1-n2);
		
	}
	public static void main(String[] args)
	{
		Demo2 d1=new Demo2();
		d1.sub();
	}

}
