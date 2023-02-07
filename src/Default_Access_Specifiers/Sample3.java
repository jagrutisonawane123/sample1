package Default_Access_Specifiers;

public class Sample3 
{
	int a;
	
	Sample3()
	{
		a=22;
	}
	void addofnum()
	{
		System.out.println(a+a);
	}
public static void main(String[] args)
{
	Sample3 s3=new Sample3();
	s3.addofnum();
	System.out.println(s3.a);
	
}
}
