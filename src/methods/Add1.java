package methods;

public class Add1 

{
	public static void main(String[] args) 
	{
		add(23,11);
		add(12,44);
		add(13,44);
		
		System.out.println("-----------------");
		
		Add1 a1=new Add1();
		a1.div(8,4);
		a1.div(78,4);
		a1.div(88,4);
		a1.div(99,4);


		

		
	}
	public static void add(int a,int b)
	{
		System.out.println("addition of 2 num => "+(a+b));
		
	}
	public void div(int n1,int n2)
	{
		
		System.out.println("Division of 2 num =>"+(n1/n2));
		
	}

}
