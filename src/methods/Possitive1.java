package methods;

public class Possitive1 

{
	
	//non_static method call from same class
	
	public static void main(String[] args)
	
	{
		
     Possitive1 A1= new Possitive1(); //classname objectname=new classname();
                                    //syntax of object creation
     //step2= method call
     
     A1.P1();
     A1.P2(); // objectname.classname();
 
     //Posssitive1 =>  classname  => datatype 
     //A1   => object name => to identify/refer object
    
     //new => keywords =>to create blank or empty object
     //Possitive1() => constructor call => to copy all files to number of object
     
	
	}
  
	
	public  void P1()
	
	{
		System.out.println("running program on same class");
		
	}
		
		public void P2()
		{
			
			System.out.println("running non static program in same class");
		}
	
}
