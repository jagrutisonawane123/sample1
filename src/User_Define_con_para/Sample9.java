package User_Define_con_para;

public class Sample9
{
	
	int num1;
	int num2;
	
	
	Sample9(int a, int b)
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
		
		Sample9 s1=new Sample9(1,0);
		s1.add();
		
		Sample9 s2=new Sample9(2,0);
		s2.add();
		
		Sample10 s3=new Sample10(7,23);
		s3.mul();
		
	}
	

}
