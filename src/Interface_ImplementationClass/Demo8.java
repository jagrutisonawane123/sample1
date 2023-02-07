package Interface_ImplementationClass;

public class Demo8 implements Demo7
{
	
public void k1() 
{
	System.out.println("method k1 is completed in implementetion class");
	
	
	System.out.println(a);
}
public void k2() 
{
	System.out.println("method k2 is completed in implementetion class");
	
}
public static void main(String[] args)
{
	Demo8 d8=new Demo8();
	d8.k1();
	d8.k2();
	
}




}
