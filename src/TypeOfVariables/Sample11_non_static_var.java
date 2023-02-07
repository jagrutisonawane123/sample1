package TypeOfVariables;

public class Sample11_non_static_var 
{
	
	int i=10;
	
	public static void main(String[] args)
	{
	//non_static variable call from same class
		
		Sample11_non_static_var s11=new  Sample11_non_static_var ();
		 System.out.println(s11.i);
		
		 
	 //non_static variable call from diff class 
		 
		 Sample12 s12=new Sample12();
		 System.out.println(s12.b);
		 
		
	}

}
