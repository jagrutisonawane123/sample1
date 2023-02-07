package UseOfStatic_Nonstatic;

public class Emp4 
{
	public static void main(String[] args) {
		
	
	
	Emp3 e3=new Emp3();
	e3.Stdname="veer";
	e3.stdid=11;
	e3.std_department="Computer";
	Emp3.stdprinciple="saatis";
	
	Emp3 e4=new Emp3();
	e4.Stdname="nilu";
	e4.stdid=12;
	e4.std_department="electrical";
	Emp3.stdprinciple="komal";
	
	e3.stdInfo();
	
	}
}
;
