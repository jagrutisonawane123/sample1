package Polymorprism_Overloading;

public class Demo2 
{
	
	public void mul(int a, int b)
	{
		System.out.println(a*b);
		
	} 
	public void mul(int i,int j,int k) 
	{
		System.out.println(i*j*k);
		
	}
	
	public void name(int m, int n)
	{
		System.out.println(m*n);
		
	}
   public static void main(String[] args)
   {
	Demo2 d2=new Demo2();
	d2.mul(7, 4);
	d2.mul(22, 11, 11);
	d2.name(12, 11);
   }
}
