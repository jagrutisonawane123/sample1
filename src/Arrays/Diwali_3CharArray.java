package Arrays;

public class Diwali_3CharArray 
{
	public static void main(String[] args)
	{
		char[] ar=new char[5];
		
		ar[0]='w';
		ar[1]='x';
		ar[2]='y';
		ar[3]='z';
		ar[4]='A';
		
		System.out.println(ar[4]);
		System.out.println(ar.length);
		
		System.out.println("----print all data----");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
