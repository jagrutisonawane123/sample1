package methods;

public class Parameter3 
{
	public static void main(String[] args) 
	
	{
		add(1,2,3);
		add(11,11,33);
		add(56,67,88);
		
		
		Parameter3 p1=new Parameter3();
		p1.mul(11,33);
		p1.mul(78,1);
		p1.mul(33,22);
		
		
	}
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
		
	}
	public void mul(int n1,int n2)
	{
		System.out.println(n1*n2);
	}

}
