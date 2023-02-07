package methods;

public class para2 

{
	
	public static void main(String[] args) 
	
	{
	//static method with parameter from same class
		para11(11,22);
		para11(33,44);
		para11(33,78);
		para11(33,48);
		para11(33,99);

      // static method without parameter from diff class
		para1.para55();
		
	    // non_static method with parameter from same class

        para2 p1=new para2();
	    p1.test1(23,10);
	    p1.test1(5,10);
	    p1.test1(2,10);
	    p1.test1(23,1);
	    p1.test1(33,10);
	      
	    // non_static method without parameter from diff class

	    
	    para1 p2=new para1();
	    p2.para66();
	    
	}
	
	public static void para11(int a, int b)
	{
		
		System.out.println(a+b);
	}
	
	public void test1(int n1, int n2)
	{
		
		System.out.println(n1*n2);
	}
	

}
