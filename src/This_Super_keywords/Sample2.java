package This_Super_keywords;

public class Sample2 extends Sample1
{
	int a=14;  //global variable
	public void m1() 
	{
		int a=12;//local variable
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
	}
public static void main(String[] args) 
{
	Sample2 s2=new Sample2();
	s2.m1();
	
}
}
