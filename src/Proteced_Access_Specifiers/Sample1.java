package Proteced_Access_Specifiers;

import Protected_Access_Specifier.Sample2;

public class Sample1 extends Sample2 
{
	
	public static void main(String[] args) 
	{
	 Sample1 s2=new Sample1();
	 s2.SquareOfNum();
	 System.out.println(s2.a);
	}
}
