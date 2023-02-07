package User_Define_Contructor;

public class Demo7 
{
	int k;
	int l;
	int m;
	
	
	Demo7()
	{
		k=99;
		l=55;
		m=33;
	}
	public void add()
	{
		System.out.println(k+l+m);
	}
public static void main(String[] args)
{
	Demo7 d7=new Demo7();
	d7.add();
	
}
}
