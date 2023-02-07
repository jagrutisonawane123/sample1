package User_Define_Contructor;

public class Demo4
{
	int i;
	int j;
	
	
	Demo4()
	{
		i=44;
		j=55;
		
	}
	public void add()
	{
		System.out.println(i+j);
		
	}

	public static void main(String[] args) 
	{
		Demo4 d4=new Demo4();
		d4.add();
		
	}
}
