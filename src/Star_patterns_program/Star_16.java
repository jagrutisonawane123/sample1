package Star_patterns_program;

public class Star_16 
{
	public static void main(String[] args)
	{
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		int star=4;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<4)
			{
				star--;
				
			}
			else
			{
				star++;
			}
				
		}
		
	}

}