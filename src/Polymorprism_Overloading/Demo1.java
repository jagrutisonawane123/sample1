package Polymorprism_Overloading;

public class Demo1 
{
	
	//method overloading
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) 
	{
		System.out.println(a+b+c);
		
	}
	public static void main(String[] args) 
	{
		Demo1 d1= new Demo1();
		d1.add(3, 4, 6);
		d1.add(11, 11);
		
	}

}
