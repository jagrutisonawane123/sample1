package User_Define_con_para;

public class Sample13 

{
	
	int n1;
	int n2;
	
	Sample13(int a,int b)
	{
		n1=a;
		n2=b;
	}
	public void mul()
	{
		System.out.println(n1+n2);
    }
	
	public static void main(String[] args)
	{
		Sample13 s13=new Sample13(12,2);
		s13.mul();
		
		
		System.out.println("-------------");
		
		Sample14 s14=new Sample14(33,4);
		s14.add();
		
	}

}
