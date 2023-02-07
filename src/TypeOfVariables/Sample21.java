package TypeOfVariables;

public class Sample21 

{
	
	int i=19;
	static int b=33;
	
	public static void main(String[] args) 
    {   // non_static var call from same class
		Sample21 s21=new Sample21();
	    System.out.println(s21.i);
	    
	    //static metod call from same class
	    test1();
	    
	    //non_static var call from diff class
	    Sample22 s22=new Sample22();
	    System.out.println(s22.a);
	    
	 //   System.out.println(a);
	    
	    //static var call from diff class
	 //   System.out.println(s22.j);
	    
	    // static var call from same class
	    System.out.println(b);
	    
	   // not_static metod call from diff class
	     Sample21 s11=new Sample21();
	     s11.test2();

	}
	
	public static void  test1()
	{
		System.out.println(b);
	}
	
	public void test2()
	{
		System.out.println(i);
	}
	
	
	 
	

}
