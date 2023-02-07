package Private_Access_Specifiers;

public class Sample3 

{
	private int k;
	
	
	private Sample3()
	{
		k=33;
	}
	private void subofnum()
	
	{
		System.out.println(k-k);
	}
	public static void main(String[] args)
	{
		Sample3 s3=new Sample3();
		s3.subofnum();
		System.out.println(s3.k);
		
	}

}
