package This_Super_keywords;

public class Sample6 extends Sample5
{
	int c=66;
	
	public void m3()
	{
		int c=33;
		System.out.println(c);
		System.out.println(this.c);
		System.out.println(super.c);
		
	}
	public static void main(String[] args) 
	{
		Sample6 s6=new Sample6();
		s6.m3();
	}

}
