package methods;

public class Para11 

{ 
	public static void main(String[] args) 
	
	{
		para1();
		
		Para22.para3();
		
		Para22 p2=new Para22();
		p2.para4();
		
		
		
		
		
		Para11 p1=new Para11();
		p1.para2();
		
	}
     public static void para1()//methods call without parameter
     
     {
    	 System.out.println("running static method para1 are used from same class");
     }
     
      public void para2()//methods call without parameter)
      {
     	 System.out.println("running non_static method para2 are used from same class");

    	  
      }
}
