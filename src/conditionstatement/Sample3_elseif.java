package conditionstatement;

public class Sample3_elseif
{
	public static void main(String[] args) 
	{
		int marks=52;
		   //52>=66
		if (marks>=66)
		{
			System.out.println("Distintion");
		}
		//52>=60 52<=64
		else if (marks>=60 & marks<=64)
		{
		System.out.println("First Class");	
	    }
		//52>=50 52<=59
		else if(marks>=50 &marks<=59) 
		{
			System.out.println("second class");
			
		}
		else if (marks>=35 &marks<=49) 
		{
			System.out.println("pass");
			
		}
		else if(marks<35)
		{
			System.out.println("fail");
		}
		
		
	}

}
