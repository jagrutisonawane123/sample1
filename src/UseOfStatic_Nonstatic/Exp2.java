package UseOfStatic_Nonstatic;

public class Exp2
{
	public static void main(String[] args)
	{
		Emp1 e1=new Emp1();
		e1.Empname="Rinku";
		e1.Empid=111;
		//e1.EmpCEOname="abc";
		Emp1.EmpCEOname="abc";
		
		Emp1 e2=new Emp1();
		e2.Empname="Dev";
		e1.Empid=112;
		//e2.EmpCEOname="abc";
		Emp1.EmpCEOname="abc";
		
		Emp1 e3=new Emp1();
		e3.Empname="komal";
		e3.Empid=113;
		//e3.EmpCEOname="xyz";
		Emp1.EmpCEOname="xyz";
		
		e1.EmpInfo();
		e2.EmpInfo();
		e3.EmpInfo();
		
		
		
		
		
	}

}
