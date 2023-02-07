package User_Define_con_para;

public class Sample15
{
	int num1;
	int num2;
	String name;
	

	
	Sample15()
	{
		num1=20;
		num2=30;
	}
	
	Sample15(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	Sample15(String s2)
	{
		
		name=s2;
	}
	public void add()
	{
		System.out.println(num1+num2);
		
	}
	public void studentname()
	{
		System.out.println(name);
	}
	
	public static void main(String[] args)
	{
		Sample15 s15=new Sample15();
		s15.add(); 
		
		System.out.println("------------");
		
		Sample15 s1=new Sample15(7,7);
		s1.add();
		System.out.println("----------");
		
		Sample15 s4=new Sample15("Rajnandini");
		s4.studentname();
		 
		System.out.println("--------");
		
		Sample16 s6=new Sample16();
		s6.mul();
				
				
	}

}
