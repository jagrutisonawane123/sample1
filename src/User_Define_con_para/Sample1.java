package User_Define_con_para;

public class Sample1 
{
	
	int num1;
	int num2;
	
	
	Sample1(int a, int b)
	{
		
		num1=a;
		num2=b;
		
	}
	public void add()
	{
	System.out.println(num1+num2);
	}
	
	public static void main(String[] args)
	{
		
		Sample1 s1=new Sample1(10,20);
		s1.add();
		
		Sample1 s2=new Sample1(40,20);
		s2.add();
		
		Sample2 s3=new Sample2(66,2);
		s3.mul();
		
	}
	

}
