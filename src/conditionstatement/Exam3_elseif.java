package conditionstatement;

public class Exam3_elseif 
{
	public static void main(String[] args) 
	{
		int marks=34;
		if(marks>=65)
		{
			System.out.println("Distintion");
		}
		else if(marks>=60 & marks<=64)
		{
			System.out.println("first class");
		}
		else if(marks>=35 & marks<=59)
		{
			System.out.println("second class");
		}
		else if(marks>=35)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("failed");
		}
	}

	
	}


