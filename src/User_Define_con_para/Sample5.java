package User_Define_con_para;

public class Sample5
{
	
	int num1;
	int num2;
	
	
	Sample5(int a, int b)
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
		
		Sample5 s1=new Sample5(18,2);
		s1.add();
		
		Sample5 s2=new Sample5(20,2);
		s2.add();
		
		Sample6 s3=new Sample6(6,1);
		s3.mul();
		
	}
	

}
