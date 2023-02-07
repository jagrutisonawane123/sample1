package conditionstatement;

public class Sample12_else_if
{
	public static void main(String[] args) 
	{
		int marks=25;
		if (marks>=65)
		{
			System.out.println("Distintion");
		}
		else if (marks>=60 &marks<=64) 
			
	            {
				System.out.println("frist class");
				}
			    else if (marks>=40  &marks<=59)
			    {
			    	System.out.println("second class");
			    }
			    else if(marks>=35)
			    {
			    	System.out.println("pass");
			    }
			    else
			    {
			    	System.out.println("fail");
			    }
			}
		
		
	}


