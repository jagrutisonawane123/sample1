package conditionstatement;

public class Sample1_nested_if
{
	public static void main(String[] args) 
	{
		int pm=450;
		
		if (pm>=400)//outer if
		{
			System.out.println("Student is eligible for mains");
			
			int mm=232;
			
			if (mm>=700)//inner or nested if
			{
				System.out.println("Student is applicable for job");
			}
			else
			{
				System.out.println("Student is rejected main exam marks<700");
			}
			
		}
		else
		{
			System.out.println("Student is not applicable for mains");
		}
		
	}

}
