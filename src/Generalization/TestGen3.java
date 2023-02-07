package Generalization;

public class TestGen3 
{
	public static void main(String[] args) 
	{

		System.out.println("---features of frist std------");
		First_std_Student f=new First_std_Student();
		f.stdname();
		f.stdid();
		f.std_dept();
		
		
		System.out.println("--------features of second std----------");
		Second_std_Student s=new Second_std_Student();
		s.stdname();
		s.stdid();
		s.std_dept();
		
		System.out.println("----------features of tred std--------");
		Third_Std_Student t=new Third_Std_Student();
		t.stdname();
		t.stdid();
		t.std_dept();
		
	}

}
