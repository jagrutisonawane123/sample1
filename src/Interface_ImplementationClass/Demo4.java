package Interface_ImplementationClass;

public class Demo4  implements Demo3
{
	public void n1()
	{
		System.out.println("method n1 is completed inimplementation class");
		
	}
	public void n2()
	{
		System.out.println("method n2 is completed inimplementation class");
		
	}
    public static void main(String[] args) 
    {
    	Demo4 d4=new Demo4();
    	d4.n1();
    	d4.n2();
		
	}
}
