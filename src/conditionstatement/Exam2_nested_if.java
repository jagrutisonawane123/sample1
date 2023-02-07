package conditionstatement;

public class Exam2_nested_if
{
	public static void main(String[] args) 
	{
		int pem=333;
		if(pem>=222)
		{
			System.out.println("eligible for mains");
			int mem=333;
			
			if(mem>=444)
			{
				System.out.println("selected");
			}
			else
			{
				System.out.println("rejected");
			}
		}
		else
		{
			System.out.println("prilime rejected");
		}
		
	}

}
