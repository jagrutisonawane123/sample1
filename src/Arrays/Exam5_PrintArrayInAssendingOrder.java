package Arrays;
import java.util.Arrays;
public class Exam5_PrintArrayInAssendingOrder 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[5];
		
		ar[0]=111;
		ar[1]=222;
		ar[2]=444;
		ar[3]=333;
		ar[4]=555;
		
		
		System.out.println(ar[2]);
		System.out.println(ar.length);
		
		System.out.println("-----print all data----");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		{
			System.out.println("====print array in asending order===");
			
			for(int i=0;i<=ar.length-1;i++)
		
			{
				System.out.println(ar[i]);
				
			}
				
			System.out.println("====print array in desending order===");
			{
				for(int i=ar.length-1;i>=0;i--)
				{
					System.out.println(ar[i]);
				}
			}
			
		}
		
	}

}
