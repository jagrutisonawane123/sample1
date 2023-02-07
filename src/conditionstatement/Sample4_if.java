package conditionstatement;

public class Sample4_if

{
	public static void main(String[] args)
	
	{
		
		float marks=22.88f;
		
		if (marks>=65) 
		{
			System.out.print("student is average with Distintion");
			
		}
		else if (marks>=60 & marks<=64)
		{
			System.out.println("student is frist class");
			
		}
		else if (marks>=50 & marks<=59) 
		{
			System.out.println("Student is second class");
			
		}
		else if (marks>=35 & marks<=49)
		{
			System.out.println("student is pass");
			
		}
		else
		{
			System.out.println("student is failed");
		}
			
			
			
			
	}

}
