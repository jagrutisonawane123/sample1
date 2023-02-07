package User_Define_con_para;

public class Sample3 
{
	
	int num1;
	int num2;
	
	
	Sample3(int a, int b)
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
		
		Sample3 s1=new Sample3(18,20);
		s1.add();
		
		Sample3 s2=new Sample3(20,20);
		s2.add();
		
		Sample4 s3=new Sample4(6,2);
		s3.mul();
		
	}
	

}
