package methods;

public class Parameter1 
{
	
	//method call from without parameter
	public static void main(String[] args) 
	{
		para1();
		Parameter1 p1=new Parameter1();
		p1.para2();
		
		Parameter2.test2();
		Parameter2 p2=new Parameter2();
		p2.test3();
		
		
		
	}
	
	public static void para1()//without parameter
	
	{
		
		System.out.println("static method call from same");
		
	}
     
	
  public void para2()//without parameter
	
  
  
	{
		
		System.out.println("static method call from same");
		
	}

}
