package conditionstatement;

public class Sample9_else_if

{
	public static void main(String[] args) 
	{
		int marks=77;
		
		if (marks>=60)
		{
			System.out.println("distintion");
			
		}
		else if(marks>=60 & marks<=64)
		{
			System.out.println("Frist class");
		}
		else if (marks>=50 & marks<=59) 
		{
			System.out.println("second class");
			
		}
		else if (marks>=35 & marks<=49)
		{
			System.out.println("pass");
			
		}
		else 
	
		{
			System.out.println("fail");
		}
	}

}
