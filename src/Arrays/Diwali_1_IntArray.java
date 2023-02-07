package Arrays;

public class Diwali_1_IntArray 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[5];
		
		ar[0]=11;
		ar[1]=12;
		ar[2]=14;
		ar[3]=15;
		ar[4]=13;
		
		System.out.println(ar[3]);
		System.out.println(ar.length);
		
		System.out.println("===print all data===");
		
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
