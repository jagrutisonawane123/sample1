package Arrays;

public class Exam3_CharArray 
{
	public static void main(String[] args)
	{
		char[] cr=new char[5];
		
	cr[0]='A';
	cr[1]='C';
	cr[2]='B';
	cr[3]='D';
	cr[4]='E';
	
	System.out.println(cr[4]);
	System.out.println(cr.length);
	
	
	System.out.println("----print all data------");
	for(int i=0;i<=cr.length-1;i++)
		
	{
		System.out.println(cr[i]);
	}
		
	}

}
