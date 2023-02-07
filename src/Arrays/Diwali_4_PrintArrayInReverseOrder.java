package Arrays;

public class Diwali_4_PrintArrayInReverseOrder 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[5];
		
		ar[0]=1111;
		ar[1]=2222;
		ar[2]=3333;
		ar[3]=4444;
		ar[4]=5555;
		
		System.out.println(ar.length);
		System.out.println(ar[4]);
		
		System.out.println("---print all data-----");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("---print revrese order----");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}

}
