package Polymorprism_Overloading;

public class Demo4 
{
	public void sub(int a, int b)
	{
		System.out.println(a-b);
		
	}
	
	public void sub(int i,int j,int k) 
	{
		System.out.println(i-j-k);
	}
	public static void main(String[] args) 
	{
		Demo4 d4=new Demo4();
		d4.sub(89, 33);
		d4.sub(67, 33, 2);
		
	}

}
