package conditionstatement;

public class Sample15_nested_if 
{
	public static void main(String[] args) 
	{
		
		int pem=544;
		if (pem>=400)
		{
			System.out.println("student is eligible for mains");
			
			int mem=700;
			if (mem>=600)
			{
				System.out.println("student is eligible for interview ");
				//char grade='A'; 
				float gradepoint=66.99f;
				//if(grade>='A')
				if (gradepoint>=50.00) 
				{
					System.out.println("Student is selected in SBI bank");
				}
				else
				{
					System.out.println("Rejecetd at all");
				}
			}
			else
			{
				System.out.println("student is Rejected mains exam");
			}
			
		}
		else
		{
			System.out.println("primary exam Rejected");
		}
		
	}

}
