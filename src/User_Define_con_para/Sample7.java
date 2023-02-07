package User_Define_con_para;

public class Sample7
{
	
	int num1;
	int num2;
	
	
	Sample7(int a, int b)
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
		
		Sample7 s1=new Sample7(1,20);
		s1.add();
		
		Sample7 s2=new Sample7(2,20);
		s2.add();
		
		Sample8 s3=new Sample8(7,2);
		s3.mul();
		
	}
	

}
