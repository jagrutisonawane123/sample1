package This_Super_keywords;

public class Sample4 extends Sample3
{
	int b=20;
	
	public void m2()
	{
		int b=30;
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(super.b);
	}
public static void main(String[] args)
{
	Sample4 s4=new Sample4();
	s4.m2();
	
	
}
}
