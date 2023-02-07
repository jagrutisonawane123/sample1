package Default_Access_Specifiers;

public class Sample1 {


int a;  //Default Access Specifiers

Sample1()  //Default constructor Access Specifiers
{
	a=15;
}
void SquareOfNum() //Default  method Access Specifiers
{
	System.out.println(a*a);
}

public static void main(String[] args)
{
	Sample1 s1=new Sample1();
	s1.SquareOfNum();
	System.out.println(s1.a);
	
}
}