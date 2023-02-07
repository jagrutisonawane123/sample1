package Multiple_Interface_Implemenation_class;

public class multiple_Sample1 implements Test1,Test2
{
public void m1()
{
	System.out.println("method m1 from test1 completed in IC");
	
}public void m2()
{
	System.out.println("method m2 from test1 completed in IC");
	
}public void m3()
{
	System.out.println("method m3 from test2 completed in IC");
	
}public void m4()
{
	System.out.println("method m4 from test2 completed in IC");
	
}
public static void main(String[] args) 
{
	multiple_Sample1 s1=new multiple_Sample1();
	s1.m1();
	s1.m2();
	s1.m3();
	s1.m4();
}
}
