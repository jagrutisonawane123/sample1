package Generalization;

public class TestGen2 
{
	public static void main(String[] args)
	{
		System.out.println("----Features of SavingAccount--------");
		SavingAccount s=new SavingAccount();
		s.CW();
		s.CD();
		s.MT();
		
		System.out.println("----Features of CurrentAccount--------");
		CurrentAccount c=new CurrentAccount();
		c.CW();
		c.CD();
		c.MT();
		
		System.out.println("----Features of SallaryAccount--------");
		SallaryAccount s1=new SallaryAccount();
		s1.CW();
		s1.CD();
		s1.MT();
	}

}
