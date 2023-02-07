package User_Define_Contructor;

public class Demo1
{//step1:variable declaration
	
	int num1;
	int num2;
	
	//step2:variable initialization
	//user define constructor-->provided by user
	//use1:to initialize global variable
	//use2:to copy all the members of class into object
	Demo1() //without parameter or zero para 
	{
		num1=20;
		num2=40;
		
	}
    
	public void test1()
	{
		System.out.println(num1+num2);
	}
	
	public void test2()
	{
		System.out.println(num1*num2);
	}
	public static void main(String[] args)
	{
		Demo1 d1=new Demo1();
		d1.test1();
		d1.test2();
		
		System.out.println("---------------------");
		
		Demo1_diff d2=new Demo1_diff();
		d2.mul();
		d2.sub();
		d2.add();
	}
}
